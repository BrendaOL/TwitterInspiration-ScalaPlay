package models
import javax.inject.Inject

@javax.inject.Singleton
class PostDao @Inject()() {

    var posts = Seq(
        Post(1,"La vie est belle #love","bol12","",60,0,"2021-12-01",Seq("love")),
        Post(2,"Puedes tener poco y ser rico","bol12","",0,0,"2021-12-05",Seq()),
        Post(3,"Make yourself a priority #love","bol12","",50,0,"2021-12-24",Seq("love")),
        Post(4,"Exams are right in the corner!","aladino","",100,0,"2021-12-30",Seq()),
        Post(5,"Too many projects!!! #stress #worry","aladino","",30,0,"2021-12-01",Seq("stress","worry")),
        Post(6,"Not for everyone","aladino","",20,1,"2021-12-02",Seq()),
        Post(7,"What does it mean? I don't understand french","joli89","",40,1,"2021-12-03",Seq()),
        Post(8,"I know!! :)","user45","",40,1,"2021-12-01",Seq()),
        Post(9,"Chill!, is just a bad day #stress #love","user45","",20,6,"2021-12-03",Seq("stress","love")),
        Post(10,"So.. what does it say? :'v","joli89","",10,6,"2021-12-10",Seq())
    )

    var hashtags = Seq("love","stress","worry","love","stress","love")

    // Brings all posts made
    def bringAllPosts: Seq[Post] = {
        posts.sortWith(_.datePost > _.datePost)
    }

    // Brings all posts made by a user
    def bringPosts(username: String): Seq[Post] = {
        posts.filter(_.userName == username).sortWith(_.datePost > _.datePost)
    }

    // Brings all posts from users that are followed
    def bringFollowedPosts(followedUser: Seq[FollowUser]): Seq[Post] = {
        var totalPost: Seq[Post] = Seq()
        followedUser.map(user => {
            totalPost = totalPost ++ posts.filter(_.userName == user.FollowUser)
        })
        totalPost.sortWith(_.datePost > _.datePost)
    }

    //bring post order by likes from users that are followed
    def bringFollowedPostsLikes(followedUser: Seq[FollowUser]): Seq[Post] = {
        var totalPost: Seq[Post] = Seq()
        followedUser.map(user => {
            totalPost = totalPost ++ posts.filter(_.userName == user.FollowUser)
        })
        totalPost.sortWith(_.like > _.like)
    }

    //bring post order by likes
    def bringAllPostsLikes: Seq[Post] = {
        posts.sortWith(_.like > _.like)
    }

    //Bring ID for the next post
    def getNextPost(): Int = {
        val OrderPost = posts.sortWith(_.idPost > _.idPost)
        val index = OrderPost.head
        index.idPost + 1
    }

    def insertNewPost(post: Post):Boolean = {
        val hash = searchHashtag(post.postText)
        hashtags = hashtags ++ hash
        posts = posts :+ Post(post.idPost, post.postText, post.userName, post.imagePost, post.like, post.idPostResponse, post.datePost, hash)
        true
    }

    def removePost(post: Int): Seq[Post] = {
        val newPosts = posts.filterNot(_.idPost == post)
        posts = newPosts
        posts
    }

    def incrementLike(idPost: Int): Post = {
        val foundPost = posts.find(_.idPost == idPost)
        foundPost match {
            case None => Post(idPost,"","","",0,0,"",Seq())
            case Some(post) => {
                // create new post
                val newPost = Post(idPost, post.postText,post.userName,post.imagePost,post.like + 1,post.idPostResponse,post.datePost,post.hashtag)
                // remove post
                val oldPost = posts.filterNot(_.idPost == idPost)
                // append post
                posts = oldPost :+ newPost
                newPost
            }
        }
    }

    def decreaseLike(idPost: Int): Post = {
        val foundPost = posts.find(_.idPost == idPost)
        foundPost match {
            case None => Post(idPost,"","","",0,0,"", Seq())
            case Some(post) => {
                // create new post
                val newPost = Post(idPost, post.postText,post.userName,post.imagePost,post.like - 1,post.idPostResponse,post.datePost, post.hashtag)
                // remove post
                val oldPost = posts.filterNot(_.idPost == idPost)
                // append post
                posts = oldPost :+ newPost
                newPost
            }
        }
    }

    def bringCommentPost(idPost: Int): Seq[Post] = {
        posts.filter(_.idPostResponse == idPost).sortWith(_.datePost < _.datePost)
    }

    // Extract all the words that begins with a '#'
    def searchHashtag(text :String): Seq[String] = {
        var hashtag:Seq[String] = Seq()
        var word = ""
        var found = false
        for(i <- text){
            if (found) {
                i match {
                    case ' ' => {if(!word.isEmpty) hashtag = hashtag :+ word
                        word = ""
                        found = false}
                    case ',' => {if(!word.isEmpty) hashtag = hashtag :+ word
                        word = ""
                        found = false}
                    case '.' => {if(!word.isEmpty) hashtag = hashtag :+ word
                        word = ""
                        found = false}
                    case _ => word = word + i
                }
            }
            if (i == '#') {
               found = true
            }
        }
        hashtag
    }

    //As a trends: we are only considering to bring 5 from the 20 last hashtag made
    def bringAllHashtag: Seq[String] = {
        val lastHashtagMade = hashtags.takeRight(20)
        lastHashtagMade.distinct.takeRight(5)
    }

    //Bring hashtag that begins with ..
    def bringHashtagBeginsWith(text:String): Seq[String] = {
        hashtags.filter(_.toLowerCase.startsWith(text.toLowerCase)).distinct.takeRight(10)
    }

    //bring post that follow a hashtag
    def bringTrendPost(text: String): Seq[Post] = {
        var postsTrend:Seq[Post] = Seq()
        posts.map(element => {
            val foundPost = element.hashtag.find(_ == text)
            foundPost match {
                case Some(_) => postsTrend = postsTrend :+ element
                case None =>
            }

        })
        postsTrend
    }
}



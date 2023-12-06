package models
import javax.inject.Inject

@javax.inject.Singleton
class LikePostDao @Inject()(){
  var likes = Seq(
    LikePost(1, "bol12"),
    LikePost(3, "joli89"),
    LikePost(3, "user45"),
    LikePost(1, "user45"),
    LikePost(4, "joli89")
  )

  //check if a post is liked by the user
  def checkLikePost(post: LikePost):Boolean = {
    //val foundLikes = likes.filter(_.userName == username)
    val foundLikes = likes.find(_ == post)
    foundLikes match {
      case Some(_) => true
      case None => false
    }
  }

  def likePost(post: LikePost): Unit = {
    likes = likes :+ post
  }

  def notLikePost(post: LikePost): Unit = {
    val newLikes = likes.filterNot(_ == post)
    likes = newLikes
  }


}


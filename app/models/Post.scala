package models

case class Post(
                  idPost: Int,
                  postText: String,
                  userName: String,//owner of the post
                  imagePost: String, //In case the post has an image, it's stored in base64
                  like: Int, // number of likes
                  idPostResponse: Int, // 0:it's no a post responding another one, else it is a post responding another one
                  datePost: String,
                  hashtag: Seq[String] // all the hashtag from the text
                  )

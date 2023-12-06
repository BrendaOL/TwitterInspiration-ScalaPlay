package models

import javax.inject.Inject

@javax.inject.Singleton
class SharePostDao @Inject()(){
  var shares = Seq(
    SharePost(4, "bol12"),
    SharePost(5, "bol12"),
    SharePost(4, "user45"),
    SharePost(1, "user45"),
    SharePost(4, "joli89")
  )

  //check if a post is shared by the user
  def checkSharePost(share: SharePost):Boolean = {
    val foundShares = shares.find(_ == share)
    foundShares match {
      case Some(_) => true
      case None => false
    }
  }

  def sharePost(share: SharePost): Unit = {
    shares = shares :+ share
  }

  def notSharePost(share: SharePost): Unit = {
    val newLikes = shares.filterNot(_ == share)
    shares = newLikes
  }

  def removePost(idPost:Int): Unit = {
    val newLikes = shares.filterNot(_.idPost == idPost)
    shares = newLikes
  }


}


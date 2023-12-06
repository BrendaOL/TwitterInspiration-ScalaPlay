package models
import javax.inject.Inject

@javax.inject.Singleton
class FollowUserDao @Inject()(){
  var followers = Seq(
    FollowUser("aladino", "bol12"),
    FollowUser("joli89", "bol12"),
    FollowUser("user45", "bol12"),
    FollowUser("bol12", "joli89"),
    FollowUser("bol12", "user45"),
    FollowUser("aladino", "user45"),
    FollowUser("aladino", "joli89")
  )

  // Brings all users
  //def findAll = followers.toList

  // Brings all users that a user is following
  def bringFollows(username: String): Seq[FollowUser] = {
    followers.filter(_.mainUser == username)
  }

  // Brings all users
  def bringUser(): Seq[FollowUser] = {
    followers.distinctBy(_.FollowUser)
  }

  //check if a user is followed
  def checkFollow(follow: FollowUser):Boolean = {
    val foundLikes = followers.find(_ == follow)
    foundLikes match {
      case Some(_) => true
      case None => false
    }
  }

  def followUser(follow: FollowUser): Unit = {
    followers = followers :+ follow
  }

  def notFollowUser(follow: FollowUser): Unit = {
    val newLikes = followers.filterNot(_ == follow)
    followers = newLikes
  }

}

package models

import javax.inject.Inject

@javax.inject.Singleton
class UserProfileDAO @Inject()() {

  var userProfiles = Seq(
      UserProfile("aladino", "I was accepted to study PhD in Applied Physics at Stanford, but I dropped out and partnered with my brother Kimbal to start a software company", "","Keep it clean"),
      UserProfile("bol12", "I'm a student of a master degree at VUB. I can help you so send me a message.", "","Love the world"),
      UserProfile("joli89", "I was born on April 3rd, 1972 in Urbana, Illinois, USA to John and Carolyn Garth, who both had 3 children each from different marriages.", "","Rest in peace GrandPa :("),
      UserProfile("user45", "I took the music, fashion and entertainment industries by storm. A talented artist with universal appeal, I've become an international star and media. kidding", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO9TXL0Y4OHwAAAABJRU5ErkJggg==","la la la love that song")
  )

  def getProfileFromID(username:String): UserProfile = {
    // return the profile is found else return an empty profile
    val foundProfile = userProfiles.find(element => {element.username == username})
    foundProfile match {
      case Some(userFound) => userFound
      case None => UserProfile(username,"","","")
    }
  }

  def lookupProfile(username:String): Boolean = {
    //Return true if the profile is found
    val foundUser = userProfiles.find(element => {element.username == username})
    foundUser match {
      case Some(_) => true
      case None => false
    }
  }

  def insertProfile(profile:UserProfile):Unit = {
    if (lookupProfile(profile.username)) {
      userProfiles.updated(userProfiles.indexOf(getProfileFromID(profile.username)),profile)
    } else {
      userProfiles = userProfiles :+ profile
    }
  }

  def insertProfileImage(username:String, avatar:String):UserProfile = {
    val oldProfile = userProfiles(userProfiles.indexOf(getProfileFromID(username)))
    val newProfile = UserProfile(username, oldProfile.content, avatar, oldProfile.phrase)
    userProfiles = userProfiles.updated(userProfiles.indexOf(getProfileFromID(username)),newProfile)
    newProfile
  }

  def insertProfileText(username:String, content:String, phrase:String):UserProfile = {
    val oldProfile = userProfiles(userProfiles.indexOf(getProfileFromID(username)))
    val newProfile = UserProfile(username, content, oldProfile.avatar, phrase)
    userProfiles = userProfiles.updated(userProfiles.indexOf(getProfileFromID(username)),newProfile)
    newProfile
  }

}

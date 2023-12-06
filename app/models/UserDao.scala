package models

import javax.inject.Inject

@javax.inject.Singleton
class UserDao @Inject()() {

    var users = Seq(
        User("Al","Aladino Ruiz","alumni@outlook.com","aladino", "1234"),
        User("Brenda","Ordonez Lujan","brenda@gmail.com","bol12", "bol12"),
        User("Jolie","Muniq Frida","frida@gmail.com","joli89", "joli89"),
        User("Raul","Cardenas Montes","montes@gmail.com","user45", "user45")
       // User("user","user")
    )

    // Brings all users
    def bringUsers: Seq[User] = {
        users
    }

    // Brings 10 users that begins with "certain" string
    def bringUsersBeginsWith(text:String): Seq[User] = {
        users.filter(_.username.toLowerCase.startsWith(text.toLowerCase)).take(10)
    }

    def validateUser(user: String, passwordUser: String): Boolean = {
        // a lazy search because username is the user key, so we don't need to search everything
        val foundUser = users.find(element => {element.username == user})
        foundUser match {
            case Some(userFound) => if(userFound.password == passwordUser) true else false
            case None => false
        }
    }

    def lookupUser(user: String): Boolean = {
        //Return true if user is found
        val foundUser = users.find(element => {element.username == user})
        foundUser match {
            case Some(userFound) => true
            case None => false
        }
    }

    def lookupEmail(email: String): Boolean = {
        //Return true if the email is found
        val foundUser = users.find(element => {element.email == email})
        foundUser match {
            case Some(_) => true
            case None => false
        }
    }

    def getUserFromID(username:String): User = {
        val foundUser = users.find(element => {element.username == username})
        foundUser match {
            case Some(userFound) => userFound
            case None => User("","","",username,"")
        }
    }

    def createUser(user: User): Boolean = {
        //if exist the username or the email then it's already created
        if (lookupUser(user.username) && lookupEmail(user.email)) false else {
            users = users :+ user
            true
        }
    }

}



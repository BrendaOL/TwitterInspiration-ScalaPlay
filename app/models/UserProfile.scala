package models

case class UserProfile(
                      username: String,
                      content: String,
                      avatar: String,//url of the image source
                      phrase: String
                      )

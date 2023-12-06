# Twitter Inspiration page with Scala Play
Implementation of a social networking web application (similar to Twitter) where users can post their thoughts so that other users can see, like, share or comment on them using Scala Play. The implementation of the application follows the Model-View-Controller pattern. For the development of the front-end of the web application, I used a free CSS template called Mundana[^1], whose design is intended for Blog page. The designs were adapted to be a social network page.

### _This project is an assignment of Software Architecture (2021-2022) course at the Vrije Universiteit Brussel, under the supervision of Dr. Coen De Roover._
---
### Key Design Features
The following aspects of the framework play were used:
- Sessions and Flash scope[^2]: A session variable was used to store the user name in order to restrict access to some features. The Flash scope was also configured in every view page to carry success and error messages for any updates.
- Protecting against Cross Site Request Forgery[^3]: CSRF tokens have been added to all requests using the Post method.
- Play's form[^4]: The Play's form feature was used for user registration on the platform (Sign Up). This form was chosen because it is easy to constraint data type entries. To validate the form we used the fold method, features defined by the framework play.
- Play’s body parser as a Form[^5]: For actions such as following a user, liking a post, writing a post, replying to a post among other actions defined in this web application, I chose to use the body parser as "FormUrlEncoded", for the simplicity that these actions require.
- Handling file upload[^6]: It was used for one feature of the user profile, which is the choice of profile picture. The process that was performed is to convert the image in base64 to be stored as text in the Profile model, this way the image is stored in the internal memory. The condition for this feature is to have the following path address: "D:/path". It depends on this space to complete the action. This solution was thought to have a backup of the files in a server space and not only in the database.


[^1]: https://www.free-css.com/free-css-templates/page272/mundana
[^2]: https://www.playframework.com/documentation/2.8.x/ScalaSessionFlash#How-it-is-different-in-Play
[^3]: https://www.playframework.com/documentation/2.8.x/ScalaCsrf
[^4]: https://www.playframework.com/documentation/2.8.x/ScalaForms
[^5]: https://www.playframework.com/documentation/2.8.x/JavaBodyParsers#The-default-body-parser
[^6]: https://www.playframework.com/documentation/2.8.x/ScalaFileUpload

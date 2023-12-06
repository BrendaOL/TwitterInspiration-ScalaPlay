/*
this are functions for all the views using Ajax
*/
function likePost(id){
    fetch("/likePostClick/" + id).then((response) => {
        return response.text();
    }).then((responseMessage) => {
        var likeButton = "like" + id
        const message = document.getElementById(likeButton);
        message.innerHTML = responseMessage;
    });
}

function followUser(id){
    fetch("/followUserClick/" + id).then((response) => {
            return response.text();
    }).then((responseMessage) => {
            const message = document.getElementById("followUserCheck");
            message.innerHTML = responseMessage;
    });
}

function sharePost(id) {
    fetch("/sharePostClick/" + id).then((response) => {
        return response.text();
    }).then((responseMessage) => {
        var shareButton = "share" + id
        const message = document.getElementById(shareButton);
        message.innerHTML = responseMessage;
    });
}

function showComment(id) {
    fetch("/showCommentClick/" + id).then((response) => {
        return response.text();
    }).then((responseMessage) => {
        var commentSection = "commentPost" + id
        const message = document.getElementById(commentSection);
        message.innerHTML = responseMessage;
    });
}

function commentReply(id) {
    var nameSection = "postReply" + id
    var divSection = document.getElementById(nameSection);
    if (divSection.style.display === "none") {
      divSection.style.display = "block";
    } else {
      divSection.style.display = "none";
    }
}

function submitReply(id) {
    var textReply = "textReply" + id
    var text = document.getElementById(textReply).value
    fetch("/submitReply/" + id + "/" + text).then((response) => {
            return response.text();
        }).then((responseMessage) => {
            document.getElementById(textReply).value = "";
            var commentSection = "commentPost" + id
            const message = document.getElementById(commentSection);
            message.innerHTML = responseMessage;
        });
}
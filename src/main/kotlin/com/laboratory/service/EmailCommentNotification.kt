package com.laboratory.service

import com.laboratory.model.Comment
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("email")
class EmailCommentNotification : CommmentNotificationProxy {

    override fun sendComment(comment: Comment) {
        println("Sending email from ${comment.author} ...")
    }

}
package com.laboratory.service

import com.laboratory.model.Comment
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier("push")
class PushCommmentNotification : CommmentNotificationProxy {

    override fun sendComment(comment: Comment) {
        println("Sending push notification from ${comment.author} ...")
    }

}
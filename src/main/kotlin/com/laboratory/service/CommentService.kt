package com.laboratory.service

import com.laboratory.model.Comment
import com.laboratory.repository.CommentRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
@Lazy
class CommentService(@Qualifier("oracle") val commentRepository: CommentRepository,
                     @Qualifier("push") val commmentNotificationProxy: CommmentNotificationProxy)  {

    init {
        println("CommentService created")
    }

    fun publishComment(comment: Comment) {
        commentRepository.storeComment(comment)
        commmentNotificationProxy.sendComment(comment)
    }

}
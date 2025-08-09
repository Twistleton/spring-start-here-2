package com.laboratory.service

import com.laboratory.model.Comment
import com.laboratory.repository.CommentRepository
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Lazy
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service

@Service
@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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
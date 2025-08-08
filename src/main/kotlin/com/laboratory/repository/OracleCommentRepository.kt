package com.laboratory.repository

import com.laboratory.model.Comment
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Lazy
import org.springframework.stereotype.Service

@Service
@Lazy
@Qualifier("oracle")
class OracleCommentRepository : CommentRepository {

    override fun storeComment(comment: Comment) {
        println("comment from ${comment.author} in Oracle saved ")
    }

}
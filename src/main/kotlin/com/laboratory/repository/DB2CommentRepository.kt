package com.laboratory.repository

import com.laboratory.model.Comment
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Repository

@Repository
@Qualifier("db2")
class DB2CommentRepository: CommentRepository {

    override fun storeComment(comment: Comment) {
        println("comment from ${comment.author} in DB2 saved ")
    }

}
package com.laboratory.repository

import com.laboratory.model.Comment

interface CommentRepository {
    fun storeComment(comment: Comment)
}
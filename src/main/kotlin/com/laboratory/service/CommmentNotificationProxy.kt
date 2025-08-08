package com.laboratory.service

import com.laboratory.model.Comment

interface CommmentNotificationProxy {
    fun sendComment(comment: Comment)
}
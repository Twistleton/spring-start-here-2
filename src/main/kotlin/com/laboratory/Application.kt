package com.laboratory

import com.laboratory.model.Comment
import com.laboratory.service.CommentService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	val context: ApplicationContext = runApplication<Application>(*args)

	// Get CommentService bean from context and call setComment method
	val commentService = context.getBean(CommentService::class.java)

	commentService.publishComment(Comment("Walk the dog", "Hugo"))
	

}

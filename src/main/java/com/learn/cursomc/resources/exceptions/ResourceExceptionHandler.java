package com.learn.cursomc.resources.exceptions;

import java.util.Date;

import javax.servlet.http.HttpServlet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.learn.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServlet request) {
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), new Date());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
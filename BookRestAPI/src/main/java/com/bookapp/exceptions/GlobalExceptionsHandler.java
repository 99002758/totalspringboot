package com.bookapp.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionsHandler extends ResponseEntityExceptionHandler{

	public GlobalExceptionsHandler() {
		// TODO Auto-generated constructor stub
	}

}

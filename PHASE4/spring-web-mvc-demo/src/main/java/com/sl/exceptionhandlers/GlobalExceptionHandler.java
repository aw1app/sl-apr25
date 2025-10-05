package com.sl.exceptionhandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = {ArrayIndexOutOfBoundsException.class})
	@ResponseBody
	public String expHandler() {

		return "INSIDE GlobalExceptionHandler AIOBE: Oops! something went wrong!";
	}

	@ExceptionHandler(value = {ArithmeticException.class})
	public String exceptionHandler() {
		return "arithmetic-exception-handler";// --> JSP File Name
	}

}

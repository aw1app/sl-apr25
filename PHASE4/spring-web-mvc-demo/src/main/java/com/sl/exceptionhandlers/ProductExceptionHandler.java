package com.sl.exceptionhandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sl.exceptions.ProductCreateException;

@ControllerAdvice
public class ProductExceptionHandler {

		
	@ExceptionHandler(value = ProductCreateException.class)
	@ResponseBody
	public String productBlank() {

		return "<h3 style='color:red'>Product name cannot be blank</h3>!";
	}

	

}

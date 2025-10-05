package com.sl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestExceptionController {

	@GetMapping("/1")
	@ResponseBody
	public String test1() {

		int x = 10;
		int y = 0;
		int result = x / y;

		return "test 1 success! tesult = " + result;
	}
	
	@GetMapping("/2")
	@ResponseBody
	public String test2() {

		int[] arr = {1,4,7};

		return "test 2 success! tesult = " + arr[3];
	}

	@ExceptionHandler(value = ArrayIndexOutOfBoundsException.class)
	@ResponseBody
	public String expHandler() {
		
		return "test 2: Oops! something went wrong!";
	}	
	
//	@ExceptionHandler(value = ArithmeticException.class)
//	@ResponseBody
//	public String expHandler() {
//		
//		return "Oops! somethingv went wrong!";
//	}

	// Task-2: Re-implement above @ExceptionHandler so that the response from it
	// comes from a JSP.
	@ExceptionHandler(value = ArithmeticException.class)
	public String exceptionHandler() {
		return "arithmetic-exception-handler";// --> JSP File Name
	}
	
	
	

}

package com.sl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/globaltest")
public class TestGlobalExceptionHandler {
	
	
	@GetMapping("/2")
	@ResponseBody
	public String test2() {

		int[] arr = {1,4,7};

		return "test 2 success! tesult = " + arr[3];
	}

}

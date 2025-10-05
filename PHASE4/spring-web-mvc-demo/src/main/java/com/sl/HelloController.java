package com.sl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {

		return "<h1>Hello World</h1>";
	}

	@GetMapping("/hello1")
	@ResponseBody
	public String hello1() {

		return "<h1>Hello World 1</h1>";
	}
	
	@GetMapping("/todaydatetime")
	@ResponseBody
	public String dateTime() {
	    LocalDateTime now = LocalDateTime.now();
	    return "<h2>Current Date and Time: " + now + "</h2>";
	}
	
	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello2"; // render /WEB-INF/views/hello2.jsp
	}

}

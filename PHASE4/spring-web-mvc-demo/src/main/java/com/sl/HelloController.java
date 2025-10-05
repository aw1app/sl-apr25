package com.sl;

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
	
	@GetMapping("/hello2")
	public String hello2() {

		return "hello2"; // render /WEB-INF/views/hello2.jsp
	}

}

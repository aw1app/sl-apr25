package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome() {
		
		return "Welcome Everyone!";
		
	}
	
	
	@GetMapping("/welcome1")
	public String sayWelcome1() {
		
		return "welcome"; // 
		
	}
			

}

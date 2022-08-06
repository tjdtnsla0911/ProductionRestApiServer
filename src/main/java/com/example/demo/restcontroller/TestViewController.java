package com.example.demo.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestViewController {
	
	@GetMapping("/")
	@ResponseBody
	public Object viewIntesTest() {
		System.err.println("########## OK ########");
		return "Test Ok!";
	}
}

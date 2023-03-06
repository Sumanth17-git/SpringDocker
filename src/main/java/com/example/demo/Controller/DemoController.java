package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class DemoController {

	@GetMapping("/demo")
	public String message()
	{
		return "This is Jenkins Pipeline container";
	}
	
}

package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String HelloWorld() {
		return "HelloWorld";
	}
	
	//world?variable=value
	
	@PostMapping("/world")
	public Hello helloWorld(@RequestParam String lastName, @RequestBody Hello input) {
		Hello h = new Hello();
		h.setFirstName(input.getFirstName() + "Resp");
		h.setLastName(input.getLastName() + "Resp");

//		h.setLastName(lastName);
		return h;
		
	}
}

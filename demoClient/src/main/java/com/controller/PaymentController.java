package com.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PaymentController {

	@GetMapping("/test")
	public String get() {
		return "it works";
	}
}

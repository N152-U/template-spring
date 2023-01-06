package com.ansm.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		System.out.println("Ejecutando");
		return "Home Page";
	}
}

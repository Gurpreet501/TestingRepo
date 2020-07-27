package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String getMessage() {
		return "Hello First API!!!";
	}

	
	@GetMapping("/")
	public String get() {
		return "Aws application deployed!!!";
	}
	
	@GetMapping("/gupi")
	public String gett() {
		return "well played!!!";
	}
	
	@GetMapping("/vijay")
	public String g() {
		return "well played too!!!";
	}
}

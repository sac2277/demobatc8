package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demobatch8Application {
	@GetMapping("/msg")
	public String getMessage() {
		return "welcome to C++ session ";
	}
	@GetMapping("/msg1")
	public String getMessage1() {
		return "welcome to java session ";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demobatch8Application.class, args);
	}

}

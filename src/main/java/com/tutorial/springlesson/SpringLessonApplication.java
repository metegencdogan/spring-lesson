package com.tutorial.springlesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //Spring boot default configuration
@RestController		   //It says this class contains some API's
public class SpringLessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLessonApplication.class, args);
	}

	@GetMapping("/")
	public String mainPage(){
		return "Welcome!";
	}

	// CRUD -> Create, Read, Update, Delete
	@GetMapping("/hello") // Read
	public String sayHello(){
		return "Hello, world!";
	}
}

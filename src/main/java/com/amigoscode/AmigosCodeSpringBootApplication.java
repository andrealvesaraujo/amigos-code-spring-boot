package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigosCodeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigosCodeSpringBootApplication.class, args);
	}

	@GetMapping
	public String helloWorld(){
		return "Hello World Spring Boot";
	}

}

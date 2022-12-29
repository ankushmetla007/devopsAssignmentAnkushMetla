package com.nagarro.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleProjectApplication {

	@GetMapping("/")
	public String home(){
		return "Hello, This is Nagarro Sample Spring Boot Project!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}

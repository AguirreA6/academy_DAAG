package com.academy_DAAG.epw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EpwApplication {

	@RequestMapping("/")
	String home() {
		return "Hello World! Spring Boot 4 está aquí.";
	}

	public static void main(String[] args) {
		SpringApplication.run(EpwApplication.class, args);
	}

}

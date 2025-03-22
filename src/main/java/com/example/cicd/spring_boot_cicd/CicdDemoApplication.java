package com.example.cicd.spring_boot_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdDemoApplication {

	@GetMapping("/welcome")
	public String greeting() {
		return "Hi, it's CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdDemoApplication.class, args);
	}

}

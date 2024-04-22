package com.efutures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PatientManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientManagementSystemApplication.class, args);
	}

	@GetMapping // Get something out of the server
	public String hello() {
		return "Welcome to Asiri Laboratories";
	}
}

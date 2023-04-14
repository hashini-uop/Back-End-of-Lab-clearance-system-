package com.system.labClearanceSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LabClearanceSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(LabClearanceSystemApplication.class, args);
	}

}

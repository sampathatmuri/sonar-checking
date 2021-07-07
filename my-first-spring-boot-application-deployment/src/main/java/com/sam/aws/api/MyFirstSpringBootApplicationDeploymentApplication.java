package com.sam.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstSpringBootApplicationDeploymentApplication {
	
	@GetMapping("/home")
	public String home() {
		return "My First Deployment is success!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringBootApplicationDeploymentApplication.class, args);
	}

}

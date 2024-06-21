package com.assetmanagement.specsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpecsenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecsenderApplication.class, args);
	}

}

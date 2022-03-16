package com.CameronPugh.RestAPILOTR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RequestMapping( consumes="application/json", produces = "application/json")

public class RestApiLotrApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiLotrApplication.class, args);
	}


}

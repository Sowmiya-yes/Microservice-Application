package com.app.userpostsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserPostsServicesApplication {

	@Bean
	public RestTemplate getRestTemplateSingletonObject() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserPostsServicesApplication.class, args);
	}

}

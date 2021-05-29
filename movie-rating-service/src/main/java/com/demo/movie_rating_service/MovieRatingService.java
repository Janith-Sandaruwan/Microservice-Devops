package com.demo.movie_rating_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieRatingService {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingService.class, args);
	}

}

package com.demo.movie_rating_service.controllers;

import com.demo.movie_rating_service.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
    @GetMapping("movieId")
    public Rating getRating(@PathVariable String movieId){
        return new Rating("1",8);
    }
}

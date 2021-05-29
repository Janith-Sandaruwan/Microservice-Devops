package com.demo.movie_rating_service.controllers;

import com.demo.movie_rating_service.models.Rating;
import com.demo.movie_rating_service.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating("1",8);
    }

    @GetMapping("/users/{userId}")
    public UserRating getRatings(@PathVariable int userId){
        return new UserRating(userId,Arrays.asList(
                new Rating("1",10),
                new Rating("2",8)
        ));
    }
}

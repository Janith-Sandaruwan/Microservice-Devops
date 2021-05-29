package com.demo.movie_info_service.controllers;

import com.demo.movie_info_service.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie("1","After");
    }
}

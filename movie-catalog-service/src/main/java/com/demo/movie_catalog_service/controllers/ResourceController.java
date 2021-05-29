package com.demo.movie_catalog_service.controllers;

import com.demo.movie_catalog_service.models.CatalogItem;
import com.demo.movie_catalog_service.models.Movie;
import com.demo.movie_catalog_service.models.Rating;
import com.demo.movie_catalog_service.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/catalog")
public class ResourceController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){

        UserRating ratings= restTemplate.getForObject("http://localhost:8082/api/ratings/users/"+userId, UserRating.class);

        return ratings.getRatings().stream().map(r->{
            Movie movie=restTemplate.getForObject("http://localhost:8081/api/movies/"+r.getMovieId(),Movie.class);
            return new CatalogItem(movie.getName(), "After movie", r.getRating());
        } ).collect(Collectors.toList());

    }
}

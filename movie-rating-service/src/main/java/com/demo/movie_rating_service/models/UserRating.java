package com.demo.movie_rating_service.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRating {
    private int userId;
    private List<Rating> ratings;
}

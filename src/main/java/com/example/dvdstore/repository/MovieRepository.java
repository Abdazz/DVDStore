package com.example.dvdstore.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.dvdstore.entity.Movie;

public class MovieRepository {
    public List<Movie> movies = new ArrayList<>();
    public void create(Movie movie){
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added");
    }
}

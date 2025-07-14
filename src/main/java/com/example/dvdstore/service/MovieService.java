package com.example.dvdstore.service;

import com.example.dvdstore.entity.Movie;
import com.example.dvdstore.repository.MovieRepository;

public class MovieService {

    public MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
        
        movieRepository.create(movie);
    }
}

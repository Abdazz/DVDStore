package com.example.dvdstore.service;

import com.example.dvdstore.entity.Movie;
import com.example.dvdstore.repository.GoLiveMovieRepository;
import com.example.dvdstore.repository.MovieRepository;

public class MovieService {

    public GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();

    public void registerMovie(Movie movie){
        
        movieRepository.create(movie);
    }
}

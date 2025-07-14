package com.example.dvdstore.controller;

import java.util.Scanner;

import com.example.dvdstore.entity.Movie;
import com.example.dvdstore.service.MovieService;

public class MovieController {

    MovieService movieService = new MovieService();

    public void addUsingConsole(){
        System.out.println("Quel est le titre du film ?");
		Scanner sc = new Scanner(System.in);
		String movieTitle = sc.nextLine();
		System.out.println("Quel est le genre du film ?");
		String movieGenre = sc.nextLine();
		sc.close();

		Movie movie = new Movie();
		movie.setTitle(movieTitle);
		movie.setGenre(movieGenre);

		movieService.registerMovie(movie);
    }
}

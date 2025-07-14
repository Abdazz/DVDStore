package com.example.dvdstore.core;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dvdstore.entity.Movie;
import com.example.dvdstore.service.MovieService;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CoreApplication.class, args);
		System.out.println("Quel est le titre du film ?");
		Scanner sc = new Scanner(System.in);
		String movieTitle = sc.nextLine();
		System.out.println("Quel est le genre du film ?");
		String movieGenre = sc.nextLine();
		sc.close();

		Movie movie = new Movie();
		movie.setTitle(movieTitle);
		movie.setGenre(movieGenre);

		MovieService movieService =  new MovieService();
		movieService.registerMovie(movie);
	}

}

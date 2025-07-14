package com.example.dvdstore.core;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dvdstore.controller.MovieController;
import com.example.dvdstore.entity.Movie;
import com.example.dvdstore.service.MovieService;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		// SpringApplication.run(CoreApplication.class, args);
		MovieController movieController = new MovieController();
		movieController.addUsingConsole();
	}

}

package com.example.dvdstore.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.example.dvdstore.entity.Movie;

public class GoLiveMovieRepository {

    public void create(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter("/home/abdazz/web/spring-boot-lab/movies.txt",true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
            System.out.println("The movie "+movie.getTitle()+" has been added");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

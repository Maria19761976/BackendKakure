package org.factoria.repository;

import org.factoria.model.Movie;
import java.util.List;

public interface MovieRepository {


    void create(Movie movie);


    List<Movie> findAll();


    Movie findById(int id);
}
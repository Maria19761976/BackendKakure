package org.factoria.repository;

import org.factoria.model.Movie;
import java.util.List;

public interface MovieRepository {
    void save(Movie movie);
    List<Movie> findAll();
    Movie findById(int id);
    void update(Movie movie);
    void delete(int id);
}
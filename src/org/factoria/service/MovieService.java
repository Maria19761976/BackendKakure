package org.factoria.service;

import org.factoria.model.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(int id);
    void addMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovie(int id);
}
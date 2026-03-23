package org.factoria.controller;

import org.factoria.model.Movie;
import org.factoria.repository.MovieRepository;
import org.factoria.repository.MovieRepositoryImpl;

import java.util.List;

public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController() {
        this.movieRepository = new MovieRepositoryImpl();
    }

    public void addMovie(String title, int year, int duration, String genre,
                         String studio, double rating, String poster, String synopsis) {
        Movie movie = new Movie(title, year, duration, genre, studio, rating, poster, synopsis);
        movieRepository.create(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id);
    }
}
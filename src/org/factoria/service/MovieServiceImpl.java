package org.factoria.service;

import org.factoria.model.Movie;
import org.factoria.repository.MovieRepository;
import org.factoria.repository.MovieRepositoryImpl;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private final MovieRepository repository = new MovieRepositoryImpl();

    @Override
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }

    @Override
    public Movie getMovieById(int id) {
        return repository.findById(id);
    }

    @Override
    public void addMovie(Movie movie) {
        repository.save(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        repository.update(movie);
    }

    @Override
    public void deleteMovie(int id) {
        repository.delete(id);
    }
}
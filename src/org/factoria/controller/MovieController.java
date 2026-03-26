package org.factoria.controller;

import org.factoria.model.Movie;
import org.factoria.service.MovieService;
import org.factoria.service.MovieServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    private final MovieService service = new MovieServiceImpl();

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return ResponseEntity.ok(service.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Movie movie = service.getMovieById(id);
        if (movie == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(movie);
    }

    @PostMapping
    public ResponseEntity<String> createMovie(@RequestBody Movie movie) {
        service.addMovie(movie);
        return ResponseEntity.status(HttpStatus.CREATED).body("Movie created successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        movie.setId(id);
        service.updateMovie(movie);
        return ResponseEntity.ok("Movie updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovie(@PathVariable int id) {
        service.deleteMovie(id);
        return ResponseEntity.ok("Movie deleted successfully");
    }
}
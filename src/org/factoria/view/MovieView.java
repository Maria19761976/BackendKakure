
package org.factoria.view;

import org.factoria.model.Movie;
import java.util.List;

public class MovieView {

    public void printAllMovies(List<Movie> movies) {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║         🎬 KAKURE ANIME — MOVIE LIST                 ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        if (movies.isEmpty()) {
            System.out.println("  ⚠️  No movies registered.");
        } else {
            for (Movie movie : movies) {
                printMovieDetails(movie);
            }
        }
        System.out.println("══════════════════════════════════════════════════════\n");
    }

    public void printMovieDetails(Movie movie) {
        System.out.println("──────────────────────────────────────────────────────");
        System.out.println("  🎥 ID       : " + movie.getId());
        System.out.println("  📌 Title    : " + movie.getTitle());
        System.out.println("  📅 Year     : " + movie.getYear());
        System.out.println("  ⏱️  Duration : " + movie.getDuration() + " min");
        System.out.println("  🎭 Genre    : " + movie.getGenre());
        System.out.println("  🏢 Studio   : " + movie.getStudio());
        System.out.println("  ⭐ Rating   : " + movie.getRating());
        System.out.println("  📝 Synopsis : " + movie.getSynopsis());
    }

    public void printMovieNotFound(int id) {
        System.out.println("⚠️  Movie with ID " + id + " not found.");
    }

    public void printSuccessMessage(String message) {
        System.out.println("✅ " + message);
    }

    public void printMenu() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║     🎬 KAKURE ANIME — MENU       ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║  1. Add movie                     ║");
        System.out.println("║  2. List all movies               ║");
        System.out.println("║  3. Search movie by ID            ║");
        System.out.println("║  0. Exit                          ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.print("Choose an option: ");
    }
}
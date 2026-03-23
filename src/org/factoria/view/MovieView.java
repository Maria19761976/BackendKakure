
package org.factoria.view;

import org.factoria.model.Movie;
import java.util.List;

public class MovieView {

    public void printAllMovies(List<Movie> movies) {
        System.out.println("\n╔══════════════════════════════════════════════════════╗");
        System.out.println("║         🎬 KAKURE ANIME — LISTADO DE PELÍCULAS       ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        if (movies.isEmpty()) {
            System.out.println("  ⚠️  No hay películas registradas.");
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
        System.out.println("  📌 Título   : " + movie.getTitle());
        System.out.println("  📅 Año      : " + movie.getYear());
        System.out.println("  ⏱️  Duración : " + movie.getDuration() + " min");
        System.out.println("  🎭 Género   : " + movie.getGenre());
        System.out.println("  🏢 Estudio  : " + movie.getStudio());
        System.out.println("  ⭐ Rating   : " + movie.getRating());
        System.out.println("  📝 Sinopsis : " + movie.getSynopsis());
    }

    public void printMovieNotFound(int id) {
        System.out.println("⚠️  Película con ID " + id + " no encontrada.");
    }

    public void printSuccessMessage(String message) {
        System.out.println("✅ " + message);
    }

    public void printMenu() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║     🎬 KAKURE ANIME — MENÚ       ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║  1. Añadir película               ║");
        System.out.println("║  2. Ver todas las películas       ║");
        System.out.println("║  3. Buscar película por ID        ║");
        System.out.println("║  0. Salir                         ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.print("Elige una opción: ");
    }
}
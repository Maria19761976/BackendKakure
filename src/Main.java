package org.factoria;

import org.factoria.config.DatabaseConnection;
import org.factoria.controller.MovieController;
import org.factoria.view.MovieView;
import org.factoria.model.Movie;

import java.util.List;
import java.util.Scanner;

public class
Main {

    public static void main(String[] args) {

        MovieController controller = new MovieController();
        MovieView view = new MovieView();
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != 0) {
            view.printMenu();

            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("⚠️  Por favor introduce un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    // CREATE — Añadir película
                    System.out.print("Título: ");
                    String title = scanner.nextLine();

                    System.out.print("Año: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.print("Duración (min): ");
                    int duration = Integer.parseInt(scanner.nextLine());

                    System.out.print("Género: ");
                    String genre = scanner.nextLine();

                    System.out.print("Estudio: ");
                    String studio = scanner.nextLine();

                    System.out.print("Rating (ej: 8.5): ");
                    double rating = Double.parseDouble(scanner.nextLine());

                    System.out.print("URL del poster: ");
                    String poster = scanner.nextLine();

                    System.out.print("Sinopsis: ");
                    String synopsis = scanner.nextLine();

                    controller.addMovie(title, year, duration, genre, studio, rating, poster, synopsis);
                    view.printSuccessMessage("Película '" + title + "' añadida correctamente.");
                    break;

                case 2:
                    // READ — Ver todas las películas
                    List<Movie> movies = controller.getAllMovies();
                    view.printAllMovies(movies);
                    break;

                case 3:
                    // READ by ID — Buscar por ID
                    System.out.print("Introduce el ID de la película: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Movie found = controller.getMovieById(id);
                    if (found != null) {
                        view.printMovieDetails(found);
                    } else {
                        view.printMovieNotFound(id);
                    }
                    break;

                case 0:
                    System.out.println("👋 ¡Hasta luego! Cerrando KakureAnime...");
                    break;

                default:
                    System.out.println("⚠️  Opción no válida.");
            }
        }

        scanner.close();
        DatabaseConnection.closeConnection();
    }
}
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
                System.out.println("⚠️  Please enter a valid number.");
                continue;
            }

            switch (option) {
                case 1:
                    // CREATE — Add movie
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    System.out.print("Duration (min): ");
                    int duration = Integer.parseInt(scanner.nextLine());

                    System.out.print("Genre: ");
                    String genre = scanner.nextLine();

                    System.out.print("Studio: ");
                    String studio = scanner.nextLine();

                    System.out.print("Rating (e.g. 8.5): ");
                    double rating = Double.parseDouble(scanner.nextLine());

                    System.out.print("Poster URL: ");
                    String poster = scanner.nextLine();

                    System.out.print("Synopsis: ");
                    String synopsis = scanner.nextLine();

                    controller.addMovie(title, year, duration, genre, studio, rating, poster, synopsis);
                    view.printSuccessMessage("Movie '" + title + "' added successfully.");
                    break;

                case 2:
                    // READ — List all movies
                    List<Movie> movies = controller.getAllMovies();
                    view.printAllMovies(movies);
                    break;

                case 3:
                    // READ by ID — Search by ID
                    System.out.print("Enter movie ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Movie found = controller.getMovieById(id);
                    if (found != null) {
                        view.printMovieDetails(found);
                    } else {
                        view.printMovieNotFound(id);
                    }
                    break;

                case 0:
                    System.out.println("👋 Goodbye! Closing KakureAnime...");
                    break;

                default:
                    System.out.println("⚠️  Invalid option.");
            }
        }

        scanner.close();
        DatabaseConnection.closeConnection();
    }
}
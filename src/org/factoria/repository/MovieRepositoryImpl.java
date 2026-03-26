package org.factoria.repository;

import org.factoria.config.DatabaseConnection;
import org.factoria.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl implements MovieRepository {

    private final Connection connection;

    public MovieRepositoryImpl() {
        this.connection = DatabaseConnection.getConnection();
    }

    @Override
    public void save(Movie movie) {
        String sql = "INSERT INTO movies (title, year, duration, genre, studio, rating, poster, synopsis) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, movie.getTitle());
            stmt.setInt(2, movie.getYear());
            stmt.setInt(3, movie.getDuration());
            stmt.setString(4, movie.getGenre());
            stmt.setString(5, movie.getStudio());
            stmt.setDouble(6, movie.getRating());
            stmt.setString(7, movie.getPoster());
            stmt.setString(8, movie.getSynopsis());
            stmt.executeUpdate();
            System.out.println("✅ Movie saved to the database.");
        } catch (SQLException e) {
            System.err.println("❌ Error inserting movie: " + e.getMessage());
        }
    }

    @Override
    public List<Movie> findAll() {
        List<Movie> movies = new ArrayList<>();
        String sql = "SELECT * FROM movies";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                movies.add(mapResultSetToMovie(rs));
            }
        } catch (SQLException e) {
            System.err.println("❌ Error reading movies: " + e.getMessage());
        }
        return movies;
    }

    @Override
    public Movie findById(int id) {
        String sql = "SELECT * FROM movies WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return mapResultSetToMovie(rs);
            }
        } catch (SQLException e) {
            System.err.println("❌ Error searching movie by ID: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void update(Movie movie) {
        String sql = "UPDATE movies SET title=?, year=?, duration=?, genre=?, studio=?, rating=?, poster=?, synopsis=? WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, movie.getTitle());
            stmt.setInt(2, movie.getYear());
            stmt.setInt(3, movie.getDuration());
            stmt.setString(4, movie.getGenre());
            stmt.setString(5, movie.getStudio());
            stmt.setDouble(6, movie.getRating());
            stmt.setString(7, movie.getPoster());
            stmt.setString(8, movie.getSynopsis());
            stmt.setInt(9, movie.getId());
            stmt.executeUpdate();
            System.out.println("✅ Movie updated in the database.");
        } catch (SQLException e) {
            System.err.println("❌ Error updating movie: " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM movies WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Movie deleted from the database.");
        } catch (SQLException e) {
            System.err.println("❌ Error deleting movie: " + e.getMessage());
        }
    }

    private Movie mapResultSetToMovie(ResultSet rs) throws SQLException {
        return new Movie(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getInt("year"),
                rs.getInt("duration"),
                rs.getString("genre"),
                rs.getString("studio"),
                rs.getDouble("rating"),
                rs.getString("poster"),
                rs.getString("synopsis")
        );
    }
}
package org.factoria.repository;

import org.factoria.config.DatabaseConnection;
import org.factoria.model.Movie;
import java.sql.*;
import java.util.*;

public class MovieRepositoryImpl implements MovieRepository {

    public void create(Movie m) {
        String sql = "INSERT INTO movies (title,year,duration,genre,studio,rating,poster,synopsis) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, m.getTitle());
            ps.setInt(2, m.getYear());
            ps.setInt(3, m.getDuration());
            ps.setString(4, m.getGenre());
            ps.setString(5, m.getStudio());
            ps.setDouble(6, m.getRating());
            ps.setString(7, m.getPoster());
            ps.setString(8, m.getSynopsis());
            ps.executeUpdate();
            System.out.println("Pelicula creada :)");
        } catch (SQLException e) {
            System.out.println("Error create: " + e.getMessage());
        }
    }

    public List<Movie> findAll() {
        List<Movie> list = new ArrayList<>();
        try {
            Statement st = DatabaseConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM movies");
            while (rs.next()) list.add(mapRow(rs));
        } catch (SQLException e) {
            System.out.println("Error findAll: " + e.getMessage());
        }
        return list;
    }

    public Movie findById(int id) {
        try {
            PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement("SELECT * FROM movies WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return mapRow(rs);
        } catch (SQLException e) {
            System.out.println("Error findById: " + e.getMessage());
        }
        return null;
    }

    private Movie mapRow(ResultSet rs) throws SQLException {
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
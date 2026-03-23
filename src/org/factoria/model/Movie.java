
package org.factoria.model;

public class Movie {
    private int id;
    private String title;
    private int year;
    private int duration;
    private String genre;
    private String studio;
    private double rating;
    private String poster;
    private String synopsis;

    // Constructor vacío
    public Movie() {}

    // Constructor sin id (para crear)
    public Movie(String title, int year, int duration, String genre,
                 String studio, double rating, String poster, String synopsis) {
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.studio = studio;
        this.rating = rating;
        this.poster = poster;
        this.synopsis = synopsis;
    }

    // Constructor completo
    public Movie(int id, String title, int year, int duration, String genre,
                 String studio, double rating, String poster, String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.duration = duration;
        this.genre = genre;
        this.studio = studio;
        this.rating = rating;
        this.poster = poster;
        this.synopsis = synopsis;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getPoster() { return poster; }
    public void setPoster(String poster) { this.poster = poster; }

    public String getSynopsis() { return synopsis; }
    public void setSynopsis(String synopsis) { this.synopsis = synopsis; }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", duration=" + duration + " min" +
                ", genre='" + genre + '\'' +
                ", studio='" + studio + '\'' +
                ", rating=" + rating +
                '}';
    }
}
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

    public Movie(int id, String title, int year,
                 int duration, String genre, String studio,
                 double rating, String poster, String synopsis) {
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

    public int    getId()        { return id; }
    public String getTitle()     { return title; }
    public int    getYear()      { return year; }
    public int    getDuration()  { return duration; }
    public String getGenre()     { return genre; }
    public String getStudio()    { return studio; }
    public double getRating()    { return rating; }
    public String getPoster()    { return poster; }
    public String getSynopsis()  { return synopsis; }

    public void setTitle(String t)    { title = t; }
    public void setYear(int y)        { year = y; }
    public void setDuration(int d)    { duration = d; }
    public void setGenre(String g)    { genre = g; }
    public void setStudio(String s)   { studio = s; }
    public void setRating(double r)   { rating = r; }
    public void setPoster(String p)   { poster = p; }
    public void setSynopsis(String s) { synopsis = s; }
}
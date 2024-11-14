package movie.database;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private String title;
    private String genre;
    private String plot;
    private String director;
    private double rating;
    private ArrayList<Actor> actors;
    private static ArrayList<String> genres = new ArrayList<>(Arrays.asList("Drama", "Comedy", "Adventure", "Crime", "Action"));


    //Constructor
    public Movie(String title, String genre, String plot, String director, double rating, ArrayList<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.plot = plot;
        this.director = director;
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            this.rating = 0.0;
            System.out.println("Rating is invalid.\n");
        }
        this.actors = actors;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlot() {
        return plot;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    // Setters
    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.\n");
            return;
        }
        this.rating = rating;
    }

    public void setTitle(String title) {
        if (title.isBlank()) {
            System.out.println("Title cannot be empty.\n");
            return;
        }
        this.title = title;
    }

    public void setGenre(String genre) {
        if (genre.isBlank()) {
            System.out.println("Genre cannot be empty.\n");
            return;
        }
        for (String genreName : genres) {
                if (genreName.equalsIgnoreCase(genre)) {
                    this.genre = genreName;
                    return;
                }
        }
        System.out.println("Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre.\n");
    }

    public void setPlot(String plot) {
        if (plot.isBlank()) {
            System.out.println("Plot cannot be empty.\n");
            return;

        }
        this.plot = plot;
    }

    public void setDirector(String director) {
        if (director.isBlank()) {
            System.out.println("Director cannot be empty.\n");
            return;
        }
        this.director = director;
    }

    public void addNewActor(Actor actor) {
        if (findActorInMovie(actor)) {
            System.out.println("Actor already in the array.\n");
            return;
        }
        actors.add(actor);
    }

    public static void addGenre(String genre) {
        if (genre.isEmpty()) {
            System.out.println("Genre cannot be empty.\n");
            return;
        }

        for (String genreName : genres) {
            if (genreName.equalsIgnoreCase(genre)) {
                System.out.println("Genre already exists\n");
                return;
            }
        }
        genres.add(genre);
    }

    public void displayMovieInfo() {
        System.out.println(Colors.GOLD_YELLOW + "Printing properties of Movie:" + Colors.BRIGHT_RED + title + Colors.BRIGHT_RED);
        System.out.println(Colors.DARK_GREEN + "Genre" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + genre) ;
        System.out.println(Colors.DARK_GREEN + "Rating" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + rating);
        System.out.println(Colors.DARK_GREEN + "Plot" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + plot);
        System.out.println(Colors.DARK_GREEN + "Director" + Colors.GOLD_YELLOW + ": " + Colors.BRIGHT_BLUE + director );
        System.out.println(Colors.DARK_GREEN + "Actors" + Colors.GOLD_YELLOW + ": " + Colors.PASTEL_GREEN +  actors );
        System.out.println(Colors.DARK_TEAL + "==================================\n" + Colors.GOLD_YELLOW);
    }

    public static void displayAllGenres() {
        System.out.println(Colors.PASTEL_BLUE + "All genres supported in this datbase: " + genres + "\n");
    }

    public boolean findActorInMovie(Actor actor) {
       return (actors.contains(actor));
    }
}
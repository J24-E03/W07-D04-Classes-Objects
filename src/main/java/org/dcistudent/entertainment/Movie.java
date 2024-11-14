package org.dcistudent.entertainment;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private String plot;
    private String director;
    private Double rating;
    private ArrayList<Actor> actors = new ArrayList<>();
    private static final ArrayList<String> genres = new ArrayList<>(
        List.of("Action", "Adventure", "Comedy", "Crime", "Drama")
    );

    /**
     * Creates a new movie.
     *
     * @param title the title of the movie
     * @param genre the genre of the movie
     * @param plot the plot of the movie
     * @param director the director of the movie
     * @param rating the rating of the movie
     * @param actors the actors in the movie
     */
    public Movie(
        String title, String genre, String plot, String director, Double rating, List<Actor> actors)
    {
        this.title = title;
        this.genre = genre;
        this.plot = plot;
        this.director = director;
        this.rating = this.setRating(rating);
        this.actors.addAll(actors);
    }

    /**
     * Gets the title of the movie.
     *
     * @return the title of the movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the genre of the movie.
     *
     * @return the genre of the movie
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the plot of the movie.
     *
     * @return the plot of the movie
     */
    public String getPlot() {
        return plot;
    }

    /**
     * Gets the director of the movie.
     *
     * @return the director of the movie
     */
    public String getDirector() {
        return director;
    }

    /**
     * Gets the rating of the movie.
     *
     * @return the rating of the movie
     */
    public double getRating() {
        return rating;
    }

    /**
     * Gets the actors of the movie.
     *
     * @return the actors of the movie
     */
    public List<Actor> getActors() {
        return actors;
    }

    /**
     * Sets the title of the movie.
     *
     * @param title the title of the movie
     * @return the title of the movie
     */
    public Movie setTitle(String title) {
        if (title.isBlank()) {
            System.out.println("Title cannot be blank.");

            return this;
        }

        this.title = title;

        return this;
    }

    /**
     * Sets the genre of the movie.
     *
     * @param genre the genre of the movie
     * @return the genre of the movie
     */
    public Movie setGenre(String genre) {
        if (genres.contains(genre.toLowerCase())) {
            this.genre = genre;

            return this;
        }

        System.out.println(
            "Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre."
        );

        return this;
    }

    /**
     * Adds a new genre to the list of genres.
     *
     * @param genre the genre to add to the list of genres
     * @return true if the genre was added to the list of genres, false otherwise
     */
    public boolean addGenre(String genre) {
        if (genres.contains(genre.toLowerCase())) {
            System.out.println("Genre already exists.");

            return false;
        }

        return genres.add(genre);
        
    }

    /**
     * Sets the plot of the movie.
     *
     * @param plot the plot of the movie
     * @return the plot of the movie
     */
    public Movie setPlot(String plot) {
        if (plot.isBlank()) {
            System.out.println("Plot cannot be blank.");

            return this;
        }

        this.plot = plot;

        return this;
    }

    /**
     * Sets the director of the movie.
     *
     * @param director the director of the movie
     * @return the director of the movie
     */
    public Movie setDirector(String director) {
        if (director.isBlank()) {
            System.out.println("Director cannot be blank.");

            return this;
        }

        this.director = director;

        return this;
    }

    /**
     * Sets the rating of the movie.
     *
     * @param rating the rating of the movie
     * @return the rating of the movie
     */
    public Double setRating(Double rating) {
        if (rating < 0 || rating > 10) {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.");

            return this.rating;
        }

        this.rating = rating;

        return this.rating;
    }

    /**
     * Adds an actor to the movie.
     *
     * @param actor the actor to add to the movie
     * @return true if the actor was added to the movie, false otherwise
     */
    public boolean addActor(Actor actor) {
        if (this.actors.contains(actor)) {
            System.out.println("Actor already exists in the movie.");

            return false;
        }

        return this.actors.add(actor);
    }

    /**
     * Displays the movie information.
     */
    public void displayMovieInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Genre: " + this.getGenre());
        System.out.println("Plot: " + this.getPlot());
        System.out.println("Director: " + this.getDirector());
        System.out.println("Rating: " + this.getRating());
        System.out.println("--- Actors ---");
        for (Actor actor : this.getActors()) {
            System.out.println(actor);
        }
    }

    /**
     * Finds an actor in the movie.
     *
     * @param actor the actor to find in the movie
     * @return true if the actor was found in the movie, false otherwise
     */
    public boolean findActor(Actor actor) {
        return this.actors.contains(actor);
    }
}

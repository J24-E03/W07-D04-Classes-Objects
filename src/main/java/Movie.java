import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie {


    // Attributes/ fields
    private String title;
    private String genre;
    private String plot;
    private String director;
    private double rating;
    private ArrayList<Actor> actors = new ArrayList<>();

    public static ArrayList<String> Genres = new ArrayList<>(List.of("Action", "Adventure", "Comedy", "Crime", "Drama"));

    //Constructor
    public Movie(String title, String genre, String plot, String director, double rating, ArrayList<Actor> actors) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setPlot(plot);
        this.setDirector(director);
        this.setRating(rating);
        this.actors = actors;


    }

    //Getter methods
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

    // Create setter methods for the rating field (setRating()):
    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.");
        }
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Field cannot be empty.");
        } else {
            this.title = title;
        }

    }

    public void setDirector(String director) {
        if (director == null || director.isEmpty()) {
            System.out.println("Field cannot be empty.");
        } else {
            this.director = director;
        }

    }

    public void setGenre(String genre) {
        if (Genres.contains(genre)) {
            this.genre = genre;
        } else {
            System.out.println("Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre.");
        }
    }

    public void setPlot(String plot) {
        if (plot == null || plot.isEmpty()) {
            System.out.println("Field cannot be empty.");
        } else {
            this.plot = plot;
        }

    }

    public void addNewActors(Actor actor) {
        if (actors.stream().anyMatch(a -> Objects.equals(a.getName(), actor.getName()))) {
            System.out.println("Actor already in the array.");
        } else {
            actors.add(actor);
            System.out.println("Actor added: " + actor);

        }

    }

    // // Static method to add a new genre
    public void addGenre(String genre) {
        if (Genres.stream().noneMatch(g -> g.equalsIgnoreCase(genre))) {
            Genres.add(genre);
        } else {
            System.out.println("Genre already exists");
        }

    }

    // Method to display movie info
    public void displayMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("Plot: " + plot);
        System.out.println("Actors: " + actors);

    }

    public static void displayAllGenres() {
        System.out.println("Available genres:" + Genres);
    }

    public String compareTwoMovies( Movie movie2) {
        if (this.getRating() > movie2.getRating()) {
            return this.getTitle() + " has a higher rating.";
        } else if (this.getRating() < movie2.getRating()) {
            return movie2.getTitle() + " has a higher rating.";
        } else {
            return "Both movies have the same rating.";
        }
    }
}











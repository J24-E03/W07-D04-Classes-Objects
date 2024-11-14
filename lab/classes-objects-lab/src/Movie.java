import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    private String title;
    private String genre;
    private String plot;
    private String director;
    private double rating;
    private ArrayList<Actor> actors;

    protected static ArrayList<String> GENRES = new ArrayList<>(Arrays.asList("Drama", "Comedy", "Adventure", "Crime", "Action"));

    public Movie(String title, String genre, String plot, String director, double rating, ArrayList<Actor> actors) {
        this.title = title;
        this.genre = genre;
        this.plot = plot;
        this.director = director;
        setRating(rating);
        this.actors = actors;
    }

    protected void addNewActor(Actor actor) {
        if (!this.actors.contains(actor)) {
            this.actors.add(actor);
        } else {
            System.out.println("Actor already in the array");
        }
    }

    public void addGenre(String genre) {
        if (GENRES.stream().anyMatch(genre::equalsIgnoreCase)) {
            System.out.println("Genre already exists!");
        } else {
            GENRES.add(genre);
        }
    }

    protected static void displayAllGenres() {
        System.out.println("Available genres = " + GENRES);
    }

    protected static void compareTwoMovies(Movie first, Movie second) {
        if (first.getRating() < second.getRating()) {
            System.out.println(second.getTitle() + " has a higher rating!");
        } else if (first.getRating() > second.getRating()) {
            System.out.println(first.getTitle() + " has a higher rating!");
        } else {
            System.out.println("The movies have the same rating.");
        }
    }

    private void findActorInMovie(Actor actor) {
        if (this.actors.contains(actor)) {
            System.out.println(actor.getName() + " is on the list of actors");
        } else {
            System.out.println(actor.getName() + " was not found on the list of actors!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            System.out.println("Field cannot be empty.");
        } else {
            this.title = title;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (GENRES.contains(genre)) {
            this.genre = genre;
        } else {
            System.out.println("Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre.");
        }
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        if (plot.isEmpty()) {
            System.out.println("Field cannot be empty.");
        } else {
            this.plot = plot;
        }
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        if (director.isEmpty()) {
            System.out.println("Field cannot be empty");
        } else {
            this.director = director;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating <= 10 && rating >= 0) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please enter a value between 0 and 10.");
        }
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie" +
                "\ntitle='" + title + '\'' +
                "\ngenre='" + genre + '\'' +
                "\nplot='" + plot + '\'' +
                "\ndirector='" + director + '\'' +
                "\nrating=" + rating +
                "\nactors=" + actors;
    }
}

import movie.database.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create Actors
        Actor actor1 = new Actor("Leonardo DiCaprio", 46, "American", true, 1991);
        Actor actor2 = new Actor("Kate Winslet", 45, "British", false, 1991);
        Actor actor3 = new Actor("Morgan Freeman", 83, "American", true, 1964);
        Actor actor4 = new Actor("Heath Ledger", 28, "Australian", true, 1992);
        Actor actor5 = new Actor("Michael Caine", 90, "British", false, 1956);
        Actor actor6 = new Actor("Christian Bale", 48, "British", true, 1992);

        // Create ArrayLists of Actors
        ArrayList<Actor> titanicActors = new ArrayList<>(Arrays.asList(actor1, actor2));
        ArrayList<Actor> darkKnightActors = new ArrayList<>(Arrays.asList(actor4,actor5));

        // Create Movies
        Movie titanic = new Movie("Titanic", "Drama", "A love story on the doomed ship", "James Cameron", 9.0, titanicActors);
        Movie shawshank = new Movie("The Shawshank Redemption", "Drama", "An inspiring story of hope and friendship", "Frank Darabont", 9.3, new ArrayList<Actor>());
        Movie darkKnight = new Movie("The Dark Knight", "Action", "A thrilling battle between Batman and the Joker.", "Christopher Nolan", 0.9, darkKnightActors);

        // Add actors to movies
        shawshank.addNewActor(actor3);
        darkKnight.addNewActor(actor6);

        // Test Display Movie Info
        titanic.displayMovieInfo();
        shawshank.displayMovieInfo();
        darkKnight.displayMovieInfo();

        // Test setting rating
        titanic.setRating(12.5);
        titanic.setRating(8.5);

        // Test comparing movies by rating
        System.out.println(compareTwoMovies(titanic, shawshank));

        // Test adding genres and displaying them
        Movie.addGenre("Thriller");
        Movie.addGenre("Comedy");
        Movie.displayAllGenres();

        // Test changing the genre of a movie
        titanic.setGenre("Adventure");
        titanic.setGenre("Fantasy");

        // Test adding an actor to a movie
        titanic.addNewActor(actor3);
        titanic.addNewActor(actor1);


        // Test adding a movie to an actor
        actor1.addMovieToActor(titanic);
        actor1.addMovieToActor(titanic);
        actor3.addMovieToActor(shawshank);

        // Test adding an actor to a movie
        addActorToMovie(actor3, titanic);

    }

    public static String compareTwoMovies(Movie movie1, Movie movie2) {
        return (movie1.getRating() > movie2.getRating() ? movie1.getTitle() + " has a better ranking with a rating of " + movie1.getRating() + "." : movie2.getTitle() + " has a better ranking with a rating of " + movie2.getRating() + ".");
    }

    public static void addActorToMovie(Actor actor, Movie movie){
        movie.addNewActor(actor);
    }


}

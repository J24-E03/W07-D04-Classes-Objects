
package lab.src.movieapp;

import java.util.ArrayList;

public class Movie {

 private String title;
 private String genre;
 private String plot;
 private String director;
 private double rating;
 private ArrayList<Actor> actors;


 private static ArrayList<String> genres = new ArrayList<>();


 static {
 genres.add("Drama");
 genres.add("Comedy");
 genres.add("Adventure");
 genres.add("Crime");
 genres.add("Action");
 }


  public Movie(String title, String genre, String director, double rating, String plot, ArrayList<Actor> actors) {
 this.title = title;
 this.director = director;
 this.plot = plot;
 setGenre(genre);
 setRating(rating);
 this.actors = actors;
 }


 public String getTitle() { return title; }
 public String getGenre() { return genre; }
 public String getPlot() { return plot; }
 public String getDirector() { return director; }
 public double getRating() { return rating; }
 public ArrayList<Actor> getActors() { return actors; }


public void setTitle(String title) {
 if (title != null && !title.isEmpty()) this.title = title;
 else System.out.println("Field cannot be empty.");
 }

 public void setDirector(String director) {
 if (director != null && !director.isEmpty()) this.director = director;
 else System.out.println("Field cannot be empty.");
 }

 public void setPlot(String plot) {
 if (plot != null && !plot.isEmpty()) this.plot = plot;
 else System.out.println("Field cannot be empty.");
 }

 public void setRating(double rating) {
 if (rating >= 0 && rating <= 10) this.rating = rating;
 else System.out.println("Invalid rating. Please enter a value between 0 and 10.");
 }

 public void setGenre(String genre) {
 if (genres.stream().anyMatch(g -> g.equalsIgnoreCase(genre))) this.genre = genre;
 else System.out.println("Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre.");
}

 public static void addGenre(String newGenre) {
 if (genres.stream().anyMatch(g -> g.equalsIgnoreCase(newGenre))) {
 System.out.println("Genre already exists.");
 } else {
genres.add(newGenre);
 }
 }


 public void addNewActor(Actor actor) {
 if (!actors.contains(actor)) actors.add(actor);
 else System.out.println("Actor already in the array.");
 }


 public void displayMovieInfo() {
 System.out.println("Title: " + title);
 System.out.println("Genre: " + genre);
 System.out.println("Director: " + director);
 System.out.println("Plot: " + plot);
 System.out.println("Rating: " + rating);
System.out.println("Actors: " + actors);
 }


 public static String compareTwoMovies(Movie movie1, Movie movie2) {
 if (movie1.rating > movie2.rating) return movie1.title + " has a higher rating.";
 else if (movie1.rating < movie2.rating) return movie2.title + " has a higher rating.";
 else return "Both movies have the same rating.";
 }

public static void displayAllGenres()
{
 System.out.println("Available genres: " + genres);
 }
}

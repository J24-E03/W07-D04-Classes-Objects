package lab.src.movieapp;

import java.util.ArrayList;

public class Main {
 public static void main(String[] args) {

 Actor danielRadcliffe = new Actor("Daniel Radcliffe", 34, "British", false, 2001);
 Actor emmaWatson = new Actor("Emma Watson", 33, "British", false, 2001);
 Actor viggoMortensen = new Actor("Viggo Mortensen", 65, "American", true, 1985);
 Actor markHamill = new Actor("Mark Hamill", 72, "American", false, 1977);

 ArrayList<Actor> harryPotterActors = new ArrayList<>();
 harryPotterActors.add(danielRadcliffe);
 harryPotterActors.add(emmaWatson);

 ArrayList<Actor> lotrActors = new ArrayList<>();
 lotrActors.add(viggoMortensen);

 ArrayList<Actor> starWarsActors = new ArrayList<>();
 starWarsActors.add(markHamill);


 Movie harryPotter = new Movie("Harry Potter and the Sorcerer's Stone", "Adventure", "Chris Columbus", 7.6, "A young boy discovers he's a wizard", harryPotterActors);
 Movie lotr = new Movie("The Lord of the Rings: The Return of the King", "Adventure", "Peter Jackson", 8.9, "Epic fantasy battle for Middle-earth", lotrActors);
 Movie starWars = new Movie("Star Wars: A New Hope", "Adventure", "George Lucas", 8.6, "A farm boy becomes a hero", starWarsActors);


 harryPotter.displayMovieInfo();
 lotr.displayMovieInfo();
 starWars.displayMovieInfo();

 Movie.displayAllGenres();


 System.out.println(Movie.compareTwoMovies(harryPotter, lotr));
 System.out.println(Movie.compareTwoMovies(starWars, lotr));


starWars.setRating(-1);
starWars.setRating(9);

 Movie.addGenre("Fantasy");
 System.out.println("Nach dem Hinzufügen von 'Fantasy' zur Genre-Liste:");
 Movie.displayAllGenres();


 harryPotter.addNewActor(danielRadcliffe); // Sollte eine Fehlermeldung ausgeben
 }
}

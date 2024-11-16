import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor();
        actor1.setName("Raj Kumar");
        actor1.setAge(40);
        actor1.setNationality("Indian");
        actor1.setHasWonOscar(false);
        actor1.setDebutYear(2010);
        Actor actor2 = new Actor();
        actor2.setName("Matthew McConaughey");
        actor2.setAge(55);
        actor2.setNationality("American");
        actor2.setHasWonOscar(true);
        actor2.setDebutYear(1991);
        ArrayList<Actor> actors1 = new ArrayList<>();
        actors1.add(actor1);
        actors1.add(actor2);

//create a few Movie objects with various ratings (including some with invalid ratings)
        Movie movie1 = new Movie("Hit Case-1", "Action", "A troubled police inspector sets out to solve a confounding case", "Sailesh Kolanu", 6.8, actors1);
        Movie movie2 = new Movie("Stree", "Comedy", "The town of Chanderi is being haunted ", "SAmar Kaushik", -1, actors1);
        Movie movie3 = new Movie("Interstellar", "Drama", "A ex-NASA pilot, Joseph Cooper, is tasked to pilot a spacecraft", "Christopher Nolan", 8.7, actors1);
        Movie movie4 = new Movie("Gold", "Action", "Kenny decides to go on an adventure to find gold in a desolate jungle.", "Stephen Gaghan", 11, actors1);

        // getter methods to retrieve and print each attribute.
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getGenre());

//Test updating the rating using setRating() with both valid and invalid values.
        movie3.setRating(-10);
        movie3.setRating(6);
//Call displayMovieInfo() to print out the movie details.
        movie1.displayMovieInfo();
        movie2.displayMovieInfo();
        movie3.displayMovieInfo();
        movie4.displayMovieInfo();

        System.out.println(movie1.compareTwoMovies(movie2));
        System.out.println(movie2.compareTwoMovies(movie2));

        System.out.println(actor1);


        Movie.displayAllGenres();


    }
}




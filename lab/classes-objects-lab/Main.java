public class Main {

    // Main method to test the Movie class
    public static void main(String[] args) {
        Movie movie = new Movie("Matrix", "Sci-fi", "Neo believes that Morpheus, an elusive figure considered to be the most dangerous man alive, can answer his question -- What is the Matrix?", "Wachowski Brothers", "Keanu Reeves", "Carrie-Anne Moss", "Laurence Fishburne", 8);

        System.out.println(movie.getTitle());
        System.out.println(movie.getGenre());
        System.out.println(movie.getPlot());
        System.out.println(movie.getDirector());
        System.out.println(movie.getActors());
        System.out.println(movie.getRating());
    }
}
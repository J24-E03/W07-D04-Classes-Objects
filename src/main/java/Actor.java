import java.util.ArrayList;

public class Actor {

    private String name;
    private int age;
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies;

    public Actor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isHasWonOscar() {
        return hasWonOscar;
    }

    public void setHasWonOscar(boolean hasWonOscar) {
        this.hasWonOscar = hasWonOscar;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(int debutYear) {
        this.debutYear = debutYear;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    //Method that adds a movie to the actor’s movies list
    public void addMovieToActor(Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }

    //Method  that adds the actor to the movie's actors list
    public void addActorToMovie(Actor actor, Movie movie) {

        if (movie.getActors().stream().noneMatch(a -> a.getName().equals(actor.getName()))) {
            movie.addNewActors(actor);
        }
    }

    // method  to return a nicely formatted string representation of the actor's details
    public String toString() {
        return "Actor Name: " + name + ", Age: " + age + ",Nationality: " + nationality
                + ", Oscar Winner: " + (hasWonOscar ? "Yes" : "No") + ", Debut Year: " + debutYear;

    }

    //Method checks if the actor exists in the movie's list
    public boolean findActorInMovie(Actor actor) {
     for(Movie movie: this.movies){
         if(movie.getActors().contains(actor)) return true;

     }
     return false;
    }


}





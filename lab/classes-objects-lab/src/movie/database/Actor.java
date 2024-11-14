package movie.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class Actor {
    private String name;
    private int age;
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies;

    // Constructor
   public Actor(String name, int age, String nationality, boolean hasWonOscar, int debutYear) {
       this.name = name;
       this.age = age;
       this.nationality = nationality;
       this.hasWonOscar = hasWonOscar;
       this.debutYear = debutYear;
       this.movies = new ArrayList<>();
   }

   // Getters
    public String getName() {
       return name;
    }

    public String getNationality() {
       return nationality;
    }

    public int getAge() {
       return age;
    }

    public boolean getHasWonOscar() {
       return hasWonOscar;
    }

    public int getDebutYear() {
       return debutYear;
    }

    // Setters
    public void setName(String name) {
       if (name.isBlank()) {
           System.out.println("Actor's name cannot be empty!");
           return;
       }
       this.name = name;
    }

    public void setNationality(String nationality) {
        if (nationality.isBlank()) {
            System.out.println("Actor's nationality cannot be empty!");
            return;
        }
        this.nationality = nationality;
    }

    public void setAge(int age) {
        if (age <= 0 || age > 130) {
            System.out.println("Actor's age out of range!");
            return;
        }
        this.age = age;
    }

    public void setHasWonOscar(boolean hasWonOscar) {
       this.hasWonOscar = hasWonOscar;
    }

    public void setDebutYear(int debutYear) {
       if (debutYear < LocalDate.now().getYear() - age) {
           System.out.println("Actor's debut year is invalid!\n");
           return;
       }
       this.debutYear = debutYear;
    }

    public String toString() {
       return "Actor: Name = " + name + ", Age = " + age + ", Nationality = " + nationality
               + ", hasWonOscar = " + hasWonOscar + ", debuteYear = " + debutYear;
    }

    public void addMovieToActor(Movie movie) {
       if (movies.contains(movie)) {
           System.out.println("Movie already in the list.\n");
           return;
       }
       movies.add(movie);
    }
}

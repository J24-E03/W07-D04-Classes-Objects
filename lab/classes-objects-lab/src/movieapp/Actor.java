package lab.src.movieapp;

import java.util.ArrayList;

public class Actor {
 private String name;
 private int age;
 private String nationality;
 private boolean hasWonOscar;
 private int debutYear;
 private ArrayList<Movie> movies;

 public Actor(String name, int age, String nationality, boolean hasWonOscar, int debutYear) {
 setName(name);
 setAge(age);
 setNationality(nationality);
 this.hasWonOscar = hasWonOscar;
 setDebutYear(debutYear);
 movies = new ArrayList<>();
 }

 public String getName() { return name; }
 public int getAge() { return age; }
 public String getNationality() { return nationality; }
 public boolean hasWonOscar() { return hasWonOscar; }
 public int getDebutYear() { return debutYear; }
 public ArrayList<Movie> getMovies() { return movies; }

 public void setName(String name) {
 if (name != null && !name.isEmpty()) this.name = name;
 else System.out.println("Name cannot be empty.");
 }
 public void setAge(int age) {
 if (age >= 0 && age <= 130) this.age = age;
else System.out.println("Invalid age.");
 }

 public void setNationality(String nationality) {
 if (nationality != null && !nationality.isEmpty()) this.nationality = nationality;
 else System.out.println("Nationality cannot be empty.");
 }

 public void setDebutYear(int debutYear) {
 if (debutYear >= (2023 - age) && debutYear <= 2023) this.debutYear = debutYear;
 else System.out.println("Invalid debut year.");
 }

 public void addMovieToActor(Movie movie) {
 if (!movies.contains(movie)) movies.add(movie);
 }

 @Override
 public String toString() {
 return "Name: " + name + ", Age: " + age + ", Nationality: " + nationality +
", Won Oscar: " + hasWonOscar + ", Debut Year: " + debutYear;
 }

 public static boolean findActorInMovie(Actor actor, Movie movie)
 {
 return movie.getActors().contains(actor);
 }
}

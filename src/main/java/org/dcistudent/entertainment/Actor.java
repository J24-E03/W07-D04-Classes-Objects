package org.dcistudent.entertainment;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Actor {
    String name;
    int age;
    String nationality;
    boolean hasWonOscar;
    int debutYear;
    ArrayList<Movie> movies = new ArrayList<>();

    /**
     * Gets the name of the actor.
     *
     * @return the name of the actor
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the actor.
     *
     * @return the age of the actor
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the nationality of the actor.
     *
     * @return the nationality of the actor
     */
    public String getNationality() {
        return this.nationality;
    }

    public boolean getHasWonOscar() {
        return hasWonOscar;
    }

    public int getDebutYear() {
        return debutYear;
    }

    public Actor setName(String name) {
        if (name.isBlank()) {
            System.out.println("Actor name cannot be empty.");

            return this;
        }

        this.name = name;

        return this;
    }

    public Actor setAge(int age) {
        if (age < 0 || age > 130) {
            System.out.println("Actor age must be between 0 and 130.");

            return this;
        }

        this.age = age;

        return this;
    }

    public Actor setNationality(String nationality) {
        if (nationality.isBlank()) {
            System.out.println("Actor nationality cannot be empty.");

            return this;
        }

        this.nationality = nationality;

        return this;
    }

    /**
     * Sets whether the actor has won an Oscar.
     *
     * @param hasWonOscar whether the actor has won an Oscar
     * @return whether the actor has won an Oscar
     */
    public Actor setHasWonOscar(boolean hasWonOscar) {
        this.hasWonOscar = hasWonOscar;

        return this;
    }

    /**
     * Sets the debut year of the actor.
     *
     * @param debutYear the debut year of the actor
     * @return the debut year of the actor
     */
    public Actor setDebutYear(int debutYear) {
        int birthYear = LocalDateTime.now().getYear() + 1900 - this.age;

        if (debutYear < this.age || debutYear-birthYear > 130) {
            System.out.println(
                "Invalid debut year. Please enter a year between the actor's age and ." + (birthYear+130)
            );

            return this;
        }

        this.debutYear = debutYear;

        return this;
    }

    /**
     * Adds a movie to the actor.
     *
     * @param movie the movie to add to the actor
     * @return true if the movie was added to the actor, false otherwise
     */
    public boolean addMovie(Movie movie) {
        if (this.movies.contains(movie)) {
            System.out.println("Movie already exists in the actor.");

            return false;
        }

        return this.movies.add(movie);
    }

    /**
     * Returns a string representation of the actor.
     *
     * @return a string representation of the actor
     */
    @Override
    public String toString() {
        return
            "Name: " + this.name +
            "\nAge: " + this.age +
            "\nNational: " + this.nationality +
            "\nHas won Oscar: " + this.hasWonOscar +
            "\nDebut year: " + this.debutYear +
            "\nMovies: " + this.movies.size()
        ;
    }

}

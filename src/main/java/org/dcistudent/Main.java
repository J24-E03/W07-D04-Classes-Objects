package org.dcistudent;

import org.dcistudent.entertainment.Actor;
import org.dcistudent.entertainment.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Actor actor = new Actor()
            .setName("Tom Hanks")
            .setAge(65)
            .setNationality("American")
            .setHasWonOscar(true)
            .setDebutYear(1980);

        Movie movie = new Movie(
            "Forrest Gump",
            "Drama",
            "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other historical events unfold.",
            "Robert Zemeckis",
            8.8,
            List.of(actor)
        );

        actor.addMovie(movie);
        movie.displayMovieInfo();
    }
}

import java.util.ArrayList;



public class Movie {
    private String title;
    private String genre;
    private String plot;
    private String director;
    private ArrayList<String> actors;
    private int rating;

    public Movie(String movieTitle, String movieGenre, String moviePlot, String movieDirector, String movieActor1, String movieActor2, String movieActor3, int movieRating)
    {
        // Check if title is non-blank and director is non blank and rating is in bounds
        // If any are invalid throw an exception and object is not created
        if ((((movieTitle.trim().length() == 0) || (movieTitle == null) ||
                (movieGenre.trim().length() == 0) || (movieGenre == null) ||
                (moviePlot.trim().length() == 0) || (moviePlot == null) ||
                (movieDirector.trim().length() == 0) || (movieDirector == null) ||
                (movieRating < 1) || (movieRating > 10))))
        {
            throw new IllegalStateException("Title and Director must not be blank. Rating should be betwee 1 and 10.");
        }
        title = movieTitle;
        genre = movieGenre;
        plot = moviePlot;
        director = movieDirector;
        actors = new ArrayList<String>();
        if (movieActor1.length() > 0)
        {
            actors.add(movieActor1);
        }
        if (movieActor2.length() > 0)
        {
            actors.add(movieActor2);
        }
        if (movieActor3.length() > 0)
        {
            actors.add(movieActor3);
        }
        rating = movieRating;
    }

    /*
     *  Displays all movie information
     */
    public void displayMovieInformation()
    {
        System.out.print("Movie title: " + title + "\n");
        System.out.println("Movie genre: " + genre + "\n");
        System.out.println("Movie plot: " + plot + "\n");
        System.out.print("Movie director: " + director + "\n");
        if (actors.size() == 0)
        {
            System.out.print("No movie actors\n");
        }
        else
        {
            for (int i = 0; i < actors.size(); i++)
            {
                System.out.print("Movie actor " + (i+1) + ": " + actors.get(i) + "\n");
            }
        }
        System.out.print("Movie rating: " + rating + "\n");
        System.out.print("\n\n");
    }

    public ArrayList<String> getActors()
    {
        return actors;
    }

    public String getDirector()
    {
        return director;
    }

    public int getRating()
    {
        return rating;
    }

    public String getTitle()
    {
        return title;
    }
    public String getGenre()
    {
        return genre;
    }
    public String getPlot()
    {
        return plot;
    }
    /*
     *  Set the movie actors
     *
     *  @param - actor1,actor2,actor3 - actor names of the movie
     *
     *  @throws IllegalArgumentException if all actor names passed are blank
     */
    public void setActors(String actor1, String actor2, String actor3)
    {
        // Make sure at least one actor string is non blank, if they all are blank throw exception
        if ((actor1.trim().length() == 0) && (actor2.trim().length() == 0) && (actor3.trim().length() == 0))
        {
            throw new IllegalArgumentException("Must have at least one non-blank actor to set");
        }

        actors = new ArrayList<String>();
        if (actor1.trim().length() > 0)
        {
            actors.add(actor1);
        }
        if (actor2.trim().length() > 0)
        {
            actors.add(actor2);
        }
        if (actor3.trim().length() > 0)
        {
            actors.add(actor3);
        }
    }

    /*
     *  Set the movie director
     *
     *  @param - newDirector - director name string of the movie
     *
     *  @throws IllegalArgumentException if all director string is blank
     */
    public void setDirector(String newDirector)
    {
        if (newDirector.trim().length() == 0) //check if director is blank string
        {
            throw new IllegalArgumentException("Director to set must not be blank\n");
        }

        director = newDirector;
    }

    /*
     *  Set the movie rating
     *
     *  @param - newRating - integer rating number for the movie between 1 and 10 inclusive
     *
     *  @throws IllegalArgumentException if
     */
    public void setRating(int newRating)
    {
        if (newRating > 10 || newRating < 1) //check if rating is out of bounds
        {
            throw new IllegalArgumentException("Rating must be between 1 and 10\n");
        }

        rating = newRating;
    }

    /*
     *  Set the movie title
     *
     *  @param - newTitle - title string of the movie
     *
     *  @throws IllegalArgumentException if all title is blank
     */
    public void setTitle(String newTitle)
    {
        if (newTitle.trim().length() == 0) //check if title is blank string
        {
            throw new IllegalArgumentException("Title to set must not be blank\n");
        }

        title = newTitle;
    }
    public void setGenre(String newGenre)
    {
        if (newGenre.trim().length() == 0) //check if title is blank string
        {
            throw new IllegalArgumentException("Genre to set must not be blank\n");
        }

        genre = newGenre;
    }
    public void setPlot(String newPlot)
    {
        if (newPlot.trim().length() == 0) //check if title is blank string
        {
            throw new IllegalArgumentException("Plot to set must not be blank\n");
        }

        plot = newPlot;
    }
}

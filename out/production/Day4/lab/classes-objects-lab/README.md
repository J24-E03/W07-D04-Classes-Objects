# Exercise: Movie Class

### Objective:
Create a `Movie` class that represents a movie with attributes for its title, genre, director, rating, and a list of actors. Use encapsulation principles by setting fields to `private` and creating getter and setter methods to control access.

---

### Instructions:

#### 1. Define the `Movie` Class:
- Create a class named `Movie`.
- Define the following private fields:
  - `String title`
  - `String genre`
  - `String plot`
  - `String director`
  - `double rating` (where rating is out of 10.0)
  - `ArrayList<Actor> actors`

#### 2. Constructor:
- Create a constructor that takes in parameters for `title`, `genre`, `director`, `rating`, `plot`, and `actors`, and assigns them to the respective fields.
- If the rating is below 0 or above 10, set the rating to 0 and print a message indicating that the rating is invalid.

#### 3. Getters and Setters:
- Create getter methods for all the fields (`getTitle()`, `getGenre()`, `getDirector()`, `getPlot()`, `getActors()`, and `getRating()`).
- Create setter methods for the `rating` field (`setRating()`):
  - In `setRating(double rating)`, ensure the rating is between 0 and 10. If it’s not, do not update the rating and print a message saying, “Invalid rating. Please enter a value between 0 and 10.”
  - Create setter methods for the `title`, `director`, and `plot` fields. These setters should validate that the provided strings are not empty. If any of these fields are empty, print a message saying, "Field cannot be empty."
  - Create an `addNewActor()` method that takes an argument and checks if the actor is already in the `actors` list. If the actor exists, print: "Actor already in the array." If not, add the actor to the `actors` list.

#### 4. Static Keyword:

- Create a static `ArrayList<String>` of genres on the site. Pick five values for the list: `["Drama", "Comedy", "Adventure", "Crime", "Action"]`.
- Create a setter method for the `genre` field. This setter should check if the given genre exists in the static list. If it does, change the genre. If not, print: "Currently we do not support this genre on our site. Please use the addGenre() method to add a new genre."
- Create a new method called `addGenre()` that takes a `String` of a new genre and checks if it already exists in the static `genres` list. If not, add it to the list; otherwise, print: "Genre already exists."
- **BONUS**: Ignore case sensitivity in the genre comparison. If the new genre being added is "aCtIoN" and the saved genre is "Action", they should be treated the same and not added again.

#### 5. Methods:
- Add a `displayMovieInfo()` method that prints all information about the movie, formatted nicely.
- Add a static method `displayAllGenres()` that prints all available genres from the static genre list.
- Create a `compareTwoMovies(Movie movie1, Movie movie2)` method that compares the ratings of two movies and returns a message indicating which movie has a higher rating.

#### 6. Testing:
- In the `main` method, create a few `Movie` objects with various ratings (including some with invalid ratings).
- Use the getter methods to retrieve and print each attribute.
- Test updating the rating using `setRating()` with both valid and invalid values.
- Call `displayMovieInfo()` to print out the movie details.
- Test the `compareTwoMovies()` method by comparing two movie objects.

#### 7. Second Class: `Actor`

- Create a second class called `Actor` that has the following attributes:
  - `String name`
  - `int age`
  - `String nationality`
  - `boolean hasWonOscar`
  - `int debutYear`
- Write the setters and getters for the class.
- Create the `toString()` method for the class to return a nicely formatted string representation of the actor's details.
- Modify the `Movie` class so that the `actors` field is an `ArrayList<Actor>` instead of an `ArrayList<String>`.
- Add an additional attribute to the `Actor` class: an `ArrayList<Movie>` to represent the movies the actor has been a part of.
- Create a method in the `Actor` class called `addMovieToActor(Movie movie)` that adds a movie to the actor’s `movies` list if the movie is not already in the list.
- Create a method `addActorToMovie(Actor actor, Movie movie)` that adds the actor to the movie's `actors` list, if the actor is not already in the list.
- Add validation for the fields of the `Actor` class:
  - `name`: Cannot be empty.
  - `age`: Cannot be younger than 0 or older than 130.
  - `nationality`: Cannot be empty.
  - `debutYear`: Cannot be before the actor’s birth year (age must be greater than 0) and cannot be older than 130 years.
- Create a method `findActorInMovie(Actor actor)` that checks if the actor exists in the movie's list of actors using `.contains()`.

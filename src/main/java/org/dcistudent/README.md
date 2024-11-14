### Main Class (Entry Point)

1. **`public static void main(String[] args)`**:
    - This is the starting point of the program. The `main` method is where the program starts executing.
    - It creates an instance of the `Main` class by calling `new Main();`, which in turn triggers the constructor `Main()`.

2. **`public Main()` (Constructor)**:
    - This constructor initializes some objects. It creates an `Actor` object and a `Movie` object, and it sets various properties of these objects by calling the `set` methods.
    - After setting up the actor and movie, the actor is added to the movie, and `movie.displayMovieInfo();` is called to print out information about the movie.

### Movie Class (Represents a Movie)

1. **Constructor (`Movie(...)`)**:
    - This is the special method that gets called when you create a new `Movie` object. It sets up the movie’s title, genre, plot, director, rating, and actors.

2. **Getter Methods (`getTitle`, `getGenre`, etc.)**:
    - These methods provide a way to retrieve information about a movie.
    - Example: `getTitle()` returns the title of the movie.

3. **Setter Methods (`setTitle`, `setGenre`, etc.)**:
    - These methods allow you to change a movie’s properties after it has been created.
    - Example: `setTitle("New Title")` would change the title of the movie to "New Title".
    - Note that `setGenre` checks if the genre is one of the allowed genres and will print an error message if not.

4. **`addGenre(String genre)`**:
    - Adds a new genre to the list of allowed genres. This is useful if you want to add a genre not initially included.

5. **`addActor(Actor actor)`**:
    - Adds an `Actor` object to the list of actors in the movie. It checks if the actor is already in the movie before adding it.

6. **`displayMovieInfo()`**:
    - Prints out details of the movie, including title, genre, plot, director, rating, and actors.
    - This method calls the `get` methods to fetch values, and then it displays them to the console.

### Actor Class (Represents an Actor)

1. **Getter Methods (`getName`, `getAge`, etc.)**:
    - These methods are used to get the values of an actor’s properties, like name, age, nationality, etc.

2. **Setter Methods (`setName`, `setAge`, etc.)**:
    - These methods allow you to change an actor’s properties.
    - `setAge(int age)` checks that the age is between 0 and 130 before setting it, printing an error message if not.

3. **`addMovie(Movie movie)`**:
    - Adds a `Movie` object to the list of movies the actor has acted in. It checks to ensure the movie isn’t already in the list before adding it.

4. **`toString()`**:
    - This method is used when you want a textual description of the actor object, such as when you print it to the console.
    - It returns a formatted string with details like the actor’s name, age, nationality, Oscar win status, debut year, and the number of movies they've been in.

### Additional Points

- **Encapsulation**: Many methods in this code use encapsulation, meaning they keep variables private (e.g., `title`, `age`) and provide public methods to access or change them.
- **Validation**: The code checks inputs in several places, such as the genre in `setGenre` or the rating in `setRating`. This helps prevent errors and ensures that the program uses valid data.
- **Return `this`**: The `set` methods in `Movie` and `Actor` classes return `this`, allowing for method chaining, where multiple methods can be called in a single line (e.g., `actor.setName("Tom Hanks").setAge(65);`).
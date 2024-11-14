import java.time.LocalDate;
import java.util.ArrayList;

public class Actor {
    private String name;
    private int age;
    private String nationality;
    private boolean hasWonOscar;
    private int debutYear;
    private ArrayList<Movie> movies = new ArrayList<>();

    public Actor(String name, int age, String nationality, int debutYear) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.debutYear = debutYear;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", hasWonOscar=" + hasWonOscar +
                ", debutYear=" + debutYear +
                '}';
    }

    private void addMovieToActor(Movie movie) {
        if (movies.contains(movie)) {
            movies.add(movie);
        } else {
            System.out.println("The movie is already on the list!");
        }
    }

    private static void addActorToMovie(Actor actor, Movie movie) {
        movie.addNewActor(actor);
    }

    private void validateName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Actor's name cannot be empty!");
        }
    }

    private void validateAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Actor's age is invalid!");
        }
    }

    private void validateNationality(String nationality) {
        if (!nationality.isEmpty()) {
            this.nationality = nationality;
        } else {
            System.out.println("Actor's nationality is invalid!");
        }
    }

    private void validateDebutYear(int debutYear) {
        int yearOfBirth = LocalDate.now().getYear() - this.age;
        if (debutYear > yearOfBirth && debutYear < yearOfBirth + 130) {
            this.debutYear = debutYear;
        } else {
            System.out.println("Actor's debut year is invalid!");
        }
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
}

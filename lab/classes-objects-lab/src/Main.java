import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie spiderman = new Movie("Spiderman", "Action",
                "Spider-Man centers on student Peter Parker (Tobey Maguire) who, after being bitten by a genetically-altered spider," +
                        " gains superhuman strength and the spider-like ability to cling to any surface. " +
                        "He vows to use his abilities to fight crime, coming to understand the words of his beloved Uncle Ben: With great power comes great responsibility.",
                "Sam Raimi", 2, new ArrayList<>(List.of(new Actor("Andrew Garfield", 41, "american", 2005),
                new Actor("Tom Holland", 28, "british", 2012),
                new Actor("Tobey Maguire", 49, "deutsch", 1989),
                new Actor("Jake Johnson", 46, "russian", 2007))));

        Movie batman = new Movie("Batman", "Crime",
                "Batman ventures into Gotham City's underworld when a sadistic killer leaves behind a trail of cryptic clues." +
                        "As the scale of the perpetrator's plans become clear, he must bring justice to the abuse of power and corruption that plagues the metropolis.",
                "Matt Reeves", 5, new ArrayList<>(List.of(new Actor("Robert Pattinson", 37, "brazilian", 2017),
                new Actor("Christian Bale", 22, "romanian", 2011),
                new Actor("Jensesn Ackles", 35, "french", 1997),
                new Actor("Ben Affleck", 50, "chinese", 2021))));
        System.out.println(spiderman);
        System.out.println();
        System.out.println(batman);
        Movie.compareTwoMovies(spiderman, batman);
    }
}

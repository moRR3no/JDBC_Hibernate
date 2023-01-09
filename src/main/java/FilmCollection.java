import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmCollection {
    static List<Film> filmList = new ArrayList<>();

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;


        while (!quit) {
            System.out.print("Choose an option: \n");
            System.out.println("1 to add a film\n" +
                    "2 to show list of films\n" +
                    "0 to quit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre: ");
                    String genre = scanner.nextLine();
                    System.out.println("Rate: ");
                    double rate = scanner.nextDouble();
                    scanner.nextLine();
                    addFilm(new Film(title,year,genre,rate));
                    break;
                case 2:
                    filmList.forEach(System.out::println);
            }

        }

    }

    public static void addFilm (Film film) {
        if (film.getReleaseYear() < 1800 || film.getReleaseYear() > 2100) {
            System.out.println("This film has wrong release year.");
            return;
        }
        filmList.add(film);
    }


}

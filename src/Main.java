import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayFilm [] films = new ArrayFilm[3];
        films[0] = createFilm();
        films [1] = createFilm();
        films [2] = createFilm();
        showPosition(films);


    }

    private static void showPosition(ArrayFilm[] films) {
        for (int i = 0; i < films.length ; i++) {

            System.out.println("Posició: " + i + " " + films[i].getTitleFilm());
            System.out.println("Posició: " + i + " " +films[i].getDirectorName());
            System.out.println("Posició: " + i + " "  +films[i].getCategoryFilm());

        }

    }

    private static ArrayFilm createFilm(){

        String title = askForTitle();
        String directorName = askForDirectorName();
        String category = askFOrCategory();

        ArrayFilm film = new ArrayFilm(title,directorName,category);
        System.out.println("Film creat: " + film.getTitleFilm() + " " + film.getDirectorName() + " "+ film.getCategoryFilm());
        return film;


    }


    private static String askFOrCategory() {
        System.out.println("Indica de quina categoria és el film: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }

    private static String askForDirectorName() {
        System.out.println("Indica el nom del director del film: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static String askForTitle() {
        System.out.println("Indica el títol del film: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}

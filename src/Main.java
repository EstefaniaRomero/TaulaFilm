import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /*
       Exercici 3:
       Film[] films = new Film[3];
        films[0] = createFilm();
        films [1] = createFilm();
        films [2] = createFilm();
        showPosition(films);

        for (Film film : films)
        { System.out.println(film);}*/
        List<Film> films = new ArrayList<>();
        int numberFilms = askNumberFilm();
        introduceFilm(numberFilms,films);
        boolean deleteFIlm = optionDeleteFilm();
        deleteFIlm(deleteFIlm,films);


    }

    private static void deleteFIlm(boolean deleteFIlm,List <Film> films) {
        if(deleteFIlm){

            films.clear();
            System.out.println("Les pel·lícules s'han borrat!");
            for (Film film : films)
            { System.out.println(film);}

        }else {

            for (Film film : films)
            { System.out.println(film);}
        }

    }

    private static boolean optionDeleteFilm() {
        System.out.println("Vols eliminar totes les pel·lícules creades? S/N");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().equalsIgnoreCase("S");


    }

    private static void introduceFilm( int numberFilms,List<Film> films) {


        for (int i = 0; i < numberFilms ; i++) {
            Film film = createFilm();
            films.add(film);
        }
    }

    private static int askNumberFilm() {

        System.out.println("Quantes pel·lícules vols crear?: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    private static void showPosition(Film[] films) {
        for (int i = 0; i < films.length ; i++) {

            System.out.println("Posició: " + i + " " + films[i].getTitleFilm());
            System.out.println("Posició: " + i + " " +films[i].getDirectorName());
            System.out.println("Posició: " + i + " "  +films[i].getCategoryFilm());

        }

    }

    private static Film createFilm(){

        String title = askForTitle();
        String directorName = askForDirectorName();
        String category = askFOrCategory();

        Film film = new Film(title,directorName,category);
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

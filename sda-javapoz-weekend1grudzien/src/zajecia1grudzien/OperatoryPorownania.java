package zajecia1grudzien;

public class OperatoryPorownania {

    public static void main(String[] args) {

        int wiek = 27;

        //wersja 1

        boolean czyPelnoletni = wiek >= 18;

        System.out.println("Czy wiek >= 18 ?" + " " + czyPelnoletni);

        System.out.println("Czy wiek <=18 ? " + " " + (wiek <= 18));

        System.out.println("czy wiek różny od 20? " + (wiek != 20));


        //wersja 2

        System.out.println(wiek == 27);


    }
}

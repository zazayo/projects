package zajecia1grudzien;

import java.util.Scanner;

public class CzytnikIntro {

    public static void main(String[] args) {


        // aby móc czytać dane od uzytkownika
        //musimy utworzyc obiekt typu Scanner
        // wg następującej składni

        Scanner czytnik = new Scanner(System.in);

        //czytnik to zmienna/obiekt typu Scanner

        //wiek to zmienna typu int
        // w momencie pisania kodu nie wiemy ile konkretny uzytkownik ma lat

        String imie;
        double wiek = 0;

        System.out.println("Podaj swoje imie:");
            //odczytaj całą linię tekstu az do wcisniecią Enter
         imie = czytnik.nextLine();

        System.out.println("Ile masz lat?" );
        wiek = czytnik.nextDouble();

        System.out.println("Witaj " + imie + "! Masz " + wiek + " lat.");

    }
}

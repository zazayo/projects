package zajecia2grudzien;

import java.util.Scanner;

public class AGD {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        double cena = 0;
        int liczbaRat = 0;

        System.out.println("Podaj cenę towaru w zakresie od 100 do 10 tys. ");
        cena = czytnik.nextDouble();

        System.out.println("Podaj liczbę rat w zakresie od 6 do 48 ");
        liczbaRat = czytnik.nextInt();

        double miesiecznaRata = 0;

        if ((cena >= 100 && cena <= 10_000) && (liczbaRat >= 6 && liczbaRat <= 48)) {
            System.out.println("Obliczam raty...");
            if (liczbaRat <= 12) {
                miesiecznaRata = 1.025 * cena / liczbaRat;
            } else if (liczbaRat <= 24) {
                miesiecznaRata = 1.05 * cena / liczbaRat;
            } else {
                miesiecznaRata = 1.1 * cena / liczbaRat;
            }
            System.out.println("Miesieczna rata wynosi " + miesiecznaRata);


        } else {
            System.out.println("Złe dane. Urochom ponownie.");


        }
    }
}

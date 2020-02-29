package zajecia3styczen;

    /* Napisać program zliczający długość łańcucha znakowego.
● Z białymi znakami
● Bez białych znaków*/

    import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        //zapytaj uzytkownika o dowolny czas
        // "Ala ma kota", "Piotr", "Zadanie4"

        // policz liczbę znaków (ze spacją i bez)

        // wyświetl na końcu wynik
        // np. "długośc napisu ... ze spacjami wynosi: WYNIK,
        // "bez spacji ..."
        //
        String imie = "Piotr Kowalski";  //zmienna złożona


        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj dowolny napis: ");

        String text = czytnik.nextLine();

        //zliczanie

        int licznik = 0;

        for (int i = 0; i < text.length(); i++) {
            // pobierz jeden znak

            char znak = text.charAt(i);


            //jezeli dany znak jest litera (czyli nie jest spacją), to go zliczamy

            if (znak != ' ') {
                licznik++;  //ten if nie potrzebował elsa
            }


        }
        System.out.println("długość tekstu bez spacji to: " + licznik);
        System.out.println("dlugość tekstu ze spacjami to: " + text.length());


        //wyświetl napis zapisany malymi i duzymi literami
        System.out.println("Tekst małymi literami to: " + text.toLowerCase());
        System.out.println("Tekst dużymi literami to: " + text.toUpperCase());
    }
}


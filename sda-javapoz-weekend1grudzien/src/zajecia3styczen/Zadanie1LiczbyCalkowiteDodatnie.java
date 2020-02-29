package zajecia3styczen;

import java.util.Scanner;

public class Zadanie1LiczbyCalkowiteDodatnie {
// zadanie ze strony jkozak

/*Napisac program, który pobiera od uzytkownika liczbe całkowita dodatnia, a na-
stepnie wyswietla na ekranie kolejno wszystkie liczby niepatrzyste nie wieksze od
podanej liczby. Przykład, dla 15 program powinien wyswietlic 1, 3, 5, 7, 9, 11, 13,
15.*/

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią: ");

        int liczba = czytnik.nextInt();


        for (int i = 1; i <= liczba; i += 2) {
            System.out.print(i + ", ");
        }

        if (liczba < 0 ) {
            System.out.println("Podana wartość jest nieprawidłowa");

            /* for (int i==1; i <= liczba; i++) {
            if (i % 2 ==1) {
                System.out.println(i);
                */
            }
        }
    }


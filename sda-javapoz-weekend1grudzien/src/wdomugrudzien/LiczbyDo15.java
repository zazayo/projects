package wdomugrudzien;

import java.util.Scanner;

public class LiczbyDo15 {
    //Napisac program, który pobiera od uzytkownika liczbe całkowita dodatnia, a na-
    //stepnie wyswietla na ekranie kolejno wszystkie liczby niepatrzyste nie wieksze od
    //podanej liczby. Przykład, dla 15 program powinien wyswietlic 1, 3, 5, 7, 9, 11, 13,
    //15.

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę całkowitą dodatnią:");
        int liczba = 0;
        liczba = scaner.nextInt();

        for (int i = 1; i <= liczba; i += 2) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

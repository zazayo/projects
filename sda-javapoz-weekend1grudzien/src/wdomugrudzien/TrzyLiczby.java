package wdomugrudzien;

import java.util.Scanner;

public class TrzyLiczby {
    public static void main(String[] args) {

        Scanner Liczby = new Scanner(System.in);

        int liczba_1 = 0;
        int liczba_2 = 2;
        int liczba_3 = 0;

        System.out.println("Podaj liczbę 1: ");
        liczba_1 = Liczby.nextInt();

        System.out.println("Podaj liczbę 2: ");
        liczba_2 = Liczby.nextInt();

        System.out.println("Podaj liczbę 3: ");
        liczba_3 = Liczby.nextInt();

        int largest;
        int smallest;

        if (liczba_1 > liczba_2) {
            largest = liczba_1;
        } else {
            largest = liczba_2;
        }

        if (liczba_3 > largest) {
            largest = liczba_3;
        }

        System.out.println("Największa: " + largest);

        if (liczba_1 < liczba_2) {
            smallest = liczba_1;
        } else {
            smallest = liczba_2;
        }

        if (liczba_3 < smallest) {
            smallest = liczba_3;

            System.out.println("Najmniejsza: " + smallest);
        }
    }
}


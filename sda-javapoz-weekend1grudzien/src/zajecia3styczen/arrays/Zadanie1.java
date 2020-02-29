package zajecia3styczen.arrays;

import java.util.Scanner;

public class Zadanie1 { /*Napisać program, który:
• utworzy tablicę 10 liczb całkowitych i wypełni ją wartościami losowymi z
przedziału [−10, . . . , 10],
• wypisze na ekranie zawartość tablicy,
• wyznaczy najmniejszy oraz najwięszy element w tablicy,
• wyznaczy średnią arytmetyczną elementów tablicy,
• wyznaczy ile elementów jest mniejszych, ile większych od średniej.
• wypisze na ekranie zawartość tablicy w odwrotnej kolejności, tj. od ostatniego do pierwszego.
Wszystkie wyznaczone wartości powinny zostać wyświetlone na ekranie.
Wylosowane liczby:
-3 9 2 -10 -3 -4 -1 -5 -10 8
Min: -10, max: 9
Średnia: -1,00
Mniejszych od śr.: 6
Większych od śr.: 3
Liczby w odwrotnej kolejności:
8 -10 -5 -1 -4 -3 -10 2 9 -3 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        //tworzymy nową tablicę
        int[] array = new int[size];


        for (int i = 0; i < array.length; i++) {

            System.out.print("Podaj " + (i + 1) + " element tablicy: ");
            int liczba = scanner.nextInt();
            array[i] = liczba;

            //alternatywnie
            //  array[i] = scanner.nextInt();

        }
        // wyswietl elementy tablicy...

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }

        //oblicz min, max, avg, itd
        int max = array[0];
        int min = array [0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];


            }
            if (array[i] < min) {
                min = array[i];

            }

            }
        System.out.println("Najwięszkym elementem jest: " + max);
        System.out.println("Najmniejszy element to: " + min);

        int suma = 0;
        float avg = 0;


            for (int i = 0; i < array.length; i++) {
                suma += array[i];

                avg = (float) suma / array.length; }  //ten float po to zeby cyfry po przecinku byly

        System.out.println("Srednia wynosi: " + avg);



            }
        }



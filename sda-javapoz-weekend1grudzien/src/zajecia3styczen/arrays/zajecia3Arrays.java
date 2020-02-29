package zajecia3styczen.arrays;

import java.util.Scanner;

public class zajecia3Arrays {


    public static void main(String[] args) {
        int wiek = 10;


        //tworzenie tablicy 10-elementowej

        int[] liczby = new int[10];

        //wpisywanie wartości do tablicy

        liczby[0] = 25;
        liczby[4] =100;

        //pobieranie wartości z tablicy
        int wartosc = liczby[4];

        System.out.println(wartosc);
        System.out.println(liczby[0]);

        //ArrayIndexOutOfBoundsException
        //index tablicy nigdy nie będzie ujemny
        //jeśli index wiekszy od dlugosci tablicy to tez bląd

        //Sprawdzanie długości tablicy


        int dlugoscTablicy = liczby.length;

        System.out.println("\ntablica ma długość: " + dlugoscTablicy);

        String[] imiona = {"Ala", "Piotr", "Adam", "Agnieszka", "Marcin"};
        System.out.println("długość tablicy to: " + imiona.length);

        //wyswietlenie wszystkich elementów

        for (int i = 0; i < imiona.length; i++) {
            String name = imiona[i];
            System.out.println("Imię nr " + i + " to: " + name);
        }

            //alternatywnie od razu wyswietlenie elementu, bez wczesniejszego tworzenia zmiennej
            // System.out.println("Imie nr " + i + ' to: " + imiona[i]);


            //Dynamiczne tworzenie tablicy
            System.out.println("Podaj rozmiar tablicy: ");
            Scanner scanner = new Scanner(System.in);
            int rozmiar = scanner.nextInt();

            int[] dynamicznaTablica = new int[rozmiar];
            System.out.println("Rozmiar dynamicznej tablicy: " + dynamicznaTablica.length);

        }



    }


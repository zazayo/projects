package wdomugrudzien;

import java.util.Scanner;

public class liczbaCałkowita {
    public static void main(String[] args) {
        //Napisac program, który wczytuje liczby podawane przez uzytkownika dotad, do-
        //póki nie podana zostanie liczba 0. Nastepnie wyswietlic sume wszystkich poda-
        //nych liczb.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczby całkowite");
        int calkowita = 0;
        calkowita = scanner.nextInt();

        int suma = 0;
        suma += calkowita;
        calkowita++;


        while (calkowita != 0)
        { System.out.println("Podaj kolejną liczbę całkowitą");
            calkowita = scanner.nextInt();
            suma += calkowita;
        }

         System.out.println("Suma podanych liczb całkowitych wynosi: " + suma);



    }
}



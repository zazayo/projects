package zajecia3styczen;

import java.util.Scanner;

public class Potęgi {
    //jkozak

    /*Napisac program, który wczytuje od uzytkownika liczbe całkowita dodatnia n, a
nastepnie wyswietla na ekranie wszystkie potegi liczby 2 nie wieksze, niz podana
liczba. Przykładowo, dla liczby 71 program powinien wyswietlic:
1, 2, 4, 8, 16, 32, 64*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");

        int n = sc.nextInt();

        for (int i = 0; Math.pow(2, i) <= n; i++) {
            System.out.print(Math.pow(2, i) + ", ");
        }
            // II wersja
            System.out.println("\ndrugie rozwiązanie");
            for (int i = 1; i <= n; i = i*2) {
                System.out.print(i + ", ");
            }


        }
    }


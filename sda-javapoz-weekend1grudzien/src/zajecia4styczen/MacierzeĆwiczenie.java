package zajecia4styczen;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/*Napisz program, który:
• stworzy tablice (macierz) 5 x 5 liczb całkowitych,
• wypełnij ja losowymi wartosciami z zakresu {−5,−4, . . . , 5},
• dla kazdej wiersza wyznacz minimum,
• dla kazdej kolumny wyznaczy maksimum.
Program ma wyswietlac tablice wypełniona liczbami oraz tablice z minimami oraz
maksymami.*/

public class MacierzeĆwiczenie {
    public static void main(String[] args) {

        int[][] macierz = new int[5][5];

        System.out.println("Liczba wierszy: " + macierz.length); //zwraca liczbę wierszy
        System.out.println("Liczba Kolumn: " + macierz[0].length); //zwraca liczbę kolumn


        // wypelnianie macierzy wartościami losowymi
        Random r = new Random();

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = r.nextInt(11)-5;
                System.out.print(macierz[i][j] + ", ");
            }
            System.out.println();
        }

        // wyswietlanie macierzy:


        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
            }
        }

        //szukanie maximum w wierszu
        int[] maxWWierszach = new int[macierz.length];
        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];

            for (int j = 0; j < macierz[0].length; j++) {
                if (max < macierz[i][j]) {
                    max = macierz[i][j];
                }
            }
            maxWWierszach[i] = max;
        }

        //wyswietlanie max w wierszach
        System.out.println("Najwięszkym elementem w wierszach jest: ");
        for (int wWierszach : maxWWierszach) {
            System.out.print(wWierszach + ", ");

        }
    }
}



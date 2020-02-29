package zajecia4styczen;

import java.util.Random;
import java.util.Scanner;

public class zadanie2losowanieliczb {
    /* jkozak
    Napisac program, który utworzy tablice 20 liczb całkowitych z przedziału 1 . . . 10,
a nastepnie wypisze na ekranie ile razy kazda z liczb z tego przedziału powtarza
sie w tablicy.
Przykład:
Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
Wystapienia:
1 - 1
2 - 1
3 - 3
4 - 3
5 - 3 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");

        int arraySize = scanner.nextInt();

        //tworzymy dwie tablice
        // pierwsza liczby
        // druga wystąpienia o rozmiarze 11 dla zliczenia wsytapien od 0 do 10, 11 cyfr

        int[] liczby = new int[arraySize];
        int[] wystapienia = new int[11];

        // wypelnij tablice wartosciami losowymi

        Random r = new Random();


        for (int i = 0; i < liczby.length; i++) {
            //losowanie liczby
            int randomNumber = r.nextInt(10) + 1;
            // wpisujemy wylosowana liczbe do tablicy
            liczby[i] = randomNumber;
        }
        // tablica jest wypełniona i mozna ją wyswietlic
        // uzywamy petli "foreach"
        //nie mamy zmiennej "int 1", tracimy informację o indeksie
        // ale w tym przypadku tego nie potrzebujemy
        // dla kazdego elementu chcemy go wypisać...

        for (int liczba : liczby) {
            System.out.print(liczba + ", ");
        }
        System.out.println(); // przejscie do nowej linii

        //zliczanie elementów
        for (int i = 0; i < liczby.length; i++) {

            //pobierz wartosc z tablicy "liczby" ->> wartość ta jest indeksem dla tablicy wystapienia
            // np. jezeli bedzie liczba 5 -> to w tablicy wystapienia [5] nalezy inkrementować wartosc

            int index = liczby[i];
            wystapienia[index]++;
        }
            // wyswietlanie tablicy wystapienia
        for (int i = 1; i < wystapienia.length; i++) {
            System.out.println(i + " ---> " + wystapienia [i]);

        }
    }

}

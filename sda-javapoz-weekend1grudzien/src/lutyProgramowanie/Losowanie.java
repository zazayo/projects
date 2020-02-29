package lutyProgramowanie;

import java.util.Random;
import java.util.Scanner;

public class Losowanie {

    public static void main(String[] args) {
        //   Napisać program, który wczytuje od użytkownika liczbę oznaczającą, ile należy wylosować liczb z zakresu od -100 do 100.
        //   Następnie dokonuje obliczeń stosunku wylosowanych liczb dodatnich (bez zera) do liczb ujemnych oraz najmniejsze i największej znalezionej liczby.
        //   Wynikiem działania programu powinna być informacja na temat wszystkich trzech wartości.

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Ile liczb należy wylosować? ");

        int ileLosowan = scanner.nextInt();
        int liczbyDodatnie = 0;
        int liczbyUjemne = 0;
        int min = 101;
        int max = -101;
        for (int i = 0; i < ileLosowan; i++) {

            int liczba = r.nextInt(201) - 100;

            System.out.print(liczba +", "+"\r");
            System.out.println();

            if (liczba > 0)
                liczbyDodatnie++;
            else if
            (liczba < 0)
                liczbyUjemne++;

            if (liczba < min)
                min = liczba;

            if (liczba > max)
                max = liczba;
        }

        double stosunek = liczbyDodatnie / (float)liczbyUjemne;
        System.out.println(stosunek + ", " + min + ", " + max);

    }
}





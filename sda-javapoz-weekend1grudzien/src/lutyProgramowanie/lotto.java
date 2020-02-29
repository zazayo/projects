package lutyProgramowanie;

import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        /* Napisz program symulujący grę w Lotto:
a. Użytkownik typuje 6 cyfr
b. Program losuje 6 cyfr z liczb od 1 do 49
c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
d. Program wypisuje na ekranie wylosowane cyfry
e. Program wyświetla wynik użytkownika w poniższej formie:
i. Trafiono n z 6 cyfr
f. *Upewnij się że użytkownik podaje 6 różnych liczb
g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
h. ! Skorzystaj z klasy java.util.Random */


        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int[] liczbyOdUzytkownika = new int[6];

        System.out.println("Podaj kolejno 6 liczb od 1 do 49: ");
        liczbyOdUzytkownika[0] = scanner.nextInt();
        liczbyOdUzytkownika[1] = scanner.nextInt();
        liczbyOdUzytkownika[2] = scanner.nextInt();
        liczbyOdUzytkownika[3] = scanner.nextInt();
        liczbyOdUzytkownika[4] = scanner.nextInt();
        liczbyOdUzytkownika[5] = scanner.nextInt();

        int[] liczbywylosowaneLosowo = new int[6];

        for (int i = 0; i < liczbywylosowaneLosowo.length; i++) {
            liczbywylosowaneLosowo[i] = r.nextInt(49) +1;
        }

        for (int i = 0; i < liczbyOdUzytkownika.length; i++) {
            System.out.print(liczbyOdUzytkownika[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < liczbywylosowaneLosowo.length; i++) {
            System.out.print(liczbywylosowaneLosowo[i] + ", ");
        }

        int zliczenia = 0;

        for (int i = 0; i < liczbyOdUzytkownika.length; i++) {
            for (int j = 0; j < liczbywylosowaneLosowo.length; j++) {
                if (liczbyOdUzytkownika[i] == liczbywylosowaneLosowo[j]) {
                    zliczenia++;
                }
            }
        }
        System.out.println();
        System.out.println("Trafiono " + zliczenia + " z 6 liczb");

    }
}
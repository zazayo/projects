package zajecia2grudzien;

import java.util.Scanner;

public class Podatek {
    public static void main(String[] args) {
        Scanner podatek = new Scanner(System.in);

        System.out.println("Podaj wartość dochodu");
        // final double PROG_PODATKOWY = 85_528

        double dochod = podatek.nextDouble();
        // if (dochod > 3091 && dochod <= PROG_PODATKOWY)

        if (dochod > 3091 && dochod <= 85_528) {
            System.out.println("podatek wynosi " + (dochod * 0.18 - 556.02));
        } else if (dochod > 85_528) {
            System.out.println("podatek wynosi " + (14_839.02 + (dochod - 85_528) * 0.32));
        } else if ( dochod >= 0 && dochod <3091) {
            System.out.println("Podatek wynosi 0");
        } else {
            System.out.println("błędne dane");
        }
    }

}



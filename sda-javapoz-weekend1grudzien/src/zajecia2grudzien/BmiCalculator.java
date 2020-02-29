package zajecia2grudzien;

import java.util.Scanner;

public class BmiCalculator {

    public static void main (String [] args) {

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Podaj wagę w kg");

        double waga = czytnik.nextDouble();

        System.out.println("Podaj wzrost w metrach");

        double wzrost = czytnik.nextDouble();

        double bmi = (waga/ Math.pow (wzrost, 2));
                // wersja bez Math.pow :
       // double bmi2 = waga / (wzrost*wzrost);    NAWIAS!

        System.out.println("BMI wynosi:" + bmi);

        if (bmi < 18.5 ) {
            System.out.println("Waga zbyt niska");
        } else if (bmi <25) {
            System.out.println("Waga OK");
        } else if (bmi <30) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otyłość");
        }
        System.out.println("Koniec programu...");
    }
}

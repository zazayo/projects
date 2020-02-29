package wdomugrudzien;

import java.util.Scanner;

public class PoleProstokąta {
    public static void main(String[] args) {

        Scanner poleProstokata = new Scanner(System.in);

        double a;
        double b;
        double pole;


        System.out.println("Podaj długość boku a:");
        a = poleProstokata.nextDouble();

        System.out.println("Podaj długość boku b:");
        b = poleProstokata.nextDouble();

        pole = (a*b);


        System.out.println("Pole prostokąta wynosi: " + pole);
    }
}

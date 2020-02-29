package lutyProgramowanie;

import java.io.Console;
import java.util.Scanner;

import static java.io.Console.*;

public class sumaCyfr {
    public static void main(String[] args) {

        String mojaLiczba = "5555";
        int suma = 0;
        for (int i = 0; i < mojaLiczba.length(); i++) {
            char c = mojaLiczba.charAt(i);

            String wartosc = String.valueOf(c);
            suma += Integer.valueOf(String.valueOf(c));

            // suma += Integer.valueOf(wartosc); --> wyjdzie to samo

        }

        System.out.println("Suma cyfr podanej liczby wynosi " + suma);
    }

}

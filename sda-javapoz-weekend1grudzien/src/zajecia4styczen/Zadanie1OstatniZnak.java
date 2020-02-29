package zajecia4styczen;

import java.util.Scanner;

public class Zadanie1OstatniZnak {
    static int countLastLetter(String text) {
        //pobranie ostatniej litery w napisie
        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1); //minus jeden bo zaczyna się od 0...
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if (lastLetter == litera) {
                counter++; //jezeli ostatnia litera zgadza sie z aktualna litera letter, to zwieksz licznik
            }
        }
        return counter;
    }

            public static void main (String[] args) {
                System.out.println("Podaj dowolny napis, a ja policzę ilość wystąpień ostatniej litery");
                Scanner scanner = new Scanner(System.in);
                String napis = scanner.nextLine();
                int liczbaWystapien = countLastLetter(napis);
                System.out.println("Ostatnia litera w wyrazie wytąpiła " + liczbaWystapien + " razy");
            }
        }



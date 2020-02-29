package zajecia4styczen;

import java.util.Random;

public class RandIntro {
    public static void main(String[] args) {


        Random rand = new Random();
        int losowaLiczba = rand.nextInt(10); // zakres 0-9
        int losowaLiczba2 = rand.nextInt(10) + 1; // zakres 1-10 ??


        System.out.print("Wylosowane liczby: ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");
        System.out.print(rand.nextInt(10) + 1 + ", ");

    }
}

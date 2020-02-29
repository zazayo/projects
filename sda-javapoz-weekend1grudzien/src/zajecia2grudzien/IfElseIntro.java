package zajecia2grudzien;

import java.util.Scanner;

public class IfElseIntro {
    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);

        System.out.println("Ile masz lat?");

        int wiek = czytnik.nextInt();

        if (wiek >= 18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");
        }
        System.out.println("Kończę pracę...");


    }
}

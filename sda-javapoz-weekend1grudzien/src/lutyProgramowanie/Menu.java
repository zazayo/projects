package lutyProgramowanie;

import java.util.Scanner;

public class Menu {
    /* pokazuje wszystkie dostepne akcje dla uzytkownika*/
    public void pokazGlowneMenu(){
        System.out.println("Witaj w aplikacji Lista Pracowników. Wybierz z menu co chciałabyś zrobić:" );
        System.out.println("1 - Wypisanie listy wszystkich pracowników (okrojone)");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Eksport danych");
        System.out.println("4 - Usuwanie danych");
        System.out.println("5 - Edycja danych");
        System.out.println("e albo q - Zakończenie aplikacji");
    }
    //do obslugi Menu
    public String pobierzAkcjeOdUzytkownika(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line.toLowerCase();
    }
}

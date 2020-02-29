package lutyProgramowanie;

import java.util.Scanner;

public class Firma {

    public static void main(String[] args) {
        Menu menu = new Menu();
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        String akcja = "";
        while (!akcja.equals("e") && !akcja.equals("q")) {  /*&& ponieważ tak mówią zasady logiki!*/
            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeOdUzytkownika();

            switch (akcja) {
                case "1": /*wyswietlic uzytkownika */
                    listaPracownikow.wypiszWszystkichPracownikow();
                    break;
                case "2": /* dodaj uzytkownika */
                    listaPracownikow.dodajNowegoPracownika();
                    break;
                case "3":
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.usunPracownika();
                    break;
                case "5":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.edytujPracownika();
                    break;
                case "e":
                case "q":
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Błędna akcja");
            }
        }



    }

}




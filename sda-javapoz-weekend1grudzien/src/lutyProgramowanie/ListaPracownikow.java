package lutyProgramowanie;

import java.util.Scanner;

public class ListaPracownikow {
    private Pracownik[] listaPracownikow = new Pracownik[100]; /* odnosi się do klasy pracownik */
    private int licznikPracownikow = 0;

    public ListaPracownikow() {
        Pracownik pracownik1 = new Pracownik("Filip", "Forszpaniak", 'M', '1', 200, 31, 0, true);
        listaPracownikow[licznikPracownikow++] = pracownik1; //muszą być ++, żeby przechodziło do kolejnej osoby

        Pracownik pracownik2 = new Pracownik("Agnieszka", "Sarbak", 'K', '4', 300, 27, 0, false);
        listaPracownikow[licznikPracownikow++] = pracownik2;
    }
    public void dodajNowegoPracownika() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imię: ");
        String imie = scanner.nextLine();

        System.out.println("Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Płeć: ");
        char plec = scanner.nextLine().charAt(0);

        System.out.println("Nr działu: ");
        int nr_dzialu = Integer.parseInt(scanner.nextLine());

        System.out.println("Płaca: ");
        float placa = Float.parseFloat(scanner.nextLine());

        System.out.println("Wiek:");
        int wiek = Integer.parseInt(scanner.nextLine());

        System.out.println("Dzieci: ");
        int dzieci = Integer.parseInt(scanner.nextLine());

        System.out.println("Stan cywilny: ");
        boolean stan_cywilny = Boolean.parseBoolean(scanner.nextLine());

        Pracownik nowyPracownik = new Pracownik(imie, nazwisko, plec, nr_dzialu, placa, wiek, dzieci, stan_cywilny);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;
    }
    public void wypiszWszystkichPracownikow() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                listaPracownikow[i].wypiszOkrojoneDane(i);
            }
        }
    }
    //System.out.println(listaPracownikow[i]); //zwróci tablicę z pracownikami
    private int ileMamyPracownikow() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                suma++;
            }
        }
        return suma;
    }
    public void usunPracownika() {
        int ileMamyPracownikow = ileMamyPracownikow();
        if (ileMamyPracownikow > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;
            System.out.println("Usunięto pracownika");
        } else {
            System.out.println("Masz pustą listę pracowników.");
        }
    }
    private int pobierzIndexPracownika() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj index pracownika do usunięcia: ");
        int index = Integer.parseInt(scanner.nextLine());
        return index;
    }
    public void edytujPracownika() {

    }
}


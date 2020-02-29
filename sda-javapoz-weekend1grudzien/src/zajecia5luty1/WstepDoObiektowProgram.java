package zajecia5luty1;

public class WstepDoObiektowProgram {
    //pierwsze przyklady tworzenia obiektów

    public static void main (String[] args) {

        // "student" jest obiektem typu osoba
        //tylko raz przypisujemy wartosc new Osoba ()
        //new Osoba(); ----> wywolanie konstruktora bezparametrowego klasy Osoba
        Osoba student = new Osoba();
        student.imie = "Agnieszka";
        student.nazwisko = "Sarbak";
        student.waga = 57;
        student.wiek = 26;
        student.wzrost = 1.65;

        // "uczen" jest obiektem typu osoba
        Osoba uczen = new Osoba();
        uczen.imie = "Piotr";
        uczen.nazwisko = "Kowalski";
        uczen.wiek = 15;
        //celowo pomijam dwie dane

        //odczyt pola
        String a = student.imie;
        System.out.println("Wartość pola to: " + a);

        //szybszy preferowany zapis
        System.out.println("Nazwisko studenta to: " + student.nazwisko);
        System.out.println(student.waga);

        //wartosci drugiego obiektu - ucznia
        System.out.println("Uczen.imie: " + uczen.imie);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.wiek);

        //zmiana nazwiska studenta
        System.out.println("Po zmianie nazwiska u studenta ");
        student.nazwisko = "AAAAAAAAAAAA";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);

        //tworzymy obiekty z użyciem konstruktora parametrowego

        Osoba pracownik = new Osoba("Anna", "Kowalska", 25);
        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

        //wywolujemy metodę przesrawSie

        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());

    }
}

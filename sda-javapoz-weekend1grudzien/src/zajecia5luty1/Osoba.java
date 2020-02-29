package zajecia5luty1;
public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;

    //kontruktor bezparametrowy tiruriru

    //jesli nie ma zadnego konstruktora to pusty konstruktor jest generowany automatycznie
    //jesli definiujemy jawnie konstruktor paramentrowy, to ten konstruktoe juz nie jest generowany automatycznie
    //jelsi potrzebujemy domyslnego konstruktora to musimy go definiowac JAWNIE
    //jesli usuniemy ten konstruktor to bedziemy musieli zawsze tworzyc obiekty osoba za pomocą konstruktora 3 argumentowego

    public Osoba () {
        System.out.println("Tworzę obiekt typu osoba...");
    }
    //mechanizm przeciążania konstruktorów

    public Osoba (String imie, String nazwisko, int w) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        //trzeci parament nazywa sie inaczej niz pole, wiec this.wiek nie potrzebne
        //można od razu wiek = w;
        wiek = w;
    }
    //definicja metody do opisu Osoby

    public String przedstawSie () {
        return "Na imię mam " + this.imie + ", nazywam się " + this.nazwisko + " i mam " + wiek + " lat.";

    }

}

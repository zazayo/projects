package zajecia2grudzien;

public class ForLoopIntro {
    public static void main(String[] args) {

        String imie = "Piotr";
        System.out.println(imie);

        for (int i = 0; i < 10; i++) {
            String nazwisko = "Kowalski";
            System.out.println(nazwisko);
            System.out.println(imie);
            System.out.println(i);
            System.out.println("Koniec pętli");
        }
    }
}

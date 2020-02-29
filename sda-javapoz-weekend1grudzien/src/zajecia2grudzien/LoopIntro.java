package zajecia2grudzien;

public class LoopIntro {
    public static void main(String[] args) {
        // prosta pętla while wypisująca wartości od 0 do 9
        int wiek = 20;


        System.out.println(wiek);
        //  1. zwiększenie wartości zmiennej
        wiek = wiek + 5;

        System.out.println(wiek);
        // 2.
        wiek += 7;
        System.out.println(wiek);

        // 3
        wiek += 1;
        System.out.println(wiek);

        // 4.
        wiek++;
        System.out.println(wiek);

        //5. post- versus pre- inkrementacja
        System.out.println("Pre vs post inkrementacja");
        System.out.println("Postinkrementacja: liczba ++");
        int liczba = 25;
        System.out.println(liczba++); //1 vs 0 ?? --> 0
        System.out.println(liczba);     // 1

        System.out.println("Preinkrementacja: ++number");
        int number = 38;
        System.out.println(++number);   // 1
        System.out.println(number);     //1


        //petla wypisujaca liczby od 0-9
        System.out.println("Petla while...");

        int licznik = 0;
        while (licznik < 10) {
            System.out.print(licznik++ + ", ");
        }

        System.out.println("Petla do while");
        int x = 20;
        do {
            System.out.print(x++ + ", ");
        } while (x < 10);


    }
}


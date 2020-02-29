package zajecia2grudzien;

public class PetlaZadanie1 {
    public static void main(String[] args) {
// wersja 1.
        System.out.println("Parzyste wersja 1");
        for (int i = 0; i <= 100; i++) {


            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

// ---------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Parzyste wersja 2");

        for (int i =0; i<=100; i+=2) {
            System.out.print(i + ", ");

        }

        // wypisać liczby nieparzyste od 0-100 w odrotnej kolejnosci

        System.out.println();
        System.out.println("Nieparzyste odwrotnie");

        for (int i = 99 ; i>=1; i-=2) {
            System.out.print(i + ", ");

        }

    }
}

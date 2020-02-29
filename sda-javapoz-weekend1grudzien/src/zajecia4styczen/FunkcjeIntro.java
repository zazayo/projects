package zajecia4styczen;

public class FunkcjeIntro {
    // prosta funkcja pobierająca 2 argumenty i zwracajaca ich sumę
    // funkcję / metody definiujemy w ciele Klasy a wiec nie w mainie

    static int dodaj(int a, int b) {
        return a + b;
    }
    // funckja która nic nie zwraca, ale wypisuje zawartość tablicy

    static void printArray(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }
        System.out.print('\b'); //kasujemy ostatni przecinek, dwa razy bo jeszcze spacja
        System.out.print('\b');
        System.out.print(" ]");
    }
    static int fibonacci (int n) {
        int fib1 = 1;
        int fib2 = 1;
        int suma = 0;
        for (int i = 3; i<=n; i++) {
            suma = fib1+fib2;
                    fib1=fib2;
                    fib2=suma;
        }
        return suma;

    }
    public static void main(String[] args) {
        int pierwszaLiczba = 10;
        int drugaLiczba = 20;

        int wynik = dodaj(pierwszaLiczba, drugaLiczba);
        System.out.println("Wynik dodawania: " + wynik);

        String[] imiona = {"Aga", "Adam", "Mateusz"};
        printArray(imiona);

        System.out.println();
        int liczba = 0;

        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));


    }
}

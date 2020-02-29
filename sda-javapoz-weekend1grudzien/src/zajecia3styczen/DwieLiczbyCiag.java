package zajecia3styczen;

import java.util.Scanner;

public class DwieLiczbyCiag {
    /* jkozak
    Napisac program pobierajacy od uzytkownika dwie liczby całkowite A oraz B,
   A < B, a nastepnie wyznaczajacy sume ciagu liczb od A do B, czyli sume ciagu
   (A,A + 1, . . . ,B). Obliczenia nalezy wykonac trzykrotnie stosujac kolejno petle:
   while, do-while, for.
   Przykład:
   Dla A = 4 i B = 11 program powinien wyswietlic:
   60
   60
   60 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę A: ");

        int liczbaA = sc.nextInt();

        System.out.println("Podaj liczbę B: ");
        int liczbaB = sc.nextInt();

        if (liczbaA < liczbaB) {
            int suma = 0;
            for (int i = liczbaA; i <= liczbaB; i++) {
                suma += i;
            }
            System.out.println("Suma ciągu liczb wynosi: " + suma);


            // wersja z while

            suma = 0;  //piszemy to zeby wyczyscic sume z poprzednich obliczen
            int index = liczbaA;
            while (index <= liczbaB) {
                suma += index;
                index++;
            }
            System.out.println("Suma ciągu liczb wynosi: " + suma);

            // wersja z do-while


        } else {
            System.out.println("Liczba A musi być mniejsza niż liczba B.");
        }

    }
}





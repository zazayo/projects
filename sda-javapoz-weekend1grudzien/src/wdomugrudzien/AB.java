package wdomugrudzien;

import java.util.Scanner;

public class AB {
    //Napisac program pobierajacy od uzytkownika dwie liczby całkowite A oraz B,
    //A < B, a nastepnie wyznaczajacy sume ciagu liczb od A do B, czyli sume ciagu
    //(A,A + 1, . . . ,B). Obliczenia nalezy wykonac trzykrotnie stosujac kolejno petle:
    //while, do-while, for.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość liczby całkowitej A:");
        int suma = 0;
        int A = 0;
        A = scanner.nextInt();
        System.out.println("Podaj liczbę B, która jest większa od liczby A:");
        int B = 0;
        B = scanner.nextInt();
        if (B < A) {
            System.out.println("B musi być większe od A" + "\n" + "Podaj ponownie B:");
            B = scanner.nextInt();
        }

        for (int i = A; i <= B; i++) {
            suma += i;
        }
        System.out.println(suma);


        suma = 0;
        while (A <= B) {
            suma = suma + A;
            A++;
        }
        System.out.println(suma);


        suma = 0;
        int i = A;
        do{
            suma = suma + A;
            i++;
        }
        while (i <= B);
        System.out.println(suma);

    }
}


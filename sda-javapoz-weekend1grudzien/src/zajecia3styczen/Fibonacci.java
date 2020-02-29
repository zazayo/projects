package zajecia3styczen;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Który wyraz ciągu chcesz wyliczyć? ");
        int n = sc.nextInt();


        int fib1 = 1;
        int fib2 = 1;
        int suma = 0;
        System.out.println("fib(1) = " + fib1);
        System.out.println("fib(2) = " + fib2);

        for (int i = 3; i <= n; i++) { // bo pierwszą iteracje juz wyliczylismy
            suma = fib1 + fib2; //obliczanie kolejnego wyrazu

            fib1 = fib2;
            fib2 = suma;

            System.out.println("fib(" + i + ") = " + suma);
        }



    }
}


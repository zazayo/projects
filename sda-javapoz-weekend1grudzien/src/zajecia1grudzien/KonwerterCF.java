package zajecia1grudzien;

import java.util.Scanner;

public class KonwerterCF {

    public static void main(String[] args) {
        Scanner tempFarenheit = new Scanner(System.in);
        double temp;
        System.out.println("Temperatura w Farenheitach wynosi");

        temp=tempFarenheit.nextDouble();

        temp=((temp-32)/1.8);

        System.out.println("temperatura w celsjuszach: " + temp);



    }

}

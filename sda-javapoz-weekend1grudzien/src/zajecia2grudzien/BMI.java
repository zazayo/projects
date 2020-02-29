package zajecia2grudzien;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {


        Scanner calculatorBMI = new Scanner(System.in);

        double bodyMass;
        double height;
        double bmi;

        System.out.println("Podaj swoją masę w kg");
        bodyMass = calculatorBMI.nextDouble();
        System.out.println("Podaj wzrost w metrach");
        height = calculatorBMI.nextDouble();

        bmi = (bodyMass / (height * height));

        System.out.println("Twoje BMI wynosi:" + bmi);

        if (bmi > 18.5 && bmi < 25) {
            System.out.println("waga ok - waga w normie");
        } else {
            System.out.println("zly wynik - waga za duza/za mala");
        }

    }
}
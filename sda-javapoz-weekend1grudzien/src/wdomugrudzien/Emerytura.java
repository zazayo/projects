package wdomugrudzien;

import java.util.Scanner;

public class Emerytura {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Ile pieniędzy potrzebujesz do emerytury?");
        double cel = in.nextDouble();
        System.out.println("Ile pieniędzy rocznie będziesz wpłacać");
        double wplata = in.nextDouble();

        System.out.println("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double saldo = 0;
        int years = 0;

        while ( saldo < cel) {
            saldo += wplata;
            double odsetki = saldo * interestRate / 100; //przez 100 bo mnozymy przez %
            saldo += odsetki;
            years++;
        }
        System.out.println("Możesz przejść na emeryturę za " + years + " lat/a.");
    }

}

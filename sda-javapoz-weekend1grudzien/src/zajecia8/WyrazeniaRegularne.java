package zajecia8;

import java.util.Arrays;

public class WyrazeniaRegularne {
    public static void main(String[] args) {
        String tekst = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale.";
        String [] words = tekst.split("[ .,:]+"); //ten plus, żeby w wyniku spacje nie wlatywaly

        System.out.println(words.length + "|" + Arrays.toString(words));

        String newZdanie = tekst.replaceAll("a", "@");
        System.out.println(newZdanie);
    }
}

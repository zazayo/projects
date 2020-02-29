package zajecia8;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Daty58c {
    public static void main(String[] args) {

        ZonedDateTime dataCzas = ZonedDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy MM dd");

        String tekst = dataCzas.format(f);


        String tekst2 = "2020 02 28";

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate data = LocalDate.parse(tekst, f2);
        System.out.println(tekst);
        System.out.println(tekst2);
    }

}

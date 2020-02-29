package zajecia8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zmianaformatudaty {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate l1 = LocalDate.parse("2018-06-22", f1);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tekst = l1.format(f2);
        System.out.println(tekst);

    }
}

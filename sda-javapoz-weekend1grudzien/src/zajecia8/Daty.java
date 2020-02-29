package zajecia8;

import java.time.Duration;
import java.time.Instant;

public class Daty {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);  //pokaże czas angielski

       Instant instant1 = Instant.parse("2020-02-29T08:35:12.426595500Z");
       instant1 = instant1.minus(Duration.ofDays(05));
        System.out.println(instant1);

        Instant instant2 = instant1.plus(Duration.ofHours(8));
        System.out.println(instant2);

        boolean check = instant1.isBefore(instant2);
        System.out.println(check);

    }
}

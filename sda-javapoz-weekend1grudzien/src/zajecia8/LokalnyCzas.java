package zajecia8;

import java.time.LocalDate;
import java.time.Month;

public class LokalnyCzas {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specialDay = LocalDate.of(2022, 3, 11);
        LocalDate specialDay2 = LocalDate.of(2022, Month.FEBRUARY, 15);

        System.out.println(specialDay);
        System.out.println(specialDay2);

        String myBirthday = "1993-09-23";
        LocalDate myBirthdayLocalDay = LocalDate.parse(myBirthday);

        System.out.println(myBirthdayLocalDay);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);
    }
}

package zajecia8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import static java.time.Month.JANUARY;
import static java.time.Month.SEPTEMBER;

public class OkresDuration {
    public static void main(String[] args) {
        LocalDateTime myFatherBirthday = LocalDateTime.of(1947, JANUARY, 19, 10, 20);
        LocalDateTime myBirthday = LocalDateTime.of(1993, SEPTEMBER, 23, 10, 9);

        Duration duration = Duration.between(myFatherBirthday, myBirthday);
        System.out.println(duration.getSeconds());

        Period period = Period.between(myFatherBirthday.toLocalDate(), myBirthday.toLocalDate());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


    }
}

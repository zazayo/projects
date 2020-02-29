package zajecia8;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Chronologia {
    public static void main(String[] args) {
        LocalDateTime myFatherBirthday = LocalDateTime.of(1947, Month.JANUARY, 19, 7, 55);
        LocalDateTime myBirthday = LocalDateTime.of(1993, 9, 23, 10,9);

        long years = ChronoUnit.YEARS.between(myFatherBirthday, myBirthday);
        long months = ChronoUnit.MONTHS.between(myFatherBirthday, myBirthday);
        long weeks = ChronoUnit.WEEKS.between(myFatherBirthday, myBirthday);
        long days = ChronoUnit.DAYS.between(myFatherBirthday, myBirthday);
        long hours = ChronoUnit.HOURS.between(myFatherBirthday, myBirthday);
        long minutes = ChronoUnit.MINUTES.between(myFatherBirthday, myBirthday);
        long seconds = ChronoUnit.SECONDS.between(myFatherBirthday, myBirthday);
        long millis = ChronoUnit.MILLIS.between(myFatherBirthday, myBirthday);
        long nanos = ChronoUnit.NANOS.between(myFatherBirthday, myBirthday);
        System.out.println(years);
        System.out.println(months);
        System.out.println(weeks);
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);
    }
}

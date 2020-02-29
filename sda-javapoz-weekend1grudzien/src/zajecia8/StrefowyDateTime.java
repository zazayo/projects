package zajecia8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.TimeZone;

public class StrefowyDateTime {
    public static void main(String[] args) {
        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));

        ZoneId New_York = ZoneId.of("America/New_York");
        ZoneId London = ZoneId.of("Europe/London");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(New_York));
        System.out.println(ZonedDateTime.now(London));
        
    }
}

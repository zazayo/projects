package wdomugrudzien;

import java.util.Date;

public class Data {
    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("Aktualna data: " + nowDate);


        long timestamp = nowDate.getTime();
        System.out.println("Aktualna data(timestamo): " + timestamp);

        Date otherDate = new Date(123123123123L);
        System.out.println("Data stworzona z timestampu: "+ otherDate);
    }
}

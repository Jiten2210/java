package code.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDate1 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println(today + " " + tomorrow + " " + yesterday);

        LocalDate independenceDay = LocalDate.of(2020, Month.AUGUST, 15);
        DayOfWeek day = independenceDay.getDayOfWeek();
        System.out.println(day);

        DateTimeFormatter formatter =
                DateTimeFormatter
                        .ofPattern("MMM dd, yyyy - HH:mm");

        LocalDateTime parseDate = LocalDateTime.parse("Oct 22, 1991 - 04:05", formatter);
        String string = parseDate.format(formatter);
        System.out.println(string);


    }

}
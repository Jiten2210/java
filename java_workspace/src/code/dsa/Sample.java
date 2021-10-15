package code.dsa;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Sample {

    public static void main(String[] args) throws ParseException {
        Instant timestamp = new Date().toInstant();
        System.out.println(timestamp);
        DateFormat formatter = new SimpleDateFormat("dddd-MM-yy");
        String s = "2021-02-09";
        Date date = formatter.parse(s);
        System.out.println(date);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), ZoneOffset.UTC);
        System.out.println(String.valueOf(zonedDateTime));
    }
}

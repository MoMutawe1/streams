package questions_and_answers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Today's Date: " + localDate);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow's Date: " + tomorrow);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Is it a leap year: " + leapYear);
        System.out.println();

        // Parse a String into a CharSequence (Obtains an instance of LocalDate from a text string).
        String date = "2023-06-14";
        LocalDate ld = LocalDate.parse(date);

        System.out.println(ld);
        System.out.println("year: " + ld.getYear());
        System.out.println("month: " + ld.getMonth());
        System.out.println("day of year: " + ld.getDayOfYear());
        System.out.println("day of month: " + ld.getDayOfMonth());
        System.out.println("day of week: " + ld.getDayOfWeek());


        LocalTime sixThirty = LocalTime.parse("06:30");
        LocalTime oneThirty = LocalTime.of(1, 30);
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println("Local Time +1 : " + sevenThirty);

        int six = LocalTime.parse("06:30").getHour();
        System.out.println("Get Only hour: " + six);

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);

        System.out.println("Local Date Time: " + LocalDateTime.now());
    }
}

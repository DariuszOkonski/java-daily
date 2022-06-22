package Zajavka.week_08.day_42;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.ofYearDay(2020, 130);
        System.out.println(localDate.minus(5, ChronoUnit.CENTURIES));

        System.out.println(localDate.withMonth(Month.MARCH.ordinal()));
    }
}

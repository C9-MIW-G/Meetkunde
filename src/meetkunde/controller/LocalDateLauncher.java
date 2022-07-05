package meetkunde.controller;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class LocalDateLauncher {

    public static void main(String[] args) {
        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag.getMonth());

        LocalDate beginVan2021 = LocalDate.parse("2021-01-01");
        System.out.println(beginVan2021.getDayOfWeek());

        Lo

        LocalDate koningsdag2021 = LocalDate.of(2021, Month.JULY, 5);
        LocalDate koningsdag2022 = koningsdag2021.plusYears(1);
        if (koningsdag2022.isAfter(LocalDate.now()) || koningsdag2022.equals(LocalDate.now())) {
            System.out.println("Je hebt koningdag gemist, volgend jaar beter");
        }
    }
}

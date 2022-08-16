package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {
        //iki tarih arasindaki sureyi bulma

        LocalDate tarih=LocalDate.of(1996,4,16);
        LocalDate bugun=LocalDate.now();

        Period period=Period.between(bugun,tarih);

        System.out.println(period);
    }
}

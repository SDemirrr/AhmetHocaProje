package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1=LocalTime.now();
        System.out.println(time1);//19:12:00.478645100
        /*
        Bizim olusturdugumuz date ve time
        canli saat veya tarih degildir
        LocalTime.now() kullandgimiz tarih veya saati alip
        bizim variable'mize store eder.
        time1 variable'nin degeri SABITTIR.
         */

        Thread.sleep(3000);

        time1=LocalTime.now();

        System.out.println(time1);//
    }
}

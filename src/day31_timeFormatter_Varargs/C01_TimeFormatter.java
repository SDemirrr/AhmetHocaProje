package day31_timeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);
        //Ilk olusturulan tarih : 2022-07-25T21:41:13.449577

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/M/yyyy hh:mm");
        System.out.println(dtf1.format(tarihSaat));//25/7/2022 09:45

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));//25/Temmuz/2022 21:48

    }
}

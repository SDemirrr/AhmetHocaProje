package day30_immutable_date;

import java.time.LocalDate;
import java.time.LocalTime;

public class C05_StringVersesStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa String Builder'mi daha hizlidir
        bunu icin bir String olusturup 100 kere sonuna nokta ekleyelim
        oncesinde ve sonrasinda zamani alip
        aradaki farki bulalim

        ayni sekilde String Builder icinde yapalim
         */

        LocalTime baslangic=LocalTime.now();

        String str="Ahhhh Java";

        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }

        LocalTime bitis=LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("Strin zaman : "+(bitis.getNano() - baslangic.getNano()));

        baslangic=LocalTime.now();

        StringBuilder sb=new StringBuilder("Ahhhh Java");
        for (int i = 0; i <10000 ; i++) {
           sb.append(".");
        }


        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("Strin zaman : "+(bitis.getNano() - baslangic.getNano()));



    }
}

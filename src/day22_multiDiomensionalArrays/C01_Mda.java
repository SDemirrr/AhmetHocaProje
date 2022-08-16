package day22_multiDiomensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        /*tek katli Array'lerde Array'i direkt yazdiramiyoruz
        cunku Array non primitive data turudur ve her non primitive data
        direkt yazdirilamayabilir

        anck array'in icerisindeki lementleri direkt yazdirabiliyorduk
        cunku genelde primitive data turu veya Strring elemntler kullaniliyordu

        Multi=Diomensional array'lerde en dikkat edecegimiz konu
        ulasmak istedigimiz elemntin bir array mi yoksa
        primitive data mi oldugudur.

         */

        int [][] sayilar={{1,2,4,5,},{3,4}};

        /*
        Burada sayilar array'ini dusunursek 2 tane array vardir
        sayilar[0]=[1,2,4,5]

        ancak en icerdeki elemntlere ulasabilirsek direk yazdirabiliriz
         */

        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]
        System.out.println(sayilar[0]);//[I@6fadae5d

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//[[I@6fadae5d, [I@17f6480]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]

        /*
        array'i iki sekilde decalare edebiliyordok
        1-elemanlari direkkt yazabiliriz
         int [][] sayilar={{1,2,4,5,},{3,4}};

         2-outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz
         int[][] sayilar=new int[3][4];

         ancak 2. yontemle yaptigimizda array'lerin farkli uzunlukta olma ihtimali kalmaz
         bu ornek outer array'in 3 tane inner array'i vardir
         her bir inner ise 4'er elemani vardir
          eger inner arrayleri farkli uzunluklarda olusturmak istiyorsak
         mecburen birinci yonetemi kullanmaliyiz

         */
    }
}

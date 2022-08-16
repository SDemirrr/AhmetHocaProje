package day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar[]=new int[3];

        System.out.println(sayilar);//[I@19dfb72a
        //non-primitive data turundeki datalari
        //her zaman direkt yazdiramayiz
        //Array'i yazdirmak istersek Arrays classíndan yardim isteriz

        System.out.println(Arrays.toString(sayilar));//[0,0,0]

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="Hasan";

        System.out.println(Arrays.toString(sinifList));

        System.out.println(sinifList[1]);//sadece Hasan'i yazdiralim
        System.out.println(sinifList[0]);
    }
}

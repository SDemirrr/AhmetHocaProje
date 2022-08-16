package day20_arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        //iki sekilde Arraay olusturabiliriz
        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("Sayilar array'in uzunlugu : "+sayilar.length);
        //String lenght method'unda parante var Array'de yok
        System.out.println("harfler arrayinin uzunlugu : "+harfler.length);

        System.out.println(Arrays.toString(harfler));//  [null, null, null, null]

        //Harfler elemntinin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);//null

        System.out.println(harfler[5]);//ArrayIndexOutOfBoundsException

    }
}

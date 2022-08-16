package day21_arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary search eleman aramanin kisa yoludur
        Ancak binary search'un calismasi icin once
        array'in sirali hale getirlimesi gerekir
        Eger siralam yapmadan  binarySearch yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */

        String harfler[]={"Y","B","D","G","O"};
        String arananHarfler="Y";


        System.out.println(Arrays.binarySearch(harfler, arananHarfler));

        //binarySearch bize aradigimiz elemanin index'ini dondurur.
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarfler));


    }
}

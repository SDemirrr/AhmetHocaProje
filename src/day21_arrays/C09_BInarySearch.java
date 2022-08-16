package day21_arrays;

import java.util.Arrays;

public class C09_BInarySearch {
    public static void main(String[] args) {
        /*
        binarySearch method'u siralanmis array'de aradigimiz elemntin index'ini dondurur

        Ya aradigimiz elemnt array'de yoksa?
        (String'de inexOf bize olmayan elemntler icin -1 donduruyordu)

        Aradigimiz elemnt arra'de yoksa Java hem olmadigini
        hem de olsaydi nerede olacagini bize dondurur

        olmadigini ifade icin - kullanir
        olsayd nerede olacagini belirtmek icin nerede olacagini belirtip basina - koyar

         */

        int sayilar[]={3,5,1,4,7,0};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));//[0, 1, 3, 4, 5, 7]

        System.out.println(Arrays.binarySearch(sayilar, 1));//1
        System.out.println(Arrays.binarySearch(sayilar, 5));//4
        System.out.println(Arrays.binarySearch(sayilar, 10));//-7
        System.out.println(Arrays.binarySearch(sayilar, 6));//-6
        System.out.println(Arrays.binarySearch(sayilar, -100));//-1
    }
}

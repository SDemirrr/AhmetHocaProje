package day29_passByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        Birden fazla element iceren array ve arraylist yapilarda da
        passByValue gecerlidir.

        Eger method'da array veya list'in kendisi degistirilirse passByValue ozelligi sebebiyle
        java degisen degeri degil Array veya List'in orjinal degerini alir

        Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        Java obje degismedegi icin(referans ayni) ayni array veya list'i bize dondurur
        ancak icindeki elemanlar degismis olacaktir.

         */
        /*
        verilen 4 elemanli array'i
        method'a gonderelim
        method'da yeni 3 elmali bir array atayip
        bu yeni array'e rastgele 100'den kucuk 3 sayi atayalim
        method'da bu array'i yazdiralim

        main method'da da method call'dan yeniden method'u yazdiralim.
         */

        int arr[]={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("method call'dan sonra main method'da array : "+ Arrays.toString(arr));

    }

    private static void arrayiDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);

        System.out.println("method'da array : "+ Arrays.toString(arr));
    }
}

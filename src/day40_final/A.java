package day40_final;

public class A {


        protected String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";

       /*
       Bir variable final olarak tanimlandiysa baska classlardan veya
       icinde oldugumuz class'lardan bu variable'e baska
       deger atanmasi mumkun degildir.

       Madem ki degeri degistirilemiyor
       genel de static de yapilarak
       bu variable'a erisim kolaylastirilabilir.
       ve genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir.
        */

    final void finalMethod(){
        System.out.println("Final methodlar override edilemez");

        /*
        Bir method'u final olarak isaretlerseniz
        bu method degistirilemez demektir
        (override edilemez )
         */


    }


}

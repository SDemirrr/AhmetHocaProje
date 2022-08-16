package day04_dataCasting;

public class C05_Pre_Post_Incement {
    public static void main(String[] args) {
        int sayi1=10;

        int sayi2=sayi1+1;//sayi2 -->11
        sayi2 +=5;//sayi2-->16
        /*
        pre veya post incremen veya decrement sadece ++ ve -- islemi icin gecerlidir
        bu iki islem sayidan sonra veya once yazilmasina gore farkli iki islev gerceklestirir


         */

        int sayi3=sayi2++;//1- sayi2 1 artirilacak
                          //2-sayi2 degeri, sayi3'e atanacak

        int sayi4=++sayi1;//1- sayi1 1 artirilacak
                          //2-sayi1 degeri, sayi4'e atanacak


    }
}

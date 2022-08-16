package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {

    public static void main(String[] args) {
        /*
        Kullanicidan yasini girmesini isteyin
        Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        Exception verecek sekilde duzeltin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi girin");
        int yas=scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yas : "+yas) ;
            }
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
            System.out.println("Yas negatif olamaaz");
        }
    }
}

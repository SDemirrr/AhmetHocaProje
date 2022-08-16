package day13_methotCreation;

import java.util.Scanner;

public class C02_StringManipulation {

    public static void main(String[] args) {

         /*
         Kullanicidan bir sifre girmesini isteyin.Asgidaki sartlari sagliyorsa
         "Sifre basari ile tanimlandi" sartlari saglamazsa
         "Islem basarisiz, lutfen yeni bir sifre girin" yazdirin

         -ilk harf buyuk olmali
         -son harf kucuk olmali
         -sifre bosluk icermemeli
         -sifre en az 8 karakter olmali

          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre=scan.next();

        char ilkHarf=sifre.charAt(0);
        char sonHarf=sifre.charAt(sifre.length()-1);

        if (ilkHarf>='A'&&ilkHarf<='Z') {
            if (sonHarf>='a'&&sonHarf<='z') {
                if (!(sifre.contains(" "))) {
                    if (sifre.length()>=8) {
                        System.out.println("Sifre basari ile tanimlandi");
                    }
                }
            }
        }else System.out.println("Islem basarisiz, lutfen yeni bir sifre giriniz");




    }
}

package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
          /*
         Kullanicidan bir sifre girmesini isteyin.Asgidaki sartlari sagliyorsa
         "Sifre basari ile tanimlandi" sartlari saglamazsa
         "Islem basarisiz, lutfen yeni bir sifre girin" yazdirin
         ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin

         -ilk harf buyuk olmali
         -son harf kucuk olmali
         -sifre bosluk icermemeli
         -sifre en az 8 karakter olmali

          */

        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;

        while (!sifreBasariliMi){
            System.out.println("Lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            if (sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z') {
                System.out.println("Ilk harf buyuk olmali");

            }

        }



















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

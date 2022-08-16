package day18_while_doWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini
     ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

         */

        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        int pozSayiAd=0;
        int negSayiAd=0;
        int pozSayilarTop=0;
        
        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz");
            sayi=scanner.nextInt();
            if (sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAd++;
            } else if (sayi<0) {
                negSayiAd++;
                System.out.println("negatif sayi giremezsiniz");
            }
        }while (sayi!=0);
        System.out.println(pozSayiAd+" adet pozitif sayi girdiniz, toplamlari : "+pozSayilarTop);
        System.out.println(negSayiAd+" adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");
    }
}

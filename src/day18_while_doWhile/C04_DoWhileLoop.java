package day18_while_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi biitirin

         */


        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        //while ile yapalim
        /*
        Loop'larda kullanacagimiz variable'leri loop'tan once olusturmaliyiz
        while loop'ta loop'tan once olusturdugumuz bu variable'e atayacagimiz degeri iyi dusunmemiz gerekiyor.
         */
        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scanner.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek sayi");
            }
        }

        //do wile loop ile yapalim
        //do while loop'ta onceden olusturulan variable'e hangi deger atnadiginin hicbir onemi yok
        //kodumuz her durumda calisir
        /*
        do while'in dezavantaji
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlis bir islem yapilmamamsinia dikkat etmek gerekir

         */

        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scanner.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            }else {
                System.out.println("Girilen sayi tek sayi");
            }


        }while (sayi%2==0);

    }
}

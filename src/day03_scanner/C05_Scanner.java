package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan iki sayi alip
        bu sayilarin carpimlarini yazdiralim
         */

        //1.adim
        Scanner scan=new Scanner(System.in);

        //2. adim
        System.out.println("carpmak istediginiz iki sayiyi giriniz");

        //3.adim
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("iki sayi carpimi : "+(sayi1*sayi2));
    }
}

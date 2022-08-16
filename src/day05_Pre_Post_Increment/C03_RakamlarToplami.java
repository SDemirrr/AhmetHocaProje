package day05_Pre_Post_Increment;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {
        //kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();//5267
        int rakamlarToplami=0;
        int birlerBasamagi=0;

        //suanda sayi 5267 bb=0 rt=0
        birlerBasamagi=sayi%10;//7
        rakamlarToplami+=birlerBasamagi;
        sayi /=10;

        //suanda sayi 526 bb 7 rt 7
        birlerBasamagi=sayi%10;//6
        rakamlarToplami+=birlerBasamagi;
        sayi /=10;

        //suanda sayi 52 bb 6 rt 13
        birlerBasamagi=sayi%10;//7
        rakamlarToplami+=birlerBasamagi;
        sayi /=10;

        birlerBasamagi=sayi%10;//7
        rakamlarToplami+=birlerBasamagi;
        sayi /=10;
        System.out.println(rakamlarToplami);





    }
}

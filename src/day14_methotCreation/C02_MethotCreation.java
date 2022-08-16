package day14_methotCreation;

import day13_methotCreation.C04_MethotCreation;

public class C02_MethotCreation {
    public static void main(String[] args) {
        //verilen uc basamakli bir sayinin
        //rakamlari toplamini yazdiran bir methot yazdiralim
        
        int input=423;
        
        rakamlariTopla(input);
        C04_MethotCreation.topla(6,3);
        C01_MethotCreation.terstenYazdir("nuri");


    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz "+girilenSayi+" sayisinin rakamlar toplami :  "+rakamlarToplami);
    }
}

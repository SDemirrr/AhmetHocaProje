package day14_methotCreation;

import day13_methotCreation.C04_MethotCreation;

public class C01_MethotCreation {
    public static void main(String[] args) {
        //input olarak verilen 4 harfli bir String'i
        // tersten yazdiran bir methot olusturalim

        terstenYazdir("Okan");
        C04_MethotCreation.topla(6,5);


    }

    public static void terstenYazdir(String input){

        String tersInput=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);

        System.out.println("Verilen kelimenin tersten yazilisi : "+tersInput);
    }
}

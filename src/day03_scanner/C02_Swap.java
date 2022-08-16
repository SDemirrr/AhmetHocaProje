package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        /*
        verilen sayi1 ve sayi2 variablelerinin degerini degistiren bir program yaziniz(SWAP)
          orn: sayi1=15
          sayi2=20;

          kod calistiktan sonra
          sayi1=20
          sayi2=10

         */

        int sayi1=15;
        int sayi2=20;
        int sayi3;

        //sayi3 gecici kova

        //adim1- sayi2'yi bos kovaya koyalim
        sayi3=sayi2;//10   10   20

        //adim2-1.sayiyi 2. sayiya atayacagiz
        sayi2=sayi1;//20    10      20

        //adim3- bos kovadaki sayiyi sayi1'e atayalim
       sayi1=sayi3;//20    10    20

        System.out.println("swapten sonra sayi1 : "+sayi1);
        System.out.println("swapten sonra sayi2 : "+sayi2);

    }
}

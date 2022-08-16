package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //kullanicidan ismini isteyin girilen ismi
        //isminiz : Ismail    seklinde yazdiralim

        //insanlarin dunyasindan kodlarimizin bulundugu classa deger almak icin scanner classini kullaniriz

        //1-Scanner objesi olusturalim
        Scanner scan=new Scanner(System.in);

        //2- Kullaniciya ne istedigimizi soyleyelim
        System.out.println("Lutfen isminizi giriniz");

        //3-ulusturdugumuz scan objesi ile kullanicinin girdigi dergeri alip olusturacagimiz
        //uygun bir variabl'e atayalim
        String isim=scan.nextLine();

        System.out.println("Isminiz : "+isim);



    }
}

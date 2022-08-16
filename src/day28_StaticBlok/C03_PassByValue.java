package day28_StaticBlok;

public class C03_PassByValue {

    /*
    %25 indirimli fiyati heaplayip bize donduren bir method olusturun
     */

    public static void main(String[] args) {

        double satisFiyati=100;
        double indirimOrani=25;

        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati,indirimOrani);

        System.out.println(indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {

        double indirimliFiyat=satisFiyati-((satisFiyati*indirimOrani)/100);



        return indirimliFiyat;
    }
}

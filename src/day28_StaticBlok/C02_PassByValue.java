package day28_StaticBlok;

public class C02_PassByValue {

    public static void main(String[] args) {
       double satisFiyati=100;

        System.out.println(indirimliFiyat(satisFiyati));//90

        System.out.println(satisFiyati);//100

        System.out.println(indirimliFiyat(satisFiyati));//90
        //iki farkli method'da satisFiyati adinda variable olabilir
        //Java buna itiraz etmez cunku scope'lari farklidir




    }

    public static double indirimliFiyat(double orjinalFiyat){

        //method'umuz %10 indirim yapip
        //yeni fiyati main method'a dondursun

        double satisFiyati=orjinalFiyat*0.9;



        return satisFiyati;
    }
}

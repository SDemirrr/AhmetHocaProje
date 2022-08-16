package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class'ta calisirken
        her hangi bir class adini yazip .'ýa basarsak
        adini yazdigimiz class'daki tum STATIC class uyelerini gorebilir
        ve kullanabiliriz.
         */
        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0
        /*
        Class level variable'e deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz istemezsek deger atamayiz.
        Eger deger atamissak Java atadigimiz o degeri kabul eder
        ***Deger tamazsak Java bu variable'e default bir deger atamasi yapar
        in-->0
        String-->null
        boolean-->false
        char-->'' (hiclik)
         */

        /*
        baska class'daki instance variable'e obje olusturarak ulasabiliriz.
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu method icinde Static sayi 20 oldu

        System.out.println(obje1.isim);//mehmet
        System.out.println(obje1.degersizInstanceVariable);//default 0

        System.out.println(C02_StaticVariables.staticSayi);
        /*
        farkli bir class'dan C02 classíndan method ve variable'i
        kullandigimda C02 clas'inin tamami degil benim cagirdigim class
        uyeleri calisir.
         */

    }
}

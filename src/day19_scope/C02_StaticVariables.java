package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'e deger atamasak ta Java kabul ediyor.
     */

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
        obje'ler icin degil class icin gecerlidir.
         */
        System.out.println(staticSayi);//10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);//20
        /*
        instance bir variable'nin degerini bulmak icin obje'nin olusturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        Static variable'de ise class'in en basindan baslayarak
        isteenn satira kadar kodu takip edip
        static variable'nin son degerini bulmamiz gerekir.
         */

    }

    public static void staticMethod(){
        System.out.println(staticSayi);


    }

    public void staticOlmayanMethod(){
        /*
        static variable'ler class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static varable'leri
        gorebilir ve degistirebilirler.

        ***farkli method'larda static variable'nin hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        Method ne zaman cagrilirsa o anki static variable degerini
        method'da gorebiliriz
         */
        System.out.println(staticSayi);
        staticSayi=20;


    }
}

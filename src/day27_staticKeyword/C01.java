package day27_staticKeyword;

public class C01 {
    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        Class level'da iki tur variable olusturabiliriz
        static(class) variable
        instance(obje) variable

        static variable'ler tum class'dan kulanilabilirkan instance olanlar
        static olmayan method'lardan kullanilabilir.
        instance variable'ye static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable'ler obje variable'i oldugu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variable'ler class variable'i oldugu icim
        herhangi bir satirda  static variable'in degerini bulmak icin
        CLASSIN BASINDAN itibaren kod incelenmelidir.


         */

        C01 obje1=new C01();
        System.out.println("obje1'in rakam degeri : "+obje1.rakam);//5
        System.out.println("obje1'in sayi degeri : "+obje1.sayi);//10

        obje1.rakam+=1;
        sayi+=1;

        System.out.println("obje1'in rakam degeri : "+obje1.rakam);//6
        System.out.println("obje1'in sayi degeri : "+obje1.sayi);//11

        C01 obje2=new C01();

        System.out.println("obje1'in rakam degeri : "+obje2.rakam);//5
        System.out.println("obje1'in sayi degeri : "+obje1.sayi);//11

        obje2.rakam++;
        obje2.sayi++;
        System.out.println("obje1'in rakam degeri : "+obje1.rakam);//6
        System.out.println("obje1'in sayi degeri : "+sayi);//12



    }
}

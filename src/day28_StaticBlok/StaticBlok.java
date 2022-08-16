package day28_StaticBlok;

public class StaticBlok {

    static int sayi;
    static {
        /*
        Static blok, class uyelerinin tamamindan once calisir
        (main method'dan da once calisir)

        static blok class olusturuldugunda calisir
        genellikle de class'la ilgili olan ayarlamalar
        veya static variable'lere deger atamak icin kullanilir.

        static bloc'larin class icerisinde nerede oldugu onemli degildir
        once staric bloc'lar calisir

        birden fazla static bloc varsa, yukaridan asagi dogru calisir
         */
        System.out.println("Static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        System.out.println(sayi);




    }
    static {
        System.out.println("main method altindaki static blok calisti");
    }
}

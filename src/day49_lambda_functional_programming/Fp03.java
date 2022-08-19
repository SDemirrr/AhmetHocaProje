package day49_lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);

     buyukHarfleYazdir(liste);
        System.out.println();
        //buyukHarfleYazdir02(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizSirala(liste);
        System.out.println();
        uzunlukVeIlkHarfineGoreSirala(liste);
        System.out.println();
       // bestenBuyukleriSil(liste);qq
        //baslangiciAyadaSonuNolaniSil1(liste);
       // baslangiciAyadaSonuNolaniSil2(liste);
        uzunlugu8ile10arasiveOileBiteniSil(liste);




    }

    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    public static void buyukHarfleYazdir(List<String>list){

      list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

  /*
   //2.yol
     public static void buyukHarfleYazdir02(List<String>list){

        list.replaceAll(String::toUpperCase);
        System.out.println(list);

    }

   */

    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String>list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGoreTekrarsizSirala(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakterAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void uzunlukVeIlkHarfineGoreSirala(List<String>list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakterAl)).
                forEach(Utils::ayniSatirdaBosluklaYazdir);


    }

    /*
    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.
    public static void bestenBuyukleriSil(List<String>list) {
        list.removeIf(t->t.length()>5);
        System.out.println(list);


    }

     */


   /*
   1.Yol
   //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    public static void baslangiciAyadaSonuNolaniSil1(List<String>list) {

        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
        System.out.println(list);
    }

    */


   /*
   //2.Yol
    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    public static void baslangiciAyadaSonuNolaniSil2(List<String>list) {

        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list);
    }

    */

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.
    public static void uzunlugu8ile10arasiveOileBiteniSil(List<String> list){

        list.removeIf(t->t.length()>7&&t.length()<11||t.endsWith("o"));

        System.out.println(list);
    }






}

package day10_stringManipulation;

public class C05_length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";

        System.out.println(str.length());//str'in karakter sayisini dondurur 19

        System.out.println(str.charAt(str.length()-1));//son karakterini yazdiralim p

        System.out.println(str.charAt(str.length()-3));//sondan ucuncu karakteri yazdiralim k

        /*
        Java'da null pointer bir deger degil, karsisina yazildigi variable'nin hicbir deger
        almadiginin isaretcisidir
         */

        String str2="";//str2'ye bir deger atanmismidir EVET
                        //bu deger nedir : HICLIK
        System.out.println(str2.length());//0

        String str3=null;//str3'e bir deger atanmis idir : HAYIR
                          //NULL bu deger atamamayi isaret etmektedir

        System.out.println(str3.length());//bir deger atanmamis ki nasil uzunlugu olsun der ERROR
    }
}

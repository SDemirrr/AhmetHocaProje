package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str="beni psikopata baglamayin";
        System.out.println(str.toUpperCase());//BENİ PSİKOPATA BAGLAMAYİN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
        //eger buyuk kucuk harf kullaniminda local bir dili esas almak istersek
        //bu yontemi kullanabiliriz
    }
}

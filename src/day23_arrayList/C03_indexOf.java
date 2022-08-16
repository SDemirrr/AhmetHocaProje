package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("Ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        System.out.println(urunler);//[nutella, Ikram, cekirdek, cay]
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);//[nutella, Ikram, cekirdek, cay]

        /*
        indexOf() method'u bize bilgi veren bir method'dur
        listemizi degistirmez
         */

        System.out.println(urunler.lastIndexOf("Ikram"));//1

        /*
        indexOf method'u urunu aramaya 0. index'ten lastIndexOf()
        metho'u ise aramaya son index'ten baslar.

        araam bitip urun bulundugunda,
        ikisi de bulunan urunun index'ini verir
         */

        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));
        System.out.println(urunler.lastIndexOf("Ikram"));

        System.out.println(urunler.indexOf("Hobby"));
        System.out.println(urunler.lastIndexOf("Hobby"));
    }
}

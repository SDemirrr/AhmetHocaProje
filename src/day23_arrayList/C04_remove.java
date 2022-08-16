package day23_arrayList;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;

public class C04_remove {

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("nutella");
        urunler.add("Ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

       /*
       remove() method'u iki sekilde kullanilir
       1- objeyi yazip silmesini istersek bize boolean sonuc doner
       2-index girersek o index'teki elemani siler ve bize silinen elemani dondurur
        */

        System.out.println(urunler);//[nutella, Ikram, cekirdek, cay]
        System.out.println(urunler.remove("Ikram"));//true
        System.out.println(urunler);//[nutella, cekirdek, cay]

        System.out.println(urunler.remove("Hobby"));//true
        System.out.println(urunler);//[nutella, cekirdek, cay]


        //ikinci yontemi deneyelim index girelim
        System.out.println(urunler.remove(1));//cekirdek
        System.out.println(urunler);//[nutella, cay]

        //olmayan bir indexi silmeye calisirsak ?
       // System.out.println(urunler.remove(3));//IndexOutOfBoundsException
    }
}

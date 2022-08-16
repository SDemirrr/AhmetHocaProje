package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);//[10, 20, 30]

        //listedeki tum elementleri index kullanmadan 3 artirin

        for (Integer each:list) {

            System.out.print(each+3+" ");

        }
        System.out.println(" ");
        System.out.println(list);//[10, 20, 30]

        /*
        Java index yapisi olmayan collection'lardaki
        elementlere ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur

        Iterator interface oldugundan ondan obje olusturmamiz mumkun degildir
        bunun yerine bize iterator donduren list,iterator() method'unu kullaniyoruz
         */

        Iterator it1=list.iterator();
        System.out.println(it1.next());//10
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
      //  System.out.println(it1.next());//30'dan sonra elemnt kalmadigindan next() RTE verir

        /*
        iterator'da geri donus yoktur adim adim sona ulastiktan sonra
        basa gelmek isterseniz yeniden bir iterator olusturmak gerek
         */


       // [10, 20, 30]
        Iterator it2=list.iterator();
        //yeni it2'yi kullanarak listenin tum elemntlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();

        System.out.println(list);//iterator ile elementleri gezip, remove yapinca
                                 //liste kalici olarak degisti



        System.out.println("yeniden liste : "+list);
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator it3=list.iterator();

        while (it3.hasNext()) {

            it3.next();
            it3.remove();

        }



        System.out.println("loop sonrasi liste : "+list);

        /*
        goruldugu gibi iterator kullanarak yapabilecegiiz
        1-tum collection elemntlerini yazdirmak
        2-tum collection elementlerini silmek
        Bu da bize yetmez
         */




    }
}

package day36_inheritenceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe {

    int saatUcret=11;
    int gunlukMesai=7;
    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcret*gunlukMesai)+" maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturlurken data turu ven cons ayni calass'dan ise
        direkt o class'a gidiyoruz.

        Eger data turu ve constructor farkli ise
        obje constructor'un oldugu classin objesidir
        ancak, bizden istenen
        Isci classindaki spesifik ozellikler degil
        Bir iscinin muhasebe classindaki tum calsianlarla
        beraber sahip oldugu genel ozellikleri yazdirir.


         */
        System.out.println(isc1.gunlukMesai);//muhasebe 8
        System.out.println(isc1.saatUcreti);//muhasebe 10
        isc1.maas();//Personel minumum : 2400 maas alir
        isc1.ozelSigorta();//muhasebe
        isc1.sigorta();//muhasebe
        System.out.println(isc1.isim);//personel
        System.out.println(isc1.soyIsim);//personel
        System.out.println(isc1.departman);//personel

        APersonel isc2=new DIsci();
      //  System.out.println(isc2.gunlukMesai);//personelde yok
      //  System.out.println(isc2.saatUcreti);//personelde yok
      //  isc2.ozelSigorta();//personelde yok
        isc2.maas();//Muhasebe
        isc2.sigorta();//personel
        System.out.println(isc2.isim);//personel
        System.out.println(isc2.soyIsim);//personel
        System.out.println(isc2.departman);//personel

        /*
        Eger Data turu aradigimiz class'da aradigimiz ozellik yoksa
        (varsa onun parentina gidebilir)
        ama childa donus olmaz
        Aradigi bilgiyi bulamazsa compile time error verir
         */

        List<String>list1=new LinkedList<>();
        Deque<String>list2=new LinkedList<>();
        Queue<String> list3=new LinkedList<>();

        /*
        Hepsi linked list olsa da
        list1 List gibi davranir
        list2 Deque gibi davraniz
        list3 Queee gibi davraniz
         */



    }
}

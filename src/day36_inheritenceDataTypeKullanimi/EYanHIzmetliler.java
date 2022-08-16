package day36_inheritenceDataTypeKullanimi;

public class EYanHIzmetliler extends BMuhasebe{
    int saatUcret=9;
    int gunlukMesai=8;


    protected void maas(){
        System.out.println("Yan hizmetliler : "+(30*saatUcret*gunlukMesai)+" maas alir");
    }


    protected void issizlikSigorta(){
        System.out.println("Yan hizmetliler %30 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        overriding child classdaki bir mthod'un
        parent classdaki ayni isimdeki methodu etkisiz hale getirerek
        kendisiinin spesifik ozelligini ortaya cikarmasidir.

        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise

        Bir obje olusturulurken data turu ve cons farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1-Obje constructor'un oldugu class'da olur
        2-Objenin ozelliklerini aramaya data trunun oldugu classdan baslariz
        bu class'da aranan ozellik bulunamazsa parent classlara bakilir
         orada da bulunamazsa CTE verir

        3- eger aranan ozellik variable ise budugmuz ilk degeri yazdiririz
         Aranan ozellik method ise degeri yazdirmadan once
         override edilmis mi diye kontrol etmemiz gerekir
         eger override edildiyse en guncel degeri yazdiririz

       */
        BMuhasebe yh1=new EYanHIzmetliler();
        System.out.println(yh1.gunlukMesai);//muhasebe 8
        System.out.println(yh1.saatUcreti);//muhasebe 10
        yh1.maas();//yan hizmetliler
        yh1.ozelSigorta();//Muhasebe
        yh1.sigorta();//Personel
        System.out.println(yh1.isim);//personel
        System.out.println(yh1.soyIsim);//personel
        System.out.println(yh1.departman);//personel
      //  System.out.println(yh1.issizlikSigorta);//aramaya muhasebeden
        //  basladigimizdan isssizlik sigorta bulamadik
        //issizlikSigorta CTE


    }
}

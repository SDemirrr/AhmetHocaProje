package day34_inheritence;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozellilerini inherite etmek istedikleri class'i
    kendilerine parent edinirler.

    mesela isci classini olusturunca nelere ihtiyaci var diye dusunsek
    Personel  class'indaki tum variable ve methodlara
    ihtiyaci oldugunu gorebiliriz
    Bu durumda yeniden o variable ve methd'lari olusturmak yerine
    Personel class'ini kendimize parent ediniirz

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    bir class baska bir class'i parent edindiginde
    1-Parent class'taki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2-Parent class'taki ozellklerden bazilarini kendine uyarlayabilir
    3-parent class'ta olmayan bazi yeni ozellikler olusturabilir
    not: parent class'taki ozelliklerden hicbirini reddedemez kulanmayabilir degistirebilir ama reddedemez
     */
    int personelNo=1001;

    public static void main(String[] args) {
       Isci isci1=new Isci();
        System.out.println(isci1.isim);//isim belirtilmedi
        isci1.isim="Selim";
        System.out.println(isci1.personelNo);//1001 kendi clasimizda varsa once onu kullanir

        isci1.maas();//Isciler minimum 15 euro saat ucreti alir
    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }

}

package day42_abstarctClass_Interface;

import java.util.List;

public interface I02_Interfaces  {
    int SAYI=30;
    String ISIM="Yildiz koleji";
    /*
    Interface bir class degildir

    Abstract class'lar Java'da abstraction yani(soyutlastirma/kural koyma)
    islemini yapiyordu ancak
    Abstract bir class'da abstract olmayan methodlar 'da olabilir
    bu da full abstraction yapmaya izin vermez

    Eger Java'da icinde hic concrete method olmasin
    dedigimiz bir class olusturmak istiyorsaniz
    bunu class ile degil Interface ile yapmalisiniz

    1-INTERFACE'LERDE CONCRETE METHOD OLMAZ
    2-INTERFACE'LERDE Full abstraction yaptigindan obje olusturulamaz

    -Hatirladiginiz gibi interface olan list'ten direkt obje olusturamayiz
       List<String>liste=new  List<>();
       bunun yerine constructor'u List'in child'i olan ArrayList'den seceriz
        List<String>liste=new  ArrayList<>();

        3-Class'larda bir chilad birdan fazla parent edinemez
        Ancak interface'lerde concrete method olmadigindan
        biz her method'u child'da override etmek zorundayiz
        Override ederken kimin soyledigini override ettigimizin onemi yoktur

        4-Interface'ler neyin yapilmasi gerektigini soyler
        ama nasil yapilacagina karismaz
     */





}

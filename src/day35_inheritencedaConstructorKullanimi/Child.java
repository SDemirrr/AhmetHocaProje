package day35_inheritencedaConstructorKullanimi;

public class Child extends BParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child kulubu";

    Child(){
        System.out.println("Child cons calistitructor");
    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();
        //bu objeyi calistirmak icin GrandPa cons calisir
        //parent veya child cons calismaz

        Child child1=new Child();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi icin child constructor'u calisir
        /*
        Java'da bir class'i kullanabilmek icin
        o class'da n obje olusturur, dolayisiyla
        o class'in constructor'unu kullanrdik

        Java inheritence'de parent class'lardaki
        ozellikleri kullanabilmek icin
        o class'larin constractor'larini
        otomatik calistiran bir yapi kurmustur

        ornegin biz child class'inda
        Child classindan bir obje olsturmak istedigimizde
        Child constructorunu kullaniriz

        Java child(){} gordugunde
        once parantecin consunu caistirmam lazim der
        buradan parrent cons'a gider

        Parent classinda Parent(){} gorunce
        once bunun parentinin yani Grandeparent cons
        calismasi lazim gerekir der

        Boylece extends keywords olmayan classa kadar gide
        ve oradan baslayarak tum cons'lari calistirir
         */
    }
}

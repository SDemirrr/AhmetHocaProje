package day35_inheritencedaConstructorKullanimi;

public class BParent extends AGrandParent{
    protected String isim="Parent isim belirtilmedi";
    protected String parentKlupAdi="Parent kulubu";

    BParent(){
        System.out.println("Parent constructor calisti");
    }
}

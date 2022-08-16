package day36_inheritenceDataTypeKullanimi;

public class APersonel {
   protected String isim="Isim belirtilmedi";
   protected String soyIsim="Soyisim belitilmedi";
  protected   String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personel maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personele sigorta yapilir");
    }


}

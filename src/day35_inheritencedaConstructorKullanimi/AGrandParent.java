package day35_inheritencedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class'ta gorunmese bile bir constructor vardir
    Bu class'da obje olusturmakk istedigimizde
    default constructor devreye girecektir.

    Default constructor''i gozlemeleyemeyecegimiz icin
    onun yerine kullanabilecehimiz parametresiz cons olusturalim
     */
    protected String grandpaKlupAdi="Grandpa kulubu";

    AGrandParent(){
        System.out.println("Grandparen parametresiz cons calisti");
    }
}

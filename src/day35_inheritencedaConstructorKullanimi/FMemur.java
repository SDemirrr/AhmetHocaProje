package day35_inheritencedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    extends keyword kullanilan class'larda ister default
    constrator bulunsun
    istersek de biz yeni constroctor'lar olusturalim
    Java constructor'in ilk satirina
    super(); constructor call yazar

    super(); constructor call default constructor'a benxer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir constructor call yazarsak
    Java super(); constructor'unu siler

    Eger biz mudahele edip kendi cons call'umuzu olsuturmazsak Java'nin default olarak olusturdugu
     constructor call her zamn parametresizdir
     */
    FMemur(){
        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim){
        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {
        FMemur memur1=new FMemur("ali");
    }
}

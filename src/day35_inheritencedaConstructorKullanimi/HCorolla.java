package day35_inheritencedaConstructorKullanimi;

public class HCorolla extends GToyota {
    HCorolla(){
        System.out.println("Corolla parametresiz cons");
    }

   HCorolla(String isim){
        super(isim);
        System.out.println("Corolla parametreli cons");
    }

}

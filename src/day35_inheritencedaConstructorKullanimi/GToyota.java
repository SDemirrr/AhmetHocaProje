package day35_inheritencedaConstructorKullanimi;

public class GToyota {
    GToyota(){
            System.out.println("Toyota parametresiz cons");
    }

    GToyota(String isim){
       // super(isim); extends olmadigi icin super con call() u Java kabul etmez
        System.out.println("Toyota parametreli cons");
    }

}

package day35_inheritencedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("DizelCorolla parametresiz cons");
    }

    KDizelCorolla(String isim){
        super(isim);
        System.out.println("DizelCorolla parametreli cons");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1 = new KDizelCorolla("ali");
    }

}

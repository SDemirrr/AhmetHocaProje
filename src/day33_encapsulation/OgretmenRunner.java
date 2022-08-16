package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr1=new Ogretmen();

        ogr1.setIsim("Selim");
        System.out.println(ogr1.getIsim());
        /*
        Bu yontemde amac data hiding degil
        daha anlasilabilir bir kod amaclanmistir.
         */


    }
}

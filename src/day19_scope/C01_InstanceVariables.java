package day19_scope;

public class C01_InstanceVariables {
    /*
    Class icerisinde her yerden kullanmak istediginiz varable'i
    class level'da(Class'in icinde ama method'un disinda)
    Genelde clsaa level variable class'in basinda olusturulur.(sart degil)

    Class level'daki variable icin iki scope vardir;
    1-static variables(Class variable)
    2-Instance (static olmayan) variables (obje variable denir)
     */
    int instanceSayi=20;
    //static olmayip class level'da oldugu icin instance variable'dir.

    public static void main(String[] args) {
        int sayi=10;

       /* System.out.println(instanceSayi);
       instance variable static olmadigi icin static kulube uye main method'dan direkt kullanamayiz.
       instane variable'lerin diger adi object variable'dir.
      *** Dolayisiyla obje olusturrsaniz instance variable'leri her yerde kullanabiliriz.
        */

        C01_InstanceVariables obje1=new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instanceSayi);//20
        obje1.instanceSayi=30;
        System.out.println("obje1 degistikten sonra : "+obje1.instanceSayi);//30

        C01_InstanceVariables obje2=new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : "+obje2.instanceSayi);//20
        obje2.instanceSayi=25;
        System.out.println("obje2 degistikten sonra : "+obje2.instanceSayi);//25

        C01_InstanceVariables obje3=new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : "+obje3.instanceSayi);//20
        /*
        her obje olustugunda instance(obje) variable'nin ilk atanan degereini alir.
         */



    }
    public static void staticMethod(){
       // System.out.println(sayi);
        /*
        BIr method'un icerisinde olusturulan variable sadece o method'un
        icinden kullanilabilir.(Local variables)
         */
        /*
        instanceSayi=30;
        insatance variable'e main method disindaki static methodlardanda direkt ulasamayiz
        obje olusturursak kullanilabilir.
         */
        C01_InstanceVariables obje4=new C01_InstanceVariables();
        System.out.println(obje4.instanceSayi);

    }

    public void staticOlmayanMethod(){
        System.out.println(instanceSayi);
        /*
        instance variable class icerisindeki staatic olmayam method'lardan
        direkt kullanilabilir.
         */



    }
}

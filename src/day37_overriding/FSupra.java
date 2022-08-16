package day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        private method'lar override edilemez
        Eger child class'da parent classdaki private method ile
        ayni sinature'de bir method olusturursaniz bu overridding OLMAZ
         */
    }

    @Override
    void motor() {
        System.out.println("Sırali 6 silindir 2JZ kullanır");
        /*
        @Override notasyonu Javaýa bir gorev verir
       Java, bu notasyonla birbirine bagli olan iki method'u
        surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz
        CTE verir

        @Override notasyonu kullanmak mecburi degildir
        Eger Overriding method silinirse , kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */
    }
}

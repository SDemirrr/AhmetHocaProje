package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ine ulasabildim,
        // degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);

        /*
        Access modifier kullanarak marka variabe'ine ulasimi
        tamamen serbest yapabilir veya tamamen engelleyebilirim

        Private yaptigimiz modele ise hic ulasamayiz
        yani Access modifier ya hep ya hic diyor

         */

        //model'i degistirelim ama goremeyilim
        //yakiti'da gorelim ama degistiremeyelim

        //set ve get yetkilerini ozel olarak tanimlamak isterseniz
        //1.adim- ozel yetki tanimlayacaginiz variable'leri private yapin
        //      private bir data'ya baska class'lardan ulasmak mumku olmadigindan
        //2.adim-set yetkisi icin setter, get yetkisi icin getter method'lari olusturalim

        arb1.setModel("Corolla");//model olarak Corolla atadik
        //modeli yazdirma imkanimiz yok, cunku getter method yok

        System.out.println(arb1.getYakit());//elektrikli bilgisini yazdirabildik
        //yakiti degistiremeyiz cunku setter method'u yok


    }
}

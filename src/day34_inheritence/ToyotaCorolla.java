package day34_inheritence;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        Toyota classinda olusturdugumuz variable'i access modifier ile parent kisitlayabilir
        private yaparsa burdan ulasamayiz
         */

        ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.model);//Model belirtilmedi

    }
}

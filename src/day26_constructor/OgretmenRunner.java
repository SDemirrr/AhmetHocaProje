package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("Ogretmen 1 "+ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Emre","Akdogan","1/1/2001","Mtematik","Fizik");
        System.out.println("Ogretmen 2 "+ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","Kabinkara","11/11/2000");
        System.out.println("Ogretmen 3 "+ogretmen3);

    }
}

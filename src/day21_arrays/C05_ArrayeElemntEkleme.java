package day21_arrays;

import java.util.Arrays;

public class C05_ArrayeElemntEkleme {
    public static void main(String[] args) {
       // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifList={"Ali Can","Selim Deniz","Musa Yaman"};

        String eklenecekIsim="Mahir Abey";

        sinifList=elemanEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));

    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {

        String yeniList[]=new String[sinifList.length+1];//[null, null]
        //eski listeden bir eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i <sinifList.length ; i++) {
            yeniList[i]=sinifList[i];
        }
       // oncelikle eskil listedeki tum elmanlari yeni listeye tasidim

        yeniList[yeniList.length-1]=eklenecekIsim;
        //son indexe ise eklenecek ismi atadim



   return yeniList; }
}

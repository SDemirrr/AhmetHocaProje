package day21_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        String[] takimListesi={"Suleyman","Osman"};

        String eklnecekIsim="Semih";

      takimListesi=C05_ArrayeElemntEkleme.elemanEkle(takimListesi,eklnecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}

package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class C01_Set {
    /*
    Verilen bir array'deki tekrar eden elemntleri silip
    tekrarsiz halini array'e atayan kod yaziniz

     */
    public static void main(String[] args) {


        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};

        Set<Integer> tekrarsizSet = new HashSet<>();

        for (int  each:arr) {

            tekrarsizSet.add(each);
        }

        System.out.println("set : "+tekrarsizSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr=new int[tekrarsizSet.size()];

        System.out.println("tekrarsizArr : "+Arrays.toString(tekrarsizArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        int i=0;

        for (Integer each:tekrarsizSet) {
            tekrarsizArr[i]=each;
            i++;

        }

        System.out.println(Arrays.toString(tekrarsizArr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr=tekrarsizArr;
        System.out.println("arrayin son hali : "+Arrays.toString(arr));// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]







    }



}

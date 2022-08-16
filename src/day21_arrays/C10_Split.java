package day21_arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        split metho'u bir array method'u degil String method'udur
        ama array dondurdugu icin bu konuda anlatiyoruz

        split ile herhangi bir String'i istedigimiz sekilde parcalara bolup bir array
        haline getiriyoruz.
         */

        String str="Java ne kadar guzel";

       String kelimeler[]=str.split(" ");

        System.out.println(kelimeler[0]);
        System.out.println(kelimeler[1]);
        System.out.println(kelimeler[2]);
        System.out.println(kelimeler[3]);


    }
}

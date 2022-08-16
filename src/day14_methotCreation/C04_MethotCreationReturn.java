package day14_methotCreation;

public class C04_MethotCreationReturn {
    public static void main(String[] args) {
        /*
        verilen isim ve soyismi ilk harfi buyuk
        geriye kalanlari * olacak sekilde degistirip
        bize bu halini donduren bir method olusturun
        NOT:programin ilerleyen

         */

        String isim="Enes";
        String soyIsim="Bozkurt";

        String gizliIsim=isimGizleMethod(isim,soyIsim);
        System.out.println(isim+" "+soyIsim);
        System.out.println(gizliIsim);
    }

    public static String isimGizleMethod(String isim, String soyIsim) {
        isim=  isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\w","*");

        soyIsim=soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyIsim;

    }
}

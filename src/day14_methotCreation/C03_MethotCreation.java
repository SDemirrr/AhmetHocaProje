package day14_methotCreation;

public class C03_MethotCreation {
    public static void main(String[] args) {

        //Input olarak verilen isim ve soyismi
        //ilk harfi buyuk geriye kalan harfler * olacak seklide
        //I****** K***** seklinde yazdiran bir method olusturun

        String isim="Enes";
        String soyIsim="Bozkurt";
        ismiGizle(isim,soyIsim);//E*** B******
        System.out.println(isim+" "+soyIsim);//enes bozkurt
    }

    public static void ismiGizle(String isim, String soyIsim) {

      isim=  isim.substring(0,1).toUpperCase()+
              isim.substring(1).replaceAll("\\w","*");

      soyIsim=soyIsim.substring(0,1).toUpperCase()+
              soyIsim.substring(1).replaceAll("\\w","*");

        System.out.println(isim.concat(" ").concat(soyIsim));
    }
}

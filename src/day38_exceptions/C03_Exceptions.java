package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir Array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o index'teki urunu yazdiran bir
        program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin
        onune gecelim
         */

        String urunler[]={"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan;
        System.out.println("Istediginiz urunun sira numarasini girin");

        int istenenSira=0;
        String hataKodu="";
        boolean kontrol=true;
        while (kontrol) {

            try {
               scan=new Scanner(System.in);
                istenenSira = scan.nextInt();
                kontrol=false;
            } catch (InputMismatchException e) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            }

        }


        /*
        catch blogunun onundeki parantezde exceptions class'inin ismi ve yaninda
        yakalanan exceptions'u atadigimiz variable'in ismi olur(e)

        Eger yakalanan exceptions ile ilgili bilgileri
        kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz
        eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
        e kullanilmasa da o kod calisir
         */





            try {
                System.out.println("Aradiginiz urun  : " + urunler[istenenSira - 1]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + (urunler.length) + " olabilir");
            }






    }
}

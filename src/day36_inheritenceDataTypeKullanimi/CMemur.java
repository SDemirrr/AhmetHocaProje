package day36_inheritenceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{
    int saatUcret=12;
    int gunlukMesai=9;


    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcret*gunlukMesai)+" maas alir");
    }




    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
       CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcret);//12
        mmr1.ozelSigorta();//Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();//Tum personele sigorta yapilir
        System.out.println(mmr1.isim);//Personel
        System.out.println(mmr1.soyIsim);//Personel
        System.out.println(mmr1.departman);//Personel

        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar Memur classinin icinde olsak da
        olusturdugum obje Muhasebe classindan
        cunku data turu ve constroctor Muhasebe
         */

       /* String str="Murat";
        ArrayList<Integer>list=new ArrayList<Integer>();
        Integer sayi=20;
        BMuhasebe classi da obje olusturulabilen bir classdir yani data turudur.
        */

        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10
        mhsb1.maas();//Muhasebe
        mhsb1.ozelSigorta();//Isteyen calisanlaraa %50 indirimli ozel sigorta yapilir//Muhasebe
        mhsb1.sigorta();//Muhasebe
        System.out.println(mmr1.isim);//Personel
        System.out.println(mmr1.soyIsim);//Personel
        System.out.println(mmr1.departman);//Personel



    }
}

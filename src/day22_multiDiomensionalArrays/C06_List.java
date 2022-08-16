package day22_multiDiomensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan sembol[]
        arrayList ise <> diamond(elmas) kullaniriz
         */

        List<String>isimler=new ArrayList<>();
        System.out.println(isimler);//[]

        //bir list'e eleman eklemek istersek
         isimler.add("Basak");

        System.out.println(isimler.add("Ayse"));//true doner

        System.out.println(isimler);//[Basak, Ayse]

        /*
        String'te bir method calistirdigimizda assign yapmazsak
        String degismiyor

        String isim="Suleyman";
        isim.toUpperCase();// SULEYMAN
        sout(isim)-->Suleyman
         */

        System.out.println(isimler);//[Basak, Ayse]

        /*
        List'in tek kotu tarafi array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.
         */
    }
}

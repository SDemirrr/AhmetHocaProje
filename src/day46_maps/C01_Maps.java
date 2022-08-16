package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {


        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Emre, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList);

        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, Javaci, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());//[101, 102, 103, 104]
        System.out.println(sinifList.values());//[Ali, Can, JDev, Emre, Cem, Tester, Taha, Emre, Javaci, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size());//4

        //tum ogrencilerin isimlerini ve soyisimlerini sira no ile alt alta yazdirin

      Collection<String> tumValueColl= sinifList.values();
      String[] eachArr;
      int sira=1;

        for (String each:tumValueColl) {

            //buradaki each bize her bir ogrenciye ait
            //ayni yapidaki isim,soyisim, brans bilgilerini iceren Stringler getiriyor
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;

        }

        /*
        Map'te bulunan ogrencilerin isim ve soyisimlerini birlestirerek
        bir sinif dizesi olusturun
         */

        List<String>sinifIsimSoyisimList = new ArrayList<>();


        for (String each:tumValueColl) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);
        }

        System.out.println(sinifIsimSoyisimList);









    }
}

package day24_arrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {

    public static void main(String[] args) {

        String[]arr={"Ismail","Nurullah","Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde
        tek tek eklemek yerine array olusturup, bunlarilist'e cevirmek
        daha pratik olabilir
        1-loop ile Array'deki tum lemanlari list'e cevirebiliriz
        2-Arrays.asList() kullanabiliriz
             Ancak bu method'un 2 taene kotu yan etkisi vardir
             -Array class'i kullanildigi icin array ozellilleri gecerli olur
             dolayiisyla list'te olan add, remove gibi size'i degistiren methodlar
             bu sekilde olusturulan list'lerde keullanilamaz
             -kaynak olan ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir.
         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList);//[Ismail, Nurullah, Fatih]

        List<Integer>sayilar=new ArrayList<>();

        //1.yan etki
       // sinifList.add("Erdi");//UnsupportedOperationException
      //  sinifList.remove(1);//UnsupportedOperationException

        arr[1]="Emre";
        System.out.println("degisim sonrasi array : "+Arrays.toString(arr));// [Ismail, Emre, Fatih]
        System.out.println("arrayi degistirince list : "+Arrays.toString(arr));// [Ismail, Emre, Fatih]

        sinifList.set(0,"Utku");
        System.out.println("Listi degistirince list : "+sinifList);//[Utku, Emre, Fatih]
        System.out.println("listi degistirince array : "+Arrays.toString(arr));//[Utku, Emre, Fatih]


    }
}

package day49_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*
    1)Lambda (functional programming ) Java 8 ile kullnailmaya baslanmistir.
    2)functional programming 'de "ne yapilacak" (What to do) uzerine yogunlasilir.
     Structred Programming "Nasil yapilacak" (How to do) uzerine yogunlasilir
    3)functional programming Arrays ve collections ile kullanilir.
    4)"entrySet()" method'u ile Map set'e donusturulerek functional programming'de kullanilabilir

     */

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructred(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStrugtured(liste);
        System.out.println();
        ciftElemanlariYazdirFunction(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);




    }
    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructred(List<Integer> list){

        for (Integer w:list) {
            System.out.print(w+" ");

        }
    }


    //1)Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list){


        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() method'u collection'dan elementleri akisa dahill etmek icin ve mthodlara ulasmak icin kullanilir


    }

   //2)çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStrugtured(List<Integer> list){

        for (Integer w:list) {
            if (w%2==0){
                System.out.print(w+" ");
            }

        }

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)

    public static void ciftElemanlariYazdirFunction(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list){
       list.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
        System.out.println();
       list.stream().filter(t->t%2==1).forEach(t-> System.out.print((t*t)+" "));
       //elemanlarin degerleri degisecekse map() kullanilir
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran
    // bir method oluşturun.

    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){
        list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t->System.out.print((t+" ")));

    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list){

      Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(u,t)->t+u);

        System.out.println(toplam);



    }


}

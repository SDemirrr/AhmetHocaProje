package day42_abstarctClass_Interface;

public interface I03_Interfaces  {

    int SAYI=20;


   /*
   int sayi;
   interface'lerde tum variableler public st   atic ve final'dir
   dolayisiyla sonradan deger atama sansimiz yoktur
   bunun icin variable olusturdugumuzda mutlaka deger atamaliyiz
    */


 /*
 interface icerisindeki her metod
 public ve abstract ozelliklere sahiptir

 abstract bir method'un body'si olmasi mumkun degildir
 Java sonradan developer'lari istegi uzerine kismi bir update yapmistir

 Bir interface'e sonradan bir abstract method eklerseniz o inerface'i
 daha once implement etmis tum class'lara gidip
 hepsinde yeni eklenen method'u override etmeniz gereki

 Bu da eskiden gelen projeler icin zor bir islemdir
 Bunun icin Java Java8'den itibaren
 interface'lere sonradan body'si olan method eklemesine karar vermistir

 Bu method'larin body'si olsa da interface'in yapisi geregi
 bu method'lara concrete denmez
 istisna diyebiliriz

  */
 void yakit();
  /*
        interface icindeki her method
        public ve abstract ozelliklerine sahiptir

        abstract bir method'un body'si olmasi mumkun degildir
         */

    public  void motor();
    public abstract void teker();

    static public void aku(){


    }


}

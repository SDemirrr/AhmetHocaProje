package day25_constructor;

public class car {

    /*
    Bu class kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan
    variable ve methd'lari bu class'da belirleriz

    sonra farkli class'larda araba olusturmamiz gerekirse
    bu cass'dan bir obje olusturup
    burada belirlenen variable ve method'lara gore araba uretiriz

     */

  public   String marka="marka belirtilmedi";
   public String model="model belirtilmedi";
  public   int yil;
   public int fiyat;

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
}

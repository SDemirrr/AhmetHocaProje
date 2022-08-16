package day25_constructor;

public class CarRunner {

    public static void main(String[] args) {
        car car1=new car();
        car1.fiyat=15000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Car1 bilgileri\nmarka :"+car1.marka+"\nmodel :"+car1.model
        +"\nyil :"+car1.yil+"\nfiyat :"+car1.fiyat);

        car car2=new car();
        System.out.println("Car2 bilgileri\nmarka :"+car2.marka+"\nmodel :"+car2.model
                +"\nyil :"+car2.yil+"\nfiyat :"+car2.fiyat);
        /*
        Herhangi bir obje uzerinden variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar

        1-o obje olusturulduktan sonra bir deger atandi mi?
        2-Obje'nin olusturuldugu class'da variableýe bir deger atanmis mi bakar
        3-o zaman data turune gore Java default deger atar
         */

    }
}

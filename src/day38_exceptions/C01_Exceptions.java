package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        Bir sorunla karsilasmayi beklediginz noktalarda if-else ile
        sorunu yakalayip onunla ilgili cozum uretebilirsiniz

        ama sorunu her zaman if-else ile cazemeyecegimizde Java try-catch bloklari olusturmustur
         */

        int a = 1000;
        int b = 50;
        int sayac=1;


        while (sayac<100){
            if (b==0){
                System.out.println("Islem yapilirken payda 0 oldu, dikkat etmelisiniz");
            }else System.out.println(a/b);
            b--;
            sayac++;
        }





    }





       }

package day39_exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) {

        String str;

        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i  kullanmaya calisirsak
        Java Compile Time'da bunu farkeder ve bize izin vermez
         */

        str=null;

        //System.out.println(str.length());
        //NullPointerException

        Object obj = "Java Java Java";
        Integer sayi=(Integer) obj;//ClassCastException

       /*
        String str2="Hava Civa";
        Integer sayi2=str2;

        Java bazi casting islemlerini Compile time'da izin vermez

       Ancak bazen syntax uygun olabilir
       bu durumda Java kodun calismasina itiraz etmez
         */
    }
}

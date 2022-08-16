package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {

    /*
    Java'da bilgisayarimizdaki bir dosyaya erismek istiyorsak
    FileInputStream Class'indan yardim aliriz.
    Ayni sekilde bilgisayarimizdan Java'ya dosyaekleme
    veya update yapmak istersek
    FileOutputStream Class'indan yardim aliriz
     */

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day39_exceptions/Test.txt");

        /*
        Goruldugu gibi compile time'da altini kirmizi cizen her durum
        Compile Time Error degildir

        Java'da bazi exceptionlar da
        Compile Time Exception'dur

        Ozellikle dosya yazma ve okuma ile ilgili Exception'lar
        Compile Time Exception'dur

        Compile Time Exception olustugunda Java cozum icin iki ihtimal onerr
        1-try-catch ile cevrelemek
        2-method signature'ine throws keyword ile beklenen exception turunu yazmak

        throws Exception, sadece olayin farkinda oldugumuzun deklarasyonudur
        exception'un handle edilmesinde hicbir rolu yoktur
        Yani try catch ile kontrol altina aldigimiz excepton'larda kod calismaya devam ediyordu
        Ancak throws Exception yazdigimizda Java bir excepton ile karsilasirsa
        hicbirsey yapmammisiz gibi hata mesaji verip, calismayi durdurur.
         */
    }
}

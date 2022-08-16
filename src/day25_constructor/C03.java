package day25_constructor;

public class C03 {
    /*
    proje olustururken bazi class'lar run etmek icin degil
    variable ve method olusturup
    bunlari baska classlardan olusturmak icin kullanilir
     */
    /*
    Default constructor, parametresizdir
    goremezsek bile ihtiyac oldugunda calisir

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olustrurrsak
    java default constructor'u siler
     */

    C03(){

    }
    /*
    olusturdugumuz parametreisz bu cons
    default constructor ile 1-1 aynidir
    ama biz olusturdugumuz icin buna default contructor demeyiz
    parametresiz constructor deriz
     */
    String isim="Etka";


    public void method1(){
        System.out.println("C03 method calisti");
    }
}

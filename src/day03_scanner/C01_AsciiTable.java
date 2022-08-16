package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        //bir tamsayi bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf);//107
        System.out.println(str+harf);//banana
        System.out.println(harf+2);

       // char yeniHarf=harf+2;

        /*
        1-char data turu isleme girdigi degiskenin turune gore farkli davranabilir
        eger matematiksel isleme girdigi variable sayisal olarak bir degerse sayi gibi davranir
        sayi+harf sayi variableí int oldugundan harf variablei ascii tablosundan 97 degerini kullanir

        char yeniHarf=harf+2; java once sagdaki islemi yapar sagda int+char gorunce asciii
        sonra atama islemini yapmaya calisir
        vhar yeniHarf=99;
        bu atama java acisindan kabul edilebilir degildir

        2- str+harf;//banana String variable cok gucludur, hangi data turu ile isleme girerse girsin
        diger data turunu kendine bnzetir



         */

        //peki... konsolda 10a gormek iserske nasil yazdirmaliyiz
        System.out.println(""+sayi+harf);

        char deger='1';
        System.out.println(deger+harf);

    }
}

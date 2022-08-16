package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("t"));//bana int dondurur. -1
                                             //int'da yok diye bir deger yoktur.
                                             //0 dersek J'nin indexi olur.
                                              //negatif bir dger verirsek String'in str'da olmadigini anlariz
                                              //Java -1 dondrmayi tercih etmistir

        String str5="lad;dh;lkd lkjf;l sj fl;dks ;lkj sflkdhfksjldhf;lakjhfl k";
        //str5'te f harfi kullanilmis midir?

        if(str5.indexOf("=")==-1){
            System.out.println("istenen harf kullanilmamistir.");
        }else System.out.println("istenen harf kullanilmistir.");
    }

}

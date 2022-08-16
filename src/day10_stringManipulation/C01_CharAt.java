package day10_stringManipulation;

public class C01_CharAt {
    public static void main(String[] args) {
        String str="Java ogrenmek ne guzel";
        System.out.println(str.charAt(0));//ilk harfi yazdirir
        System.out.println(str.toUpperCase().charAt(7));//R yazdirir
        System.out.println(str.charAt(21));//L verir
       // System.out.println(str.charAt(22));//hata
        //son harfi bulmak icin str'in uzunlugunun bir eksigini aliriz
        //index olarak uznluktan fazla deger verirsek hata verir
        //CharAt methodu kullandigimizda sonuc char olacagi icin manipulation yapanayiz
        //string methodlarindan kullanmamiz gereken bir method varsa charAt methodundan once kullanmaliyiz
    }

}

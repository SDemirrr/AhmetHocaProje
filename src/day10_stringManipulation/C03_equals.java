package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {
        String str1="Ali can";
        String str2="Ali CAN";
        String str3="Ali can"+ "";
        String str4="Ali can";
        String str5=new String("Ali can");

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//true
        System.out.println(str1.equals(str3));//true

        System.out.println(str1==str5);//false
        System.out.println(str1.equals(str5));//true

        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str5);//false

        /*
        String'lerde ayni String olsa bile == her zaman calismaz
        emin olmak icin equals() kullanmaliyiz
        equals() kullanirken dikkat etmemiz gereken String metinlerinin
        birebir ayni olmasidir
         */
    }
}

package day05_Pre_Post_Increment;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String str="Java Cok Guzel";

        str.toUpperCase();

        int sayi=10;
        //primitive dat turlerinin yaninda methodlar olmaz
        //Java bazi meethod'lari kullanabilmemiz icin
        //her bir primitive data turu icin bir wrapper class oluturmustur

        Integer sayi2=10;
        sayi2.byteValue();

    }
}

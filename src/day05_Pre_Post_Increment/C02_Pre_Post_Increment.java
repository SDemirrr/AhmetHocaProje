package day05_Pre_Post_Increment;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi=10;

        System.out.println("preincrement : "+ ++sayi);//11

        System.out.println("postincrement : "+ sayi++);//11

        System.out.println("postincrement'den sonra sayi : "+ sayi);//12
    }
}

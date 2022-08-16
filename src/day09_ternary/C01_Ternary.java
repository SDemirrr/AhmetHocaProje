package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve mutlak degerini olusturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi= scanner.nextDouble();

        System.out.println(sayi > 0 ? sayi : -1 * sayi);
    }
}

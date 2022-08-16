package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
       // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
        // @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi "
        // , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen email adresini giriniz");
        String email=scanner.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("lutfen email adresi giriniz");
        } else if (email.lastIndexOf("@gamil.com")==email.length()-10) {
            System.out.println("email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}

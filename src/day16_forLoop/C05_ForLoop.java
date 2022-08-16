package day16_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve
        // aralarindaki tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        int sayi1=2;
        int sayi2=1;

        sayilariTopla(sayi2,sayi1);

    }

    public static void sayilariTopla(int sayi2, int sayi1) {
        int toplam=0;

    if (sayi1<=sayi2) {
        for (int i = sayi1; i <= sayi2; i++) {
            toplam += i;


        }

        System.out.println("Girilen sayilar ve aralrindaki sayilarin toplami=" + toplam);
    }else {
        for (int i = sayi2; i <= sayi1; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
    }
    }
}

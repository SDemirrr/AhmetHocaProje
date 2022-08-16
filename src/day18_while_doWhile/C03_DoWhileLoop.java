package day18_while_doWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loop'ta once kontrol edip sonra islem yaptigimiz icin
         */
        int sayi=7;
        while (sayi<10){
            System.out.print(sayi+" ");
            sayi++;
        }
        System.out.println("");

        /*
        do-while ile calistigimizda bu dezavantaj ortadan kalkar
         */

        sayi=7;

        do {
            System.out.print(sayi+" ");
            sayi++;

        }while (sayi<10);
    }
}

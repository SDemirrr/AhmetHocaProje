package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20'den 50'ye kadar(sinirlar dahil) cift sayilari yazdiralim

        int baslangic=20;
        int bitis=50;

        for (int i =baslangic; i <=bitis ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");
        int temp=baslangic;
        while (temp<=bitis){
            if (temp%2==0) {
                System.out.print(temp+" ");
            }
            temp++;

        }

    }
}

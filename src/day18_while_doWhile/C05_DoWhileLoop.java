package day18_while_doWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
  9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
       */

        for (int i = 9; i <=190 ; i++) {

            if (i%7==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");

        int baslangic=9;
        int bitis=0;
        int temp=baslangic;

        //while

        while (temp<bitis) {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } System.out.println("");
        temp=baslangic;

            //do-while

            do {
                if (temp%7==0){
                    System.out.print(temp+" ");
                }
                temp++;}
            while (temp<bitis);

            }

    }


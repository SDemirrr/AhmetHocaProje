package day18_while_doWhile;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

        int input=5432;

        int rakamlarTop=0;
        int birlerBas=0;
        int temp=input;

        birlerBas=temp%10;
        rakamlarTop+=birlerBas;
        temp/=10;

        while (temp!=0){
            birlerBas=temp%10;
            rakamlarTop+=birlerBas;
            temp/=10;
        }
        System.out.println(input+ " sayisinin rakamlar toplami : "+rakamlarTop);
    }
}

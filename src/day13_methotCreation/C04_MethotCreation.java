package day13_methotCreation;

public class C04_MethotCreation {
    public static void main(String[] args) {

        //input olarak verilen 2 integer'i toplayip sonucu yazdiran bir methot olusturun

        int input1=30;
        int input2=20;

        //methot 4 adimda olusturulur
        //1.adim- methot call
        //2.adim- argument eklenmesi gerekiyorsa ekleyelim
        //eger method'un return type void'den farkli olacaksa
        //bir variable olusturup, methot call'u assign edelim

        topla(input1,input2);




    }



    public static void topla(int input1, int input2) {
        //3.adim- methot deklarasyonunda degismesi gereken bolumleri degistir
        //(access modifier, return type vb...)
        //4.adim- eger return type void disinda bir seyse return keyword'u
        //ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami : "+(input1+input2));
    }


}

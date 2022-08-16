package day15_overloading_forLoop;



public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen String'i terse cevirip yazdiran bir method olusturun

        String input="hasan";

      tersYaz(input);


    }

    public static void tersYaz(String input) {

        String tersInput=input.substring(input.length());

        for (int i =input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);

    }
}

package day49_lambda_functional_programming;

public class Utils {

    public static void ayniSatirdaBosluklaYazdir(Object obj){
        System.out.print(obj+" ");

    }

    public static boolean ciftElemanlariYazdir(int x){

        return x%2==0;

    }

    public static boolean tekElemanlariYazdir(int x){

        return x%2!=0;

    }

    public static int karesiniAl(int x){

        return x*x;

    }

    public static int kupAl(int x){

        return x*x*x;

    }

    public static double yarisiniAl(double x){

        return x/2.0;

    }

        public static char sonKarakterAl(String str){

       return str.charAt(str.length()-1);

    }
    public static char ilkKarakterAl(String str){

        return str.charAt(0);

    }


}

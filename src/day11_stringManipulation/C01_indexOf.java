package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {
        String str="Java ogrenmek cok guzel";
        /*
        verilen bir String'te herhangi bir String veya char'in
        ilk kullanidigi indexi bize dondurur
         */

        System.out.println(str.indexOf('g'));//6
        System.out.println(str.indexOf("r"));//7
        System.out.println(str.indexOf("j"));//-1
        System.out.println(str.indexOf("mek"));//10

        //eger istedigimiz index'ten sonrasini kontrol etmek istersek o zaman ayni methot'u
        //iki parametreli olark kullanabiliriz
        System.out.println(str.indexOf("g",6));//6 yazilan index'ten baslar

        //yukaridaki str'da ikinci ve ucuncu e'nin indexlerini bulun
        //ikinci e'yi bulmak icin birinci e'nin index'ine ihtiyacim var
        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);
        //eger ikinci e varsa ucuncu e'nin olup olmadigini
        //ve varsa indexini dondurelim

        if (ikincie==-1){
            System.out.println("verilen str'da ikinci e yok");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da ucuncu e yok");
            }else {
                System.out.println("str'daki index : "+ucuncue);
            }
        }
    }
}

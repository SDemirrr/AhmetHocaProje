package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {

        /*
        Java'da olusturdugumuz method'larin isminin yaptigimiz islerle uyumlu olmasini isteriz
        mesela bir String'in bir bolumunu almak icin Java
        2 adet substring() method'lari veya
        Verilen String'deki bazi parcalari yenileri ile degistirmek icin
        2 adet replace() method'u var.

        Java ayni isimde birden fazla method varsa
        hangisinin kullanilacagina parametre sayisi ve
        parametreelerin daa turune gore karar verir.
         */

        String str="Bu Java ogrenilecek, baska yolu yok";
        str.substring(2);
        str.substring(2,4);

       str.replace('c','v');
       str.replace("J","H");
       // str.replace(5,8);

        /*
        Ayni isimde ama farkli method'lar olusturmak icin
        degistirebilecegimiz seyler
        1- parametre sayisi
        2- ayni sayida parametreye sahip olsa bile,  parametrelerin data turlerini degistirebiliriz
        3- ayni sayida ve ayi data turlerinde turunde parametreleri olan method'larda
        parametrelerin siralanisi
         */

    }
}

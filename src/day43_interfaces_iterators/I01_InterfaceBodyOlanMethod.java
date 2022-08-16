package day43_interfaces_iterators;

public interface I01_InterfaceBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();

    /*
    normal bir class'da oldugumuzu dusunursek
    iki tane access modifier kullanma ihtimali OLAMAZ.


    asgidaki method'da goreceginiz gibi
    interface'de istisnei olarak body'si olan method'lar olusturulabilir
    bu ozellik Java8'den sonra kullanilmaya baslanmistir
    bu ozellikten once bir interface'e yeni bir method eklememiz gerktiginde
     eskiden beri bu interface'i implement eden tum class'lara gidip
     yeni eklenen method'u override etmmemiz gerekirdi

     bu ozellik sayesinde basina DEFAULT veya STATIC keyword ekleyerek
     interface'de yeni body'si olan bir method olustutrursak
     bu method'un child class'lar tarafindan everride edilme mecburiyeti olmaz
     ve eskiden implement etmis class'lari degistirmemiz gerekmez

     BU istisnai durumdur ve interface icin olusturulan
     genel kurallari bozmaz

     bu method'larin body'si olsa da bunlara concrete method denmez
     ama override edilme mecburiyetleri yoktur

     buradaki defult kelimesi access modifier degil
     istisnai durumun belirtilmesi icindir

     O zaman nicin iki keyword yani (static ve default) tanimlanmistir?
     Bu iki farkli kelimenin amaci child classlardan
     bu method'a nasil ulasilabilecegini belirlemek icindir
     static keyword kullanilirsa child class'lardan bu method'a erismek icin
     interfaceAdi.methoAdi yeterli olur

     default keyword kullanilirsa metgod'a erismek icin obje olusturlmalidir
     */

    public default void teker(){
        System.out.println("default tum arabalarin tekeri vardir");
    }

    public static void direksiyon(){
        System.out.println("static tum arabalariin direksiyonu vardir");
    }


}

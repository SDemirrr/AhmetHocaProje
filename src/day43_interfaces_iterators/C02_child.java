package day43_interfaces_iterators;

public  class C02_child implements I01_InterfaceBodyOlanMethod{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {

        return null;
    }


    /*
    parent interface'de abstract olan 3 method'u implement ettigimizde Java
    itirazini durdurur

    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz method'lari
    implement etmememiz sorun olusturmadi

    O zaman nicin iki keyword yani static ve default tanimlanmistir?
     Bu iki farkli kelimenin amaci child classlardan
     bu method'a nasil ulasilabilecegini belirlemek icindir
     static keyword kullanilirsa child class'lardan bu method'a erismek icin
     interfaceAdi.methoAdi yeterli olur

     default keyword kullanilirsa metgod'a erismek icin obje olusturlmalidir
     */
    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();
        C02_child obj=new C02_child();
        obj.teker();
    }


}

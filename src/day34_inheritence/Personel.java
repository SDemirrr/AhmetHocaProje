package day34_inheritence;

public class Personel {

        /*
          Eger parent class olacak sekilde tasarladiginiz bir class varsa
          veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
          variable ve method'larin a
          access modifier'ini protected
         */
    int persNo;
    String isim="Isim beirtilmedi";
    String departman="Deparman belirtilmedi";

    public void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    public void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }
    public void fazlaMesaiUcreti(){
        System.out.println("Persone fazla mesai ucretini statusune gore alir");
    }
}

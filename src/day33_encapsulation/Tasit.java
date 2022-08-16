package day33_encapsulation;

public class Tasit {
   private    String tasitTuru;
   private boolean muayenesiVarMi;
   private   int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }
    //getter method'u da tek satirlik bir islem yapiyor
    //baska class'larin private oldugu icin erisemedigi
    //tasit tru bigisini class icinden alip
    //istenen farkli class'lara return ediyor.

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
    }
    //return olmadığı icin bu methodun cağırıldığı
    // tasitrunner classinden yazdirilamaz
    //burada bir satırlık islem yapıyor o bir
    // satırlık islemde bizim gönderdiğimiz parametreyi instence variable a atıyor.


    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }
    //boolean variable'ler icin olusturulan getter methodlarinin
    //isVariableIsmi seklinde olur

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}

package day33_encapsulation;

public class Araba {

    String marka="Marka belirtilmedi";
   private String model="Model belirtilmedi";
   private String yakit="Elektrikli";//tum markalar elektrikli ise bu variablenin degistirilmemesi lazim
    //private yaptigimiz model ve yakit variable'lerine erisimi yetkilendirelim
    //model'e deger atanabilsim ama gorulemesin(setter)
    //yskit ise gorulebilsin ama yeni deger atanamasin istiyor(setter)

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}

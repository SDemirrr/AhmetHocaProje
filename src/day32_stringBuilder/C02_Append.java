package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java daha ne yapsin");
        sb.append('?');
        System.out.println(sb);

        //append istedigimiz String'i en sona ekler

       // sb.append(5);
       // sb.append(true);
       // System.out.println(sb);//Java daha ne yapsin?5true

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);//Java her seyi dusunmus, daha ne yapsin?
        //araya ekleme yapmak istersek insert kullanmaliyiz



    }
}

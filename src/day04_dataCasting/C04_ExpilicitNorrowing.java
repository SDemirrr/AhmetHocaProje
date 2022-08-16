package day04_dataCasting;

public class C04_ExpilicitNorrowing {
    public static void main(String[] args) {
        int sayi1=132;

        byte sayi2=(byte) sayi1;

        System.out.println(sayi2);//50

        /*
        genis data turundeki degeri dar data turundeki variabe'e atamak isterseniz
        Java sizin genis Java turundeki degerin dar data turunun sinirlarna uyup uymayacagini
         calistirana kadar bilemez ama Java risk almaz
         Riski sifira indirmak icin burada bir sorun olrsa sorumlulugu kabul etmenizi bekler
         bunun icin degerin onune parantez icerisinde istedigimiz data turunu
         yazmammiz yeterlidir
         */
    }
}

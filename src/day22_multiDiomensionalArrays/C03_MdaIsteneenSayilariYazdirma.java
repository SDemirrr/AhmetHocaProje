package day22_multiDiomensionalArrays;

public class C03_MdaIsteneenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen iki katli multi-diomensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        [0][0]+[1][1]+[2][2] .........
         */

        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        int toplam=0;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (i==j){
                    toplam+=sayilar[i][j];
                }

            }
        }
        System.out.println("sayilarin toplami="+toplam);
    }
}

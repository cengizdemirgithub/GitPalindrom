package seventh_package;

import java.util.ArrayList;
import java.util.List;

public class deneme2 {
    public static void main(String[] args) {
      /*
        String 2D array oluştur
       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
       String de $ varsa 3.2 ile çarp
       String de € varsa 4.2 ile çarp
       double return et
    */
        String arr[][] = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};
        carpMetodu(arr);
        carpMetodu1(arr[1][2], arr);
        System.out.println(carpMetodu(arr));
        System.out.println(carpMetodu1(arr[1][2], arr));

    }

    public static double carpMetodu1(String s, String arr[][]) {

        double sonuc = 0;
        double sonucEuro = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    sonuc = Double.valueOf(arr[i][j].replace("$", "")) * (3.2);

                    return sonuc;


                } else if (arr[i][j].contains("€")) {
                    sonucEuro = Double.valueOf(arr[i][j].replace("€", "")) * (4.2);
                    return sonucEuro;


                }


            }

        }
        return sonuc;

    }

    private static List<Double> carpMetodu(String[][] arr) {
        double sonuc = 0;

        List<Double> bos = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    sonuc = Double.valueOf(arr[i][j].replace("$", "")) * (3.2);
                    bos.add(sonuc);
                } else if (arr[i][j].contains("€")) {
                    sonuc = Double.valueOf(arr[i][j].replace("€", "")) * (4.2);
                    bos.add(sonuc);

                }


            }

        }
        return bos;


    }
}

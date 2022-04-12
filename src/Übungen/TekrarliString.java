package Übungen;

public class TekrarliString {
    public static void main(String[] args) {
         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
        String kullanici="ramazan ne güzel";
        int tekrar=0;
        for (int i = 0; i <kullanici.length()-2; i++) {
            for (int j = 1; j <kullanici.length()-3 ; j++) {
                if (kullanici.substring(i,j).equals(kullanici.substring((i+1),(j+1)))){
                    tekrar++;
                    System.out.println(kullanici.substring(i,j));
                    i++;


                }else {tekrar=0;

                    System.out.println(kullanici.substring(i,j)+ "tekrar etmiyor");
                    i++;

                }

            }

        }
    }
}

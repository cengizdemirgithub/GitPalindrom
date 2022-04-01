package fifth_package;

public class TheMostSimilarLetters {
    public static void main(String[] args) {
         /*
     Kullanicidan bir String aliniz.
     String'de en cok olan character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> 3

    */

        String user = "ramazan";

        int max = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < user.length() - 1; j++) {
                if (max < user.length()) ;
                if (user.substring(i, i + 1).equals(user.substring(j, j + 1))) {

                    max++;

                }

            }

        }
        System.out.println("en cok olan harf sayisi: "+ max);


    }


}


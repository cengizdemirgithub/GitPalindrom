package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCalisma {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle = scan.nextLine();
        enUzunKelime(cümle);
        System.out.println("en uzun kelime ya da kelimeler : " + enUzunKelime(cümle));


    }

    private static List<String> enUzunKelime(String cümle) {
        String str[] = cümle.split(" ");
        List<String> max = new ArrayList<>();
        String max_ = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max_.length()) {
                max_ = str[i];
                max.add(max_);
            } else if (str[i].length() == max_.length()) {
                max.add(str[i]);


            }

        }
        return max;

    }
}

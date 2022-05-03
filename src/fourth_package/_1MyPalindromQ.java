package fourth_package;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _1MyPalindromQ {
    static String str = "alala";

    public static void main(String[] args) {
         /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */


        List<Character> str_ = new ArrayList<>();
        List<Character> tersKarakterler = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            tersKarakterler.add(str.charAt(i));
        }
        System.out.println(tersKarakterler);

        for (int i = 0; i < str.length(); i++) {
            str_.add(str.charAt(i));

        }
        System.out.println(str_);
        if (str_.equals(tersKarakterler)) {
            System.out.println("bu bir palindromdur");
        } else System.out.println("palindrom degildir");



    }


}


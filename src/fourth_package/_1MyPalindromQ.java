package fourth_package;

import java.util.ArrayList;
import java.util.List;

public class _1MyPalindromQ {
    public static void main(String[] args) {
         /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        String str = "arbbrkla";

        List<Character> str_ = new ArrayList<Character>();
        List<Character> tersKarakterler = new ArrayList<Character>();
        for (int i = str.length()-1; i >= 0; i--) {
            tersKarakterler.add(str.charAt(i));
        }
        System.out.println(tersKarakterler);

        for (int i = 0; i < str.length() ; i++) {
            str_.add(str.charAt(i));

        }
        System.out.println(str_);
        if (str_.equals(tersKarakterler)) {
            System.out.println("bu bir palindromdur");
        }else System.out.println("palindrom degildir");

    }
}

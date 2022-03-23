package second_packege;

import java.util.Scanner;

public class _2MyStringManipulation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scan.nextLine();
        if (kelime.length() >= 3) {
            String sonIki = kelime.substring(kelime.length() - 2);
            System.out.print(sonIki + sonIki + sonIki);

        } else System.out.println(kelime);
    }
}

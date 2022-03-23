package second_packege;

import java.util.Scanner;

public class _3MyTerstenYazdir {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String kelime = scanner.next();
        int harfSayi = kelime.length();
        int indexSayaci = kelime.length() - 1;
        while (harfSayi > 0) {
            System.out.print(kelime.charAt(indexSayaci));
            harfSayi--;
            indexSayaci--;
        }


    }
}

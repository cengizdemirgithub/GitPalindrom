package fifth_package;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
         /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int carpanlarToplami = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                carpanlarToplami += i;
            }

        }
        if (sayi == carpanlarToplami) {
            System.out.println(sayi + " sayisi perfect sayidir");
        } else System.out.println(sayi + " sayisi perfect degildir");


    }
}

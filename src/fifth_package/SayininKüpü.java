package fifth_package;

import java.util.Scanner;

public class SayininKüpü {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Bir sayi giriniz");
        int sayi=scanner.nextInt();
        System.out.println((sayi*sayi*sayi)/2);
    }
}

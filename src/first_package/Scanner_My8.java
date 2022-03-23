package first_package;

import java.util.Scanner;

public class Scanner_My8 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        int sum=sayi1+sayi2;
        System.out.println(sayi1+" ile "+sayi2+ " nin toplami= "+sum);
    }
}

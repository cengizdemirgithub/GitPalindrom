package tasks;

import java.util.Scanner;

public class BIrlerOnlerYüzler {  /*
 * Kullanicidan uc basamakli bir sayi alin
 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
 *
 *
 * Ornek : Inputs : 853
 * Output : Girdiginiz sayinin birler basamagi : 3
 *          Girdiginiz sayinin onlar basamagi : 5
 *          Girdiginiz sayinin yuzler basamagi : 8
 *
 *
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("üc basamakli bir sayi giriniz: ");
        int sayi= 0;
        try {
            sayi = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("yanlis giris");

        }

        scanner.close();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yüzler=sayi/100;

        System.out.println("birler basamagi : "+birler+"\nonlar basamagi : "+onlar+"\nyüzler basamagi : "+yüzler);
        System.out.println(sayi);
    }

}

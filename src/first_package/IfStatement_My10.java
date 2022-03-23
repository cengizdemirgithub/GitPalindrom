package first_package;

import java.util.Locale;
import java.util.Scanner;

public class IfStatement_My10 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Y YES N NO=");
        char input=scanner.next().charAt(0);

        if (input=='Y'||input=='y'){
            System.out.println("YES");
        } else System.out.println("NO");


    }
}

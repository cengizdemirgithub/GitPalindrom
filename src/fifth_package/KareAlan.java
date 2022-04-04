package fifth_package;

import java.util.Scanner;

public class KareAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("karenin kenarini giriniz");
        int kenar=scanner.nextInt();
        int alan=kenar*kenar;
        int cevre=4*kenar;
        System.out.println("Alan="+alan+"\n"+"Cevre="+cevre);
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve
         dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

         */
        System.out.println("diktötgenin kenarlarini giriniz");
        int kenar1=scanner.nextInt();
        System.out.println("simdi ikinci kenar");
        int kenar2=scanner.nextInt();
        int dikCevre=(kenar1+kenar2)*2;
        int dikAlan=kenar1*kenar2;
        System.out.println("Dikdötgenin Cevresi: "+dikCevre+"\n"+"Dikdörtgenin Alani: "+dikAlan);


    }
}

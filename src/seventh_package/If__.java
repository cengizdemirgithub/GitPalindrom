package seventh_package;

import java.util.Scanner;

public class If__ {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT : Mustafa

        OUTPUT : fafafa*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("isim girniz");
        String isim=scanner.next();
        String yeniIsim=isim.substring(isim.length()-2);
        System.out.println(yeniIsim+yeniIsim+yeniIsim);
    }
}

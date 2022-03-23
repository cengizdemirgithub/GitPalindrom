package first_package;

import java.util.Scanner;

public class Scanner2_My9 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line
        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi, memleketinizi ve yasinizi yaziniz");
        System.out.print("adiniz= ");
        String ad=scanner.nextLine();
        System.out.print("memleketiniz= ");
        String memleket=scanner.nextLine();
        System.out.print("yasiniz= ");
        int age=scanner.nextInt();
        System.out.println("yasadiginiz yeri seviyorsaniz 1 e yoksa 0 tusa basiniz");
        int secim=scanner.nextInt();
        if (secim==1){
            System.out.println("hosdur");
        }else System.out.println("nein");


    }
}

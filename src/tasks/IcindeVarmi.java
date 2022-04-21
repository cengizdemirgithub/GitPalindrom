package tasks;

import java.util.Scanner;

public class IcindeVarmi {
    static boolean kontrol = false;
    static String str;

    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("birseyler yaziniz");

        try {
            str = scanner.next();

        } catch (Exception StringIndexOutOfBoundsException) {


        }
        for (int i = 2; i < str.length(); i++) {

            if (str.substring(i-2, i+1).equals("xyz")) {
                kontrol = true;
                break;
            }else ;

        }
        System.out.println("bu metin icinde \"xyz\" var midir? : " + kontrol);

    }
}
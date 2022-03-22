package three_package;

import java.util.Scanner;

public class _5MyForLoop {
    public static void main(String[] args) {
         /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satir giriniz");
        int sütun = scanner.nextInt();
        System.out.println("sütun giriniz");
        int satir = scanner.nextInt();
        for (int i = 0; i < sütun; i++) {
            System.out.print("*");
            for (int j = 0; j < satir - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }


    }
}

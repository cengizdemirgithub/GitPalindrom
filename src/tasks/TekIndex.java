package tasks;

import java.util.Scanner;

public class TekIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz :");
        String str = scanner.nextLine();
        System.out.println("tekli indexler: ");
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(str.substring(i, i + 1));
            }
            System.out.print(" ");
        }
    }}
package tasks;


import java.util.Scanner;

public class ÜsAlma {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        int num = 0;
        PowersofTwo(num);


    }

    public static void PowersofTwo(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir numara giriniz");


        try {
            num = scanner.nextInt();
            while(num<=0){
                System.out.println("hatali giris yeniden bir sayi giriniz");
                num = scanner.nextInt();
            }


        } catch (Exception e) {
            num = scanner.nextInt();


        }


        if (num < 0) {
            System.out.println("pozitif bir sayi giriniz");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0 && i % 2 != 0) {
                System.out.println(num + " sayisi 2 nin kuvveti degildir");
                num = 0;
            } else if (num % 2 != 0) {
                System.out.println("sayi 2nin kuvveti degildir");
                break;
            } else if (num != 0&&num%3!=0&&num%5!=0&&num%7!=0) {
                System.out.println(num + " sayisi 2 nin kuvvetidir");
                break;


            }


        }


    }
}

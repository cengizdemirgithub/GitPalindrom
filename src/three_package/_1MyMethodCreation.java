package three_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1MyMethodCreation {
    public static void main(String[] args) {/*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

        Scanner scan=new Scanner(System.in);

        System.out.println("sayilari giriniz\nilk sayi");
        int a=scan.nextInt();
        System.out.println("ikinci sayi: ");
        int b=scan.nextInt();
        System.out.println("islem secimi giriniz: +,*,-,/");
        char secim=scan.next().charAt(0);
        List<Character> islem= Collections.singletonList(secim);



        hesapMakinesi(a,b,islem,secim);


    }

    public static void hesapMakinesi(int a, int b, List islem, char secim) {
        int toplam=a+b;
        int carpim=(a*b);
        int cikarma=a-b;
        int bölme=a/b;
        List<Character> islem1=new ArrayList<Character>();

        islem1.add(secim);

        if(islem1.get(0)=='+'||islem1.get(0)=='*'||islem1.get(0)=='-'||islem1.get(0)=='/'){
        if(islem1.get(0)=='+'){
            System.out.println("sonuc: "+toplam);
        }else if(islem1.get(0)=='*'){
            System.out.println("sonuc: "+carpim);
        }else if(islem1.get(0)=='-'){
            System.out.println("sonuc: "+cikarma);
        }else if(islem1.get(0)=='/') System.out.println("sonuc: "+bölme);
        }
        else System.out.println("yanlis islem isareti");


    }
}

package Übungen;

import java.util.Random;
import java.util.Scanner;

public class SchereStein {
   static boolean x= true;
    public static void main(String[] args) {
        Random random = new Random();
        int stein = 1;
        int schere = 2;
        int papier = 3;
        Scanner scanner = new Scanner(System.in);

        int personEnts = 0;
        while(x){
        try {
            System.out.println("wählen sie ein 1 ist stein  oder 2 ist schere  oder 3 ist papier");
            personEnts = scanner.nextInt();
            break;
        } catch (Exception InputMismatchException) {
            System.out.println("falsche input probie mal");
        }}
        int computer = random.nextInt(1, 3);
        System.out.println("computer wählt:" + computer);


        while(x){
        try {
            if (computer == stein) {
                if (personEnts == stein) System.out.println("keine gewinner");
                else if (personEnts == schere) System.out.println("computer ist gewwinner");
                else if (personEnts==papier) System.out.println("person ist gewinner");
                else System.out.println("falsche input");
                break;
            }
            if (computer == schere) {
                if (personEnts == stein) System.out.println("person ist gewinner");
                else if (personEnts == schere) System.out.println("keine gewwinner");
                else if (personEnts==papier) System.out.println("computer ist gewinner");
                else System.out.println("falsche input");
                break;
            }
            if (computer == papier) {
                if (personEnts == stein) System.out.println("computer ist  gewinner");
                else if (personEnts == schere) System.out.println("person ist gewwinner");
                else if (personEnts==papier) System.out.println("keine ist gewinner");
                else System.out.println("falsche input");
                break;

            }
        } catch (Exception InputMismatchException) {
            System.out.println("yanlis giris hatasi");
            x=false;
        }

    }
}}

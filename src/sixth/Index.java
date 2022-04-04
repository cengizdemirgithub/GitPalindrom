package sixth;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuz");
        double kilo=scanner.nextInt();
        System.out.println("boyunuz");
        double boy=scanner.nextInt();
        double BMI=kilo/(boy*boy/10000);
        String endex=BMI<18.5?"zayifsiniz":(BMI>=18.5&&BMI<25?"ideal":((BMI>=25&&BMI<30)?"sisman":(BMI>=30?"obez":"yanlis")));
        System.out.println("Agirlik : "+kilo+"\n"+"Boy : "+boy+"\n"+"BMI : "+BMI+"\n"+endex);

    }
}

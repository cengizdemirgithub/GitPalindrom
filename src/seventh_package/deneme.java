package seventh_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayilar giriniz");

        String myStr = scan.nextLine();

        String[] arr = myStr.split("");

        int[] useThisArray = new int[arr.length];

        for (int i = 0; i < useThisArray.length; i++) {

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }
        System.out.println(Arrays.toString(useThisArray));
        List<Integer>tekrar=new ArrayList<>();
        for (int i = 0; i <useThisArray.length ; i++) {
            for (int j = 0; j <useThisArray.length ; j++) {
                if (String.valueOf(useThisArray[i]).equals(String.valueOf(useThisArray[j]))){
                    tekrar.add(useThisArray[i]);
                   if (String.valueOf(tekrar.get(i)).equals(String.valueOf(tekrar.get(j)))){
                       tekrar.remove(j);
                   }

                }

            }


        }
        System.out.println(tekrar);



    }
}

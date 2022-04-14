package Übungen;

import java.util.Arrays;

public class IsaretDegistirme {
    public static void main(String[] args) {
          /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  ve tersten yazan bir method yaziniz.
        input : 1,2,-3
        output :3,-2,-1

         */

        int arr[]={9,-2,-3};
        int temp[]=new int[arr.length];
        int a=0;
        for (int i = arr.length-1; i >=0 ; i--) {

            temp[i]=-(arr[a]);
            a++;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(temp));
    }
}

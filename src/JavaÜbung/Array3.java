package JavaÜbung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Array3 {

    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı

        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        //randomAdd(int[]arr);
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        int arr[] = {10};
        randomAdd(arr);


    }

    private static void randomAdd(int[] arr) {
        List<Integer> arrList = new ArrayList<>(10);
        List<Integer> arrIlkList = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            arrList.add(i, rand.nextInt(1, 20));
            arrIlkList.add(arrList.get(i));

            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
                arrList.add(i, 111);
            }


        }
        if (!arrList.contains(111)) {
            System.out.println("dizide cift yoktur");
        }

        System.out.println("ilk hali: " + arrIlkList);
        System.out.println("son hali: " + arrList);

    }
}

package JavaÜbung;

import java.util.ArrayList;
import java.util.List;

public class Array3 {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı

        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        //randomAdd(int[]arr);
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    }

    private static void randomAdd(int[] arr) {
        ArrayList<Integer> arrList=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {

            arrList.add((int) Math.random()*20);

            }



        System.out.println(arrList);

    }
}

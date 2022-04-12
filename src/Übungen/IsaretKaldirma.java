package Übungen;

import java.util.ArrayList;
import java.util.List;

public class IsaretKaldirma {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        list.add("$13");
        list.add("$15");
        list.add("$20");
        list2.add("$-13");
        list2.add("$0");
        list2.add("$0");
        System.out.println("sayilarin toplami=" + getSum(list));
        System.out.println("sayilarin toplami=" + getSum(list2));


    }

    private static int getSum(List<String> list) {
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("$") && !list.get(i).contains("-")) {
                toplam += Integer.valueOf(list.get(i).replace("$", ""));
            } else return -1;

        }

        return toplam;

    }
}
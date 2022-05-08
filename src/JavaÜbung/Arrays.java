package JavaÜbung;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        // Part2:
        // Create a method that accepts a String arraylist and a String as parameters
        // method should add the element at the first index of arraylist
        // Part3:
        // Create a method that accepts a String arraylist and a String as parameters
        // it should add element before last element
        // ex:  [1, 2, 3]  -> [1, 2, 4, 3]
        String arr[]={"ab","a"};
        String str="abc";
        methodArr( arr,str);
        methodLastBefore(arr,str);

    }

    private static void methodLastBefore(String[] arr, String str) {
        List<String> freiList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            freiList.add(arr[i]);

        }
        freiList.add(freiList.size() - 1,str);
        System.out.println(freiList);

    }

    private static void methodArr(String[] arr, String str) {
        List<String> freiList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            freiList.add(arr[i]);

        }
        freiList.add(0,str);

        //arr[arr.length]=freiList.get(freiList.size()-1);
        System.out.println(freiList);


        }



    }



package JavaÜbung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        noSame(arr);

    }

    private static void noSame(int[] ar) {
        List<String> str=new ArrayList<>();
        List<String> strTekrarsiz=new ArrayList<>();

        for (int i = 0; i <ar.length ; i++) {
            str.add(String.valueOf(ar[i]));
        }
        for (int i = 0; i <str.size() ; i++) {
            if (!strTekrarsiz.contains(str.get(i))){
                strTekrarsiz.add(str.get(i));
            }

        }
        System.out.println(strTekrarsiz);

    }
}

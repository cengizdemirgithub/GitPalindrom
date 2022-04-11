package replit_package;

import java.util.ArrayList;
import java.util.List;

public class TerstenYazdir {
    public static void main(String[] args) {
        int input=1238;
        String sayi=String.valueOf(input);
        List<String> sayiList=new ArrayList(List.of(sayi.split("")));
        System.out.print(input + " reverse = ");
        for (int i = sayiList.size()-1; i >=0 ; i--) {
            System.out.print(sayiList.get(i));

        }



    }
}

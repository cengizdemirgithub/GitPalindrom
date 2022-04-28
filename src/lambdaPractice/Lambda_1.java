package lambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda_1 {
    public static void main(String[] args) {
        // Task : listin elemanlarin karakterlerinin cift sayili
        // karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz..
        List<String> ramazan=new ArrayList<String>(Arrays.asList("ramazan","sultan","kadr","bayram","bayramolbayram"));
        ramazan.
                stream().
                filter(t->t.length()%2==0).
                map(t->t.length()*t.length()).
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.println(t+" "));

    }
}

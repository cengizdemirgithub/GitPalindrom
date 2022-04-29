package lambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda_2 {
    public static void main(String[] args) {
// Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.


        List<String> ramazan=new ArrayList<String>(Arrays.asList("ramazan","sultan","kadr","bayram","bayramolbayram","weda","Welayet"));
        ramazan.
                stream().
                filter(t->t.length()<=7).
                forEach(t-> System.out.println(t+": "+t.length()+" elemanlidir"));
        // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
        ramazan.
                stream().
                filter(t->t.startsWith("W")).
               forEach(t -> System.out.println(t+" W ile basliyor"));



    }
}

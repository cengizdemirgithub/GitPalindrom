package lambdaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_Space {
    public static void main(String[] args) {
        List<Integer> yeni=new ArrayList<>();
        yeni.add(1);
        yeni.add(2);
        yeni.add(3);
        yeni.add(-3);
        yeni.add(-13);
        yeni.add(-333);
        space(yeni);
        //S2: sadece negatif olanlari yazdir
        System.out.println();
        negativ(yeni);
        System.out.println();
        //S3: pozitif olanlardan yeni bir liste olustur
        System.out.println("pozitif(yeni) = " + pozitif(yeni));
        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        System.out.println("kare(yeni) = " + kare(yeni));

    }

    private static List kare(List<Integer> yeni) {
       List<Integer>kareList= yeni.stream().map(t->t*t).collect(Collectors.toList());
       return kareList;
    }

    private static List pozitif(List<Integer> yeni) {
       List<Integer>newList= yeni.stream().filter(t->t>0).collect(Collectors.toList());
       return newList;
    }

    private static void negativ(List<Integer> yeni) {
        yeni.stream().filter(t->t<0).forEach(t-> System.out.print(t+" "));
    }

    private static void space(List<Integer> yeni) {
        yeni.stream().forEach(t-> System.out.print(t+" "));
    }

}

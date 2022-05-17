package lambdaPractice;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lambda_Space {
    public static void main(String[] args) {
        List<Integer> yeni=new ArrayList<>();
        yeni.add(1);
        yeni.add(13);
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
        //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        System.out.println("kareTekrarsiz(yeni) = " + kareTekrarsiz(yeni));
        //S6: listin elemanlarini kucukten buyuge siralayalim
        kücüktenByeSirala(yeni);
        System.out.println();
        //S7: listin elemanlarini buyukten kucuge siralayalim
        büyüktenKye(yeni);
        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturali
        System.out.println();
        System.out.println("küpBirler5(yeni) = " + küpBirler5(yeni));
        System.out.println();
        //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olustur
        System.out.println("karenBirNo5(yeni) = " + karenBirNo5(yeni));
        // S10 :list elemanlarini toplamini bulalim
        sumMet(yeni);
        System.out.println();
        // S11 : negatiflerin karelerinden list olusturalim
        negatifKare(yeni);

    }

    private static void negatifKare(List<Integer> yeni) {
        List negalist=yeni.stream().filter(t -> t < 0).map(t -> t * t).collect(Collectors.toList());
        System.out.println("negatif kare list: "+negalist);



    }

    private static void sumMet(List<Integer> yeni) {
        System.out.println("toplam="+yeni.stream().reduce(0, (a, b) -> a + b));
    }

    private static List karenBirNo5(List<Integer> yeni) {
        List<Integer> karenBirNo5=yeni.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=0).collect(Collectors.toList());
        return karenBirNo5;
    }

    private static List küpBirler5(List<Integer> yeni) {
        List<Double>küpBes=yeni.stream().filter(t->t>0).map(t->Math.pow(t,3)).filter(t->t%10==7).collect(Collectors.toList());
        return küpBes;

    }

    private static void büyüktenKye(List<Integer> yeni) {
        yeni.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    private static void kücüktenByeSirala(List<Integer> yeni) {
        yeni.stream().sorted().forEach(t-> System.out.print(t+" "));
    }

    private static Set<Integer> kareTekrarsiz(List<Integer> yeni) {
        Set<Integer> kareTekrarsiz=yeni.stream().map(t->t*t).collect(Collectors.toSet());

        return kareTekrarsiz;
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

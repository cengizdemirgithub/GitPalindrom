package fifth_package;

import java.util.*;

public class ArraySum {
    public static void main(String[] args) {
        /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
        //ben listle yaptim
        Scanner scanner = new Scanner(System.in);
        System.out.println("kac sayi gireceksiniz");
        int sayiMiktar = scanner.nextInt();
        List<Integer> sayiList = new ArrayList<Integer>();
        for (int i = 0; i < sayiMiktar; i++) {
            System.out.println("sayi"+(i+1)+": ");
            int ekleme = scanner.nextInt();
            sayiList.add(ekleme);
        }
        Collections.sort(sayiList);
       int farkj=sayiList.get(sayiList.size()-1)-sayiList.get(0);
        System.out.println("ilk ve son sayilar arasi fark= "+ farkj);




    }
}

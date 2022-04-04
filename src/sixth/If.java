package sixth;

public class If {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve
        yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla
        basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */
        int a=1934344433;
        int b=814444445;
        int toplam=a+b;
        if (String.valueOf(toplam).length()>10){
            System.out.println("owerflow");
        }else System.out.println(toplam);


    }
}

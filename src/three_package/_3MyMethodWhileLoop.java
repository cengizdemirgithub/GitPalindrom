package three_package;

public class _3MyMethodWhileLoop {
    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
        int girilenSayi = 9334328;
        String girilenSayiString = String.valueOf(girilenSayi);
        System.out.println("girilen sayi string= "+girilenSayiString);

        int rakamdegeri = 0;
        System.out.println("girilen sayi stirng uzunluk= "+girilenSayiString.length());
        int sayiUzunluk = girilenSayiString.length();
        System.out.println("int sayi uzunluk= "+sayiUzunluk);

        while (sayiUzunluk >0) {
            rakamdegeri += Character.getNumericValue(girilenSayiString.charAt(sayiUzunluk- 1));
            sayiUzunluk--;
        }
        System.out.println("rakamlar toplami= "+rakamdegeri);


    }

}


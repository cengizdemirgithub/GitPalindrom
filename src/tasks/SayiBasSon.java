package tasks;

public class SayiBasSon {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        int kullanici = 23340;
        String kullaniciStr = String.valueOf(kullanici);
        String ilk = kullaniciStr.substring(0, 1);
        int ilk_ = Integer.parseInt(ilk);
        String iki = kullaniciStr.substring(1, 2);
        int iki_ = Integer.parseInt(iki);

        String son = kullaniciStr.substring(kullaniciStr.length() - 1);
        int son_ = Integer.parseInt(son);
        String son1 = kullaniciStr.substring(kullaniciStr.length() - 2, kullaniciStr.length() - 1);
        int son_1 = Integer.parseInt(son1);
        int toplam = ilk_ + iki_ + son_ + son_1;
        System.out.println("son ve bas iki basamaklar toplami: "+toplam);


    }
}

package seventh_package;

public class If_ {
    public static void main(String[] args) {
        /*
        2 kelime oluşturun: isim1 ve isim2

// isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor
         */

        String isim="mehemmet";
        String isim2="ali";
        if(isim.length()%2==0){
            System.out.println(isim.substring(0,((isim.length()+1))/2)+isim2+isim.substring(((isim.length()+1))/2));
        } else System.out.println(isim+isim2);
    }
}

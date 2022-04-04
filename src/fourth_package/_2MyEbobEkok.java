package fourth_package;

import java.util.ArrayList;
import java.util.List;

public class _2MyEbobEkok {
    public static void main(String[] args) { /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
        int kücük = 19;
        int büyük = 57;
        int ebob = 1;
        int kücükEkok =kücük;
        int büyükEkok = büyük;


        //iki sayiyi ayni anda bölenlerin carpimi ekok
        for (int i = 1; i < büyük; i++) {
            if (büyük % 2 == 0 && kücük % 2 == 0) {
                ebob *= 2;
                büyük /= 2;
                kücük /= 2;


            } else if (kücük % 3 == 0 && büyük % 3 == 0) {
                ebob *= 3;
                büyük /= 3;
                kücük /= 3;


            } else if (kücük % 5 == 0 && büyük % 5 == 0) {
                ebob *= 5;
                büyük /= 5;
                kücük /= 5;

            } else if (kücük % 7 == 0 && büyük % 7 == 0) {
                ebob *= 7;
                büyük /= 7;
                kücük /= 7;

            }
            else if (büyük % kücük == 0 ) {
                ebob *= kücük;
                büyük /= kücük;
                kücük /= kücük;

            }

        }
        System.out.println("ebob= " + ebob);

        int ekok = (kücükEkok / ebob) * (büyükEkok / ebob) * (ebob);
        System.out.println("ekok= " + ekok);

    }


    //System.out.println("ekok: " + son);
}









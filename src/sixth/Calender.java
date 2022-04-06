package sixth;

public class Calender {
    public static void main(String[] args) {
        /*
       Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
         */
        String isim="abb";
        String isim_=isim.substring(0,1).equals(isim.substring(1,2))?"isim ayni karakterlere sahiptir.":
                (isim.substring(0,1).equals(isim.substring(2))?"isim ayni karakterlere sahiptir.":
                        (isim.substring(1,2).equals(isim.substring(2)))?"isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var");
        System.out.println(isim_);


    }
}

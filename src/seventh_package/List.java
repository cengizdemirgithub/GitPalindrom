package seventh_package;

public class List {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
         */
        String user="rrramazan mübarek olsun";
        char user1='r';
        int sayac=0;
        for (int i = 0; i <user.length();  i++) {
            if (user.charAt(i)=='r'){
                sayac++;

            }

        }
        System.out.println(user1+" harfi "+sayac+" kere kullanilmis");

    }
}

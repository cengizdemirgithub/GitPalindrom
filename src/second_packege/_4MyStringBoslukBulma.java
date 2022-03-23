package second_packege;

public class _4MyStringBoslukBulma {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        String kullanici="";//is empty metodu hiclik durumunda bos gösterir yani normal space bosluk degildir
        char bosluk=' ';
        int boslukSayac=0;
        for (int i = 0; i <kullanici.length() ; i++) {
            if (kullanici.charAt(i)==bosluk){
                boslukSayac++;

            }

        }
        System.out.println(kullanici+" cümlesinde "+boslukSayac+" kadar bosluk var");
       if (kullanici.isEmpty()){
           System.out.println("bos");
       }


    }
}

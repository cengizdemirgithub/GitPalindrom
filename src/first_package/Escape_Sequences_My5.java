package first_package;

public class Escape_Sequences_My5 {
    public static void main(String[] args) {
          /*
	  \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	          \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	          \\: prints a back slash :\ (ters slash) yazdirir
	          \': prints single quote :' tek tirnak yazdirir.
	          \": prints double quote :"" cift tirnak yazdirir.
	 \: backslash
	 /:front slash
	 */
        System.out.print("baslangic");
        System.out.println("\nselam aleyküm");//sonraki satiri asagi gönderir
        System.out.print("devam");//ln olmazsa sonraki yazilalar lat satira inmez
        System.out.println("tamma");
        System.out.print("deneme");
        System.out.println("deneme 2\r");

        System.out.println("\tmetni bir tab kaydirir");//metnin hemen önüne koymak gerekkir

        System.out.println("\\ters slasch yazmak");//iki ters  slach isarertiyle bir slach yazilabilir

        System.out.println("\'");//tek tirnak yazdirir diyor ama zaten normalde de yaziyor?ilginc
        System.out.println("cift tirmak yazdirma \"");//cift tirnak bu sekilde yaziliyor
        System.out.println("\\\\\\");
        System.out.println("/");



    }
}

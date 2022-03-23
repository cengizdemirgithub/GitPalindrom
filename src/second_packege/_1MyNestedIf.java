package second_packege;

public class _1MyNestedIf {
    public static void main(String[] args) {
         /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

        int yas=69;
        if (yas>=18){
            System.out.println("oy kullanabilir");
            if (yas>=70){
                System.out.println("3 kez kullanabilir");
            }else if (yas>=50&&yas<70){
                System.out.println("2 kez kullanabilir");
            }else if (yas>=18&&yas<50){
                System.out.println("1 kez kullananbilir");
            }
        }else System.out.println("gecerli bir yas degil");




    }
}

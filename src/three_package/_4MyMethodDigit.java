package three_package;

public class _4MyMethodDigit {
    public static void main(String[] args) {
        /*
         * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
         * toplamini dondursun.
         *
         * Ornek
         * input : ade1r4d3
         * output : 8
         *
         * Ipucu:
         *     Character.isDigit()
         *     Integer.valueOf()
         */


		/*

		Bilgilendirme:

		    String  para1 ="1900";
	        String  para2 = "2500";
	        System.out.println(para1 + para2); //19002500

	        System.out.println(Integer.valueOf(para1)+ Integer.valueOf(para2));

	        int num1= 100;
	        int num2 = 200;

	        System.out.println(String.valueOf(num1)+String.valueOf(num2));

	        */

        String str = "ade1r4d5";
        int rakamToplam = 0;

        for (int i = 0; i < str.length(); i++) {
            char deger = str.charAt(i);

            if (Character.isDigit(deger)) {
                int deger_ = Integer.valueOf(""+deger);//burada hicliki mutlaka kullanmak lazim
                rakamToplam = deger_ + deger_;

            }


        }
        System.out.println(rakamToplam);


    }
}

package second_packege;

public class _5MyStringKelimeOrtasi {
    public static void main(String[] args) {/*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
        String kelime="kalkem";
        if (kelime.length()>=3){
            String kelimeOrtasi=kelime.length()%2==0?"kelime cift haneli":"kelime tek haneli";
            if (kelimeOrtasi=="kelime cift haneli"){
                String ortaHarfler=kelime.substring(kelime.length()/2-1,kelime.length()/2+1);//önce gelen inklusive
                // sonra gelen exklusive
                System.out.println("orta harfler= "+ortaHarfler);
            }else {char kelimeOrtasi2=kelime.charAt((kelime.length()-1)/2);
                System.out.println("kelime orta harf= "+kelimeOrtasi2);

            }

        }

    }
}

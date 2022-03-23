package second_packege;

public class _6MyParseDouble {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.
        String str1 = "$13.99";
        String str2 = "$10.55";
        String str1New = str1.replaceAll("\\D", "");//rakam disi tüm karakterlri
        // degistirdi kücük d ise rakamlari degistirir
        Double str1_ = (Double.parseDouble(str1New) / 100);
        System.out.println(Double.parseDouble(str1New) / 100);//icine srtring alir double ceviriri
        String str2New = str2.replaceAll("\\D", "");//rakam disi tüm karakterlri
        Double str2_ = (Double.parseDouble(str2New) / 100);
        System.out.println(Double.parseDouble(str2New) / 100);
        Double toplam=str2_+str1_;
        System.out.println("iki sayinin toplami= "+toplam+" $");

        String bosluklu="cok sükür";
        String bosluksuz=bosluklu.replaceAll("\\s","");//replaceAll metodu kullanmak lazim bu boslukla ilgili
        System.out.println(bosluksuz);
        String degisik="aknjdncdwj39499+++'''' mck ";
        String yeni=degisik.replaceAll("\\D","");//rakam disindakileri sildi
        System.out.println(yeni);
        System.out.println(degisik.replaceAll("\\W",""));//sayi ve rakam disndakileri sildi
        System.out.println(degisik.replaceAll("\\w",""));//sayi ve rakamlari sildi





    }
}

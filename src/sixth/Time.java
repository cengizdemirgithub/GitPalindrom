package sixth;

public class Time {
    public static void main(String[] args) {
       int saat=60*60;
       int dakika=60;
       int saniye=1;
       int veri=1*saat+10*dakika+50*saniye;
        System.out.println(veri);
         dakika=3456789;
        int günH=dakika/(24*60);
        int yil=günH/365;
        int kalangün=(dakika-(yil*365*24*60))/(24*60);
        System.out.println(dakika+" dakika yaklasik "+yil+" yil "+kalangün+" gündür");


    }
}

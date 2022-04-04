package fifth_package;

public class RakamToplami {
    public static void main(String[] args) {
        int ücBasamak=123;
        String üc=String.valueOf(ücBasamak);
        int rkm1=Integer.parseInt(üc.substring(0,1));
        int rkm2=Integer.parseInt(üc.substring(1,2));
        int rkm3=Integer.parseInt(üc.substring(2,3));
        System.out.println(rkm1+rkm2+rkm3);
    }
}

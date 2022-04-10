package replit_package;

public class Faktöriyel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
         */

        int input=6;
        int output=1;
        System.out.print(input+"!=");
        for(int i=input;i>1;i--){
            output*=i;
            System.out.print(i+"*");



        }
        System.out.print("1="+output);

    }
}

package JavaÜbung;

public class SchaltJahr {
    public static void main(String[] args) {
        int jahr=2018;
        if (jahr%4==0){
            if (jahr%100!=0){
                System.out.println(jahr+" ist ein schaltjahr");


            }else if(jahr%400==0){
                System.out.println(jahr+" ist ein schaltjahr");
            }
            else System.out.println(jahr+" nicht ein  schaltjahr");

        }else System.out.println(jahr+" nicht ein  schaltjahr");

    }
}

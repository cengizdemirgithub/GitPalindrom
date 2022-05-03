package interviewQuestions;

public class Frage_1 {
    public static void main(String[] args) {
        int sayi1=15;
        int sayi2=3;
        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("sayi1: "+sayi1+"\nsayi2: "+sayi2);
        method(sayi1,sayi2);

    }

    private static void method(int sayi1, int sayi2) {

     sayi1=sayi2+sayi1;
     sayi2=(sayi1-sayi2);
     sayi1=sayi1-sayi2;


        System.out.println("sayi1= "+sayi1+"\nsayi2="+sayi2);
    }
}

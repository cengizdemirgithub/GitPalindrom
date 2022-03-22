package three_package;

public class _2MyMethod13eBölünme {
    public static void main(String[] args) { int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam+=i;
            }

        }
        System.out.println("toplam="+toplam);

    }
}

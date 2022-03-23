package first_package;

public class Converting_My7 {
    public static void main(String[] args) {
        /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        double gallon=5;
        double gallonToLiter=gallon*3.785;
        double litre=7;
        double litreToGallon=litre/3.785;
        System.out.println(gallon+" galon "+gallonToLiter+" litredir.");
        System.out.println(litre+" litre "+litreToGallon+" galondur.");

    }
}

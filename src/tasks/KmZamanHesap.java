package tasks;

public class KmZamanHesap {
    public static void main(String[] args) {
         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        int mesafe=400;
        int hiz=100;
        double dkKm=hiz/60;//dakikada kac km gider
        double kacDk=mesafe/dkKm;//mesafeyi kac dk da gider
        double saat=mesafe/hiz;
        System.out.println(kacDk);
        System.out.println(saat);

    }
}

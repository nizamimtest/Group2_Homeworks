package day19;

public class Average {

    public static void main(String[] args) {
        int toplam = 0;
        int[] sayilar = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];
        }
        System.out.println("Toplam = " + (toplam / sayilar.length));
    }
}

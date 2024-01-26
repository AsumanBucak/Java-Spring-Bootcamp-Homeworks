package week1;

/* Soru1: kullanicidan alinan para degerinin KDV'li fiyatini ve KDV tutarini hesaplayip ekrana bastiran
programi yazin. */

import java.util.Scanner;

public class KDVHesapla {
    public static void main(String[] args) {
        // KDV oranı (30%)
        double kdvOrani = 0.3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("KDV'siz Fiyatı Girin: ");
        double kdvsizFiyat = scanner.nextDouble();

        double kdvliFiyat = kdvsizFiyat * (1 + kdvOrani);
        double kdvTutari = kdvsizFiyat * kdvOrani;

        System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

        scanner.close();
    }

}





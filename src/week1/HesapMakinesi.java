package week1;

/* Soru4: Kullanicidan iki sayi girmesini isteyen ve ardindan bu iki sayi uzerinde
toplama, cikarma, carpma ve bolme islemlerini gerceklestiren bir Java programi yazin.
 */
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayıyı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci Sayıyı Girin: ");
        double sayi2 = scanner.nextDouble();

        // Toplama
        double toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);

        // Çıkarma
        double fark = sayi1 - sayi2;
        System.out.println("Fark: " + fark);

        // Çarpma
        double carpim = sayi1 * sayi2;
        System.out.println("Çarpım: " + carpim);

        // Bölme
        // Sıfıra bölme durumunu kontrol et
        if (sayi2 != 0) {
            double bolum = sayi1 / sayi2;
            System.out.println("Bölme: " + bolum);
        } else {
            System.out.println("Sıfıra bölme hatası!");
        }

        // Scanner kapat
        scanner.close();
    }
}
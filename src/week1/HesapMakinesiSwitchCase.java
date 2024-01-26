package week1;

/* Soru8: Hesap makinesi w/ Switch-case */
import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayıyı ve işlemi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci Sayıyı Girin: ");
        double sayi2 = scanner.nextDouble();

        System.out.print("İşlemi Seçin (1: Toplama, 2: Çıkarma, 3: Çarpma, 4: Bölme): ");
        int secim = scanner.nextInt();

        // Seçilen işleme göre hesaplama yap
        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama Sonucu: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkarma Sonucu: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma Sonucu: " + sonuc);
                break;
            case 4:
                // Sıfıra bölme durumunu kontrol et
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölme Sonucu: " + sonuc);
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }

        // Scanner kapat
        scanner.close();
    }
}

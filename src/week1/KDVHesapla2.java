package week1;

/* Soru2: Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %10 ,
tutar 1000 TL'den buyuk ise KDV oranini %22 olarak KDV tutari hesaplayan programi yaziniz.
*/
import java.util.Scanner;

public class KDVHesapla2 {
    public static void main(String[] args) {
        // KDV oranları
        double kdvOrani1 = 0.1; // %10
        double kdvOrani2 = 0.22; // %22

        // Kullanıcıdan tutarı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutarı Girin: ");
        double tutar = scanner.nextDouble();

        // KDV oranını belirle ve KDV tutarını hesapla
        double kdvOrani;
        if (tutar <= 1000) {
            kdvOrani = kdvOrani1;
        } else {
            kdvOrani = kdvOrani2;
        }

        double kdvTutari = tutar * kdvOrani;

        // KDV'li fiyatı hesapla
        double kdvliFiyat = tutar + kdvTutari;

        // Sonuçları ekrana yazdır
        System.out.println("Tutar: " + tutar);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

        // Scanner kapat
        scanner.close();
    }
}

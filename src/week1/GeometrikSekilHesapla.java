package week1;

/*Soru9: Kullaniciya hangi geometrik seklin alanini hesaplamak istedigini sorun. Ardindan, secilen sekle gore gerekli bilgileri alarak alani hesaplayin.
(1-Dikdortgen, 2-Kare, 3-Ucgen)*/
import java.util.Scanner;

public class GeometrikSekilHesapla {
    public static void main(String[] args) {
        // Kullanıcıya hangi şeklin alanını hesaplamak istediğini soralım
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geometrik Şekil Seçin:");
        System.out.println("1. Dikdörtgen");
        System.out.println("2. Kare");
        System.out.println("3. Üçgen");
        System.out.print("Seçiminizi Yapın (1-3): ");
        int secim = scanner.nextInt();

        double alan = 0;

        // Seçilen şekle göre gerekli bilgileri alalım ve alanı hesaplayalım
        switch (secim) {
            case 1:
                // Dikdörtgen için uzunluk ve genişlik al
                System.out.print("Dikdörtgen Uzunluğu: ");
                double uzunluk = scanner.nextDouble();
                System.out.print("Dikdörtgen Genişliği: ");
                double genislik = scanner.nextDouble();
                alan = uzunluk * genislik;
                break;
            case 2:
                // Kare için kenar uzunluğu al
                System.out.print("Kare Kenar Uzunluğu: ");
                double kenar = scanner.nextDouble();
                alan = kenar * kenar;
                break;
            case 3:
                // Üçgen için taban uzunluğu ve yükseklik al
                System.out.print("Üçgen Taban Uzunluğu: ");
                double tabanUzunlugu = scanner.nextDouble();
                System.out.print("Üçgen Yüksekliği: ");
                double yukseklik = scanner.nextDouble();
                alan = (tabanUzunlugu * yukseklik) / 2;
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }

        // Alanı ekrana yazdır
        System.out.println("Seçilen Geometrik Şeklin Alanı: " + alan);

        // Scanner kapat
        scanner.close();
    }
}




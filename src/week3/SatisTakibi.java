package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SatisTakibi {

    public static void main(String[] args) {
        // Müşteri satışlarını saklamak için HashMap oluşturuyoruz
        Map<String, Double> satislar = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan müşteri adı ve satış miktarı alarak HashMap'e ekliyoruz
        while (true) {
            System.out.print("Müşteri adını girin (Çıkmak için 'exit' yazın): ");
            String musteriAdi = scanner.next();

            if (musteriAdi.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Satış miktarını girin: ");
            double satisMiktari = scanner.nextDouble();

            // Müşterinin daha önce satışı varsa, yeni satışı eski satışa ekleyip güncelliyoruz
            satislar.merge(musteriAdi, satisMiktari, Double::sum);
        }

        // Toplam satış miktarını hesapla
        double toplamSatis = 0;
        String enCokSatanMusteri = null;

        for (Map.Entry<String, Double> entry : satislar.entrySet()) {
            String musteriAdi = entry.getKey();
            double satisMiktari = entry.getValue();

            toplamSatis += satisMiktari;

            // En çok satış yapan müşteriyi bul
            if (enCokSatanMusteri == null || satisMiktari > satislar.get(enCokSatanMusteri)) {
                enCokSatanMusteri = musteriAdi;
            }
        }

        // Sonuçları ekrana yazdır
        System.out.println("Toplam Satış: " + toplamSatis);
        if (enCokSatanMusteri != null) {
            System.out.println("En Çok Satış Yapan Müşteri: " + enCokSatanMusteri + " (Satış Miktarı: " + satislar.get(enCokSatanMusteri) + ")");
        } else {
            System.out.println("Hiç satış yapılmamış.");
        }
    }
}

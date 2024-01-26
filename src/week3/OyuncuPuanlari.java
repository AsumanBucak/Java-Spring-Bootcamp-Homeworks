package week3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OyuncuPuanlari {

    public static void main(String[] args) {
        // Oyuncu puanlarını saklamak için HashMap
        Map<String, Integer> oyuncuPuanlari = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Puan Ekle");
            System.out.println("2 - Puanları Görüntüle");
            System.out.println("3 - Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    puanEkle(oyuncuPuanlari, scanner);
                    break;
                case 2:
                    puanlariGoruntule(oyuncuPuanlari);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void puanEkle(Map<String, Integer> oyuncuPuanlari, Scanner scanner) {
        System.out.print("Oyuncu adını girin: ");
        String oyuncuAdi = scanner.next();

        System.out.print("Eklemek istediğiniz puanı girin: ");
        int eklenenPuan = scanner.nextInt();

        // Oyuncunun daha önce puanı varsa, eklenen puanı mevcut puana ekleyip güncelliyoruz
        oyuncuPuanlari.merge(oyuncuAdi, eklenenPuan, Integer::sum);

        System.out.println(oyuncuAdi + " oyuncusuna " + eklenenPuan + " puan eklendi.");
    }

    private static void puanlariGoruntule(Map<String, Integer> oyuncuPuanlari) {
        if (oyuncuPuanlari.isEmpty()) {
            System.out.println("Hiç oyuncu bulunmamaktadır.");
        } else {
            System.out.println("Oyuncu Puanları:");
            for (Map.Entry<String, Integer> entry : oyuncuPuanlari.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " puan");
            }
        }
    }
}


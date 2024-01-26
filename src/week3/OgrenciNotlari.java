package week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciNotlari {

    public static void main(String[] args) {
        // Öğrenci bilgilerini tutacak HashMap
        Map<String, Integer> ogrenciNotlari = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Not Sorgula");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    ogrenciEkle(ogrenciNotlari);
                    break;
                case 2:
                    notSorgula(ogrenciNotlari);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim. Tekrar deneyin.");
            }
        }
    }

    private static void ogrenciEkle(Map<String, Integer> ogrenciNotlari) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci adını girin: ");
        String ogrenciAdi = scanner.next();

        System.out.print("Öğrenci notunu girin: ");
        int ogrenciNotu = scanner.nextInt();

        ogrenciNotlari.put(ogrenciAdi, ogrenciNotu);

        System.out.println(ogrenciAdi + " adlı öğrenci eklendi.");
    }

    private static void notSorgula(Map<String, Integer> ogrenciNotlari) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sorgulamak istediğiniz öğrenci adını girin: ");
        String ogrenciAdi = scanner.next();

        Integer not = ogrenciNotlari.get(ogrenciAdi);

        if (not != null) {
            System.out.println(ogrenciAdi + " adlı öğrencinin notu: " + not);
        } else {
            System.out.println(ogrenciAdi + " adlı öğrenci bulunamadı.");
        }
    }
}

package week1;

/*Soru3: Kullanicidan bir ogrencinin sinav notunu girmesini isteyen ve bu notun harf notunu hesaplayarak ekrana yazdiran bir Java programi yazin. (Ornegin, 90-100 arasi AA, 80-89 arasi BA,
70-79 arasi BB, 60-69 arasi CB, 50-59 arasi CC, 0-50 arasi FF)*/

import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        // Kullanıcıdan notu al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınav Notunu Girin: ");
        int sinavNotu = scanner.nextInt();

        // Harf notunu hesapla
        String harfNotu;

        if (sinavNotu >= 90 && sinavNotu <= 100) {
            harfNotu = "AA";
        } else if (sinavNotu >= 80 && sinavNotu < 90) {
            harfNotu = "BA";
        } else if (sinavNotu >= 70 && sinavNotu < 80) {
            harfNotu = "BB";
        } else if (sinavNotu >= 60 && sinavNotu < 70) {
            harfNotu = "CB";
        } else if (sinavNotu >= 50 && sinavNotu < 60) {
            harfNotu = "CC";
        } else if (sinavNotu >= 0 && sinavNotu < 50) {
            harfNotu = "FF";
        } else {
            harfNotu = "Geçersiz Not";
        }

        // Sonucu ekrana yazdır
        System.out.println("Harf Notu: " + harfNotu);

        // Scanner kapat
        scanner.close();
    }
}


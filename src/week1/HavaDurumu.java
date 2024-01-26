package week1;

/*Soru7: Kullaniciya bir hava durumu kodu girmesini isteyin.
Girdigi koda gore hava durumunu ekrana yazdirin.*/

import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {
        // Kullanıcıdan hava durumu kodunu al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava Durumu Kodunu Girin: ");
        int havaDurumuKodu = scanner.nextInt();

        // Hava durumu koduna göre durumu belirle
        String havaDurumuMesaji;

        switch (havaDurumuKodu) {
            case 1:
                havaDurumuMesaji = "Güneşli";
                break;
            case 2:
                havaDurumuMesaji = "Bulutlu";
                break;
            case 3:
                havaDurumuMesaji = "Yağmurlu";
                break;
            case 4:
                havaDurumuMesaji = "Karlı";
                break;
            default:
                havaDurumuMesaji = "Geçersiz hava durumu kodu";
                break;
        }

        // Hava durumu mesajını ekrana yazdır
        System.out.println("Hava Durumu: " + havaDurumuMesaji);

        // Scanner kapat
        scanner.close();
    }
}
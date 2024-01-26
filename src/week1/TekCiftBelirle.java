package week1;
/* Soru5: Kullanicidan bir sayi girmesini isteyen ve girilen sayinin
tek mi yoksa cift mi oldugunu belirleyen bir Java programini yazin.*/

import java.util.Scanner;

public class TekCiftBelirle {
    public static void main(String[] args) {
        // Kullanıcıdan sayıyı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int sayi = scanner.nextInt();

        // Sayının tek veya çift olup olmadığını kontrol et
        if (sayi % 2 == 0) {
            System.out.println(sayi + " bir çift sayıdır.");
        } else {
            System.out.println(sayi + " bir tek sayıdır.");
        }

        // Scanner kapat
        scanner.close();
    }
}

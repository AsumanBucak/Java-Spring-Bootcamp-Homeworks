package week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;


public class SayiFiltreleme {

    public static void main(String[] args) {
        // Rastgele sayıları saklamak için ArrayList oluşturuyoruz
        ArrayList<Integer> sayilarListesi = new ArrayList<>();

        // Çift sayıları saklamak için HashSet oluşturuyoruz
        Set<Integer> ciftSayilarSet = new HashSet<>();

        // Tek sayıları saklamak için ArrayList oluşturuyoruz
        ArrayList<Integer> tekSayilarListesi = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Rastgele sayıları eklemek için bir döngü oluşturuyoruz
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            System.out.printf(i + ". sayiyi giriniz:");
            int rastgeleSayi = scanner.nextInt();
            sayilarListesi.add(rastgeleSayi);
        }

        System.out.println("Rastgele Sayılar: " + sayilarListesi);

        // Çift ve tek sayıları ayırma
        for (int sayi : sayilarListesi) {
            if (sayi % 2 == 0) {
                ciftSayilarSet.add(sayi);
            } else {
                tekSayilarListesi.add(sayi);
            }
        }

        System.out.println("Çift Sayılar: " + ciftSayilarSet);
        System.out.println("Tek Sayılar: " + tekSayilarListesi);
    }
}


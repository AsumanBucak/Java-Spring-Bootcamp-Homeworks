package week1;
/*Soru6: Girilen 3 sayiyi "kucukten buyuge" siralayan programi yaziniz.*/
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        // Kullanıcıdan üç sayıyı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü Sayıyı Girin: ");
        int sayi3 = scanner.nextInt();


        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + ", " + sayi2 + ", " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + ", " + sayi3 + ", " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + ", " + sayi1 + ", " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + ", " + sayi3 + ", " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + ", " + sayi1 + ", " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + ", " + sayi2 + ", " + sayi1);
            }
        }

        scanner.close();
    }
}


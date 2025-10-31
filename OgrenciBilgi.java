/*
 * Ad Soyad: [Ahmet Yaman]
 * Ogrenci No: [250541014]
 * Tarih: [31/10/2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        //  Scanner input = new Scanner(System.in);

         // Kullanıcıdan bilgileri al
        System.out.print("Ad: ");
        String ad = input.nextLine();

        System.out.print("Soyad: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numarası: ");
        int numara = input.nextInt();

        System.out.print("Yaş: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00 - 4.00): ");
        double gpa = input.nextDouble();

        // Boş satır ekle
        System.out.println("\n--- Öğrenci Bilgileri ---");

        // Bilgileri düzenli yazdır
        System.out.printf("%-15s: %s\n", "Ad", ad);
        System.out.printf("%-15s: %s\n", "Soyad", soyad);
        System.out.printf("%-15s: %d\n", "Numara", numara);
        System.out.printf("%-15s: %d\n", "Yaş", yas);
        System.out.printf("%-15s: %.2f\n", "GPA", gpa);

        input.close();
        
      
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN
        
        
        
        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}

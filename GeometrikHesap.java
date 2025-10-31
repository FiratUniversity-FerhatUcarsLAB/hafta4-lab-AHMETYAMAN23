AHMET YAMAN 
  ÖĞRENCİ NO: 250541014
  Daire yarıçapını alıp, daire ve küre hesaplamaları yapan program

  import java.util.Scanner;

public class Geometrikhesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarıçap al
        System.out.print("Yarıçapı giriniz: ");
        double r = input.nextDouble();

        // Hesaplamalar
        double pi = Math.PI;
        double daireAlani = pi * r * r;
        double daireCevresi = 2 * pi * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * pi * Math.pow(r, 2);

        // Sonuçları ekrana yazdır
        System.out.println("\n--- Daire ve Küre Hesaplamaları ---");
        System.out.printf("%-20s: %.2f\n", "1. Daire Alanı", daireAlani);
        System.out.printf("%-20s: %.2f\n", "2. Daire Çevresi", daireCevresi);
        System.out.printf("%-20s: %.2f\n", "3. Daire Çapı", daireCapi);
        System.out.printf("%-20s: %.2f\n", "4. Küre Hacmi", kureHacmi);
        System.out.printf("%-20s: %.2f\n", "5. Küre Yüzey Alanı", kureYuzeyAlani);

        input.close();
    }
}


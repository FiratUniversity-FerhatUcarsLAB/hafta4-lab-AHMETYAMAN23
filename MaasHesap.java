Ahmet Yaman 
  Öğrenci No: 250541014



  import java.util.Scanner;

public class MaasBordrosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Bilgileri Al
        System.out.print("Çalışanın Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = input.nextInt();

        // 2. Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 3. Kesintiler
        double sgk = toplamGelir * 0.14;
        double gelirVergisi = toplamGelir * 0.15;
        double damgaVergisi = toplamGelir * 0.00759;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // 4. Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 5. İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176; // 22 gün * 8 saat
        double gunlukNetKazanc = netMaas / 22;

        // 6. Çıktı
        System.out.println("\n--- MAAŞ BORDROSU ---");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Brüt Maaş: " + String.format("%.2f TL", brutMaas));
        System.out.println("Mesai Ücreti: " + String.format("%.2f TL", mesaiUcreti));
        System.out.println("Toplam Gelir: " + String.format("%.2f TL", toplamGelir));

        System.out.println("\n--- KESİNTİLER ---");
        System.out.println("SGK (%14): " + String.format("%.2f TL", sgk));
        System.out.println("Gelir Vergisi (%15): " + String.format("%.2f TL", gelirVergisi));
        System.out.println("Damga Vergisi (%0.759): " + String.format("%.2f TL", damgaVergisi));
        System.out.println("Toplam Kesinti: " + String.format("%.2f TL", toplamKesinti));

        System.out.println("\n--- NET MAAŞ ve İSTATİSTİKLER ---");
        System.out.println("Net Maaş: " + String.format("%.2f TL", netMaas));
        System.out.println("Kesinti Oranı: " + String.format("%.2f%%", kesintiOrani));
        System.out.println("Saatlik Net Kazanç: " + String.format("%.2f TL/saat", saatlikNetKazanc));
        System.out.println("Günlük Net Kazanç: " + String.format("%.2f TL/gün", gunlukNetKazanc));

        input.close();
    }
}

import java.util.Scanner;

public class TextAnalyzer {
    private String teks;

    public void masukkanTeks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
        System.out.print("Pilihan Anda: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan teks: ");
                this.teks = scanner.nextLine();
                System.out.println("Teks telah dimasukkan!\n");
                break;
            case 2:
                hitungJumlahKarakter();
                break;
            case 3:
                hitungJumlahKata();
                break;
            case 4:
                cariKata();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih kembali.\n");
                break;
        }

        masukkanTeks(); // Pemanggilan rekursif untuk kembali ke menu setelah setiap operasi
    }

    private void hitungJumlahKarakter() {
        System.out.println("Jumlah karakter dalam teks: " + teks.length() + "\n");
    }

    private void hitungJumlahKata() {
        String[] kataArray = teks.split("\\s+");
        System.out.println("Jumlah kata dalam teks: " + kataArray.length + "\n");
    }

    private void cariKata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata yang ingin dicari: ");
        String kataCari = scanner.nextLine();
        int jumlahKemunculan = 0;

        // Mencari kata dalam teks
        int index = teks.indexOf(kataCari);
        while (index != -1) {
            jumlahKemunculan++;
            index = teks.indexOf(kataCari, index + 1);
        }

        System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + jumlahKemunculan + " kali dalam teks.\n");
    }

    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        analyzer.masukkanTeks();
    }
}
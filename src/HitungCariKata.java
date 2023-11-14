import java.util.Scanner;

public class HitungCariKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks, kata;
        int jumlahKata, jumlahKataDicari; // variabel untuk menyimpan jumlah kata dalam teks dan jumlah kata yang dicari

        System.out.print("Masukkan teks: ");
        teks = input.nextLine();

        System.out.print("Masukkan kata yang ingin dicari: ");
        kata = input.nextLine();

        // Menghitung jumlah kata dalam teks
        if (teks.isEmpty()) { // jika teks kosong, maka jumlah kata adalah 0
            jumlahKata = 0;
        } else { // jika teks tidak kosong, maka jumlah kata (spasi)
            jumlahKata = teks.split("\\s+").length;
        }

        // Menghitung jumlah kata yang dicari dalam teks
        jumlahKataDicari = 0; // inisialisasi jumlah kata yang dicari
        for (String s : teks.split("\\s+")) { // melakukan perulangan
            if (s.equalsIgnoreCase(kata)) { // jika kata dalam teks sama
                jumlahKataDicari++;
            }
        }

        // Menampilkan ada berapa kata
        System.out.println("Jumlah kata dalam teks: " + jumlahKata);
        System.out.println("Jumlah kata \"" + kata + "\" dalam teks: " + jumlahKataDicari);
    }
}

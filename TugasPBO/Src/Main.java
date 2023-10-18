import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pecahan pertama :");
        String input1 = scanner.nextLine();
        String[] bagian1 = input1.split("/");
        int pembilang1 = Integer.parseInt(bagian1[0]);
        int penyebut1 = Integer.parseInt(bagian1[1]);

        System.out.println("Masukkan pecahan kedua :");
        String input2 = scanner.nextLine();
        String[] bagian2 = input2.split("/");
        int pembilang2 = Integer.parseInt(bagian2[0]);
        int penyebut2 = Integer.parseInt(bagian2[1]);

        Pecahan pecahan1 = new Pecahan(pembilang1, penyebut1);
        Pecahan pecahan2 = new Pecahan(pembilang2, penyebut2);

        Pecahan hasilPenjumlahan = pecahan1.tambah(pecahan2);
        Pecahan hasilPengurangan = pecahan1.kurang(pecahan2);
        Pecahan hasilPerkalian = pecahan1.kali(pecahan2);
        Pecahan hasilPembagian = pecahan1.bagi(pecahan2);

        System.out.println("Hasil penjumlahan pecahan: " + hasilPenjumlahan);
        System.out.println("Hasil pengurangan pecahan: " + hasilPengurangan);
        System.out.println("Hasil perkalian pecahan: " + hasilPerkalian);
        System.out.println("Hasil pembagian pecahan: " + hasilPembagian);
    }
}
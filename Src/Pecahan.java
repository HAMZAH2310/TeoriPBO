import java.util.Scanner;

class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        if (penyebut == 0) {
            System.out.println("Penyebut tidak boleh nol. Menyetelnya ke 1.");
            this.penyebut = 1;
        } else {
            this.penyebut = penyebut;
        }
    }

    public Pecahan tambah(Pecahan lainnya) {
        int hasilPembilang = this.pembilang * lainnya.penyebut + lainnya.pembilang * this.penyebut;
        int hasilPenyebut = this.penyebut * lainnya.penyebut;
        return new Pecahan(hasilPembilang, hasilPenyebut);
    }

    public Pecahan kurang(Pecahan lainnya) {
        int hasilPembilang = this.pembilang * lainnya.penyebut - lainnya.pembilang * this.penyebut;
        int hasilPenyebut = this.penyebut * lainnya.penyebut;
        return new Pecahan(hasilPembilang, hasilPenyebut);
    }

    public Pecahan kali(Pecahan lainnya) {
        int hasilPembilang = this.pembilang * lainnya.pembilang;
        int hasilPenyebut = this.penyebut * lainnya.penyebut;
        return new Pecahan(hasilPembilang, hasilPenyebut);
    }

    public Pecahan bagi(Pecahan lainnya) {
        int hasilPembilang = this.pembilang * lainnya.penyebut;
        int hasilPenyebut = this.penyebut * lainnya.pembilang;
        return new Pecahan(hasilPembilang, hasilPenyebut);
    }

    public String toString() {
        return pembilang + "/" + penyebut;
    }
}

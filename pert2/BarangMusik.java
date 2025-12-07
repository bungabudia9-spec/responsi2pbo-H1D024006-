package pert2;
public class BarangMusik {
    // Variabel/state
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor 1
    public BarangMusik(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
        this.stok = 0;
    }

    // Constructor 2
    public BarangMusik(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = 0;
    }

    // Constructor 3:
    public BarangMusik(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk mengubah harga
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    // Method untuk menambah stok
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    // Method untuk menampilkan informasi lengkap
    void tampilInfo() {
        System.out.println("Alat musik " + nama + " | Kode: " + kode +
                " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}


package pert3;
public class Karyawan {
    // Variabel
    protected String nama;
    protected double gajiPokok;

    // Constructor
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan info dasar
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}

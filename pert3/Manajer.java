package pert3;
public class Manajer extends Karyawan {
    private double tunjangan;

    // Constructor
    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    // Override method tampilInfo
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok + " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}

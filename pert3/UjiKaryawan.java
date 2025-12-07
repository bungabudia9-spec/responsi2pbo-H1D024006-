package pert3;
public class UjiKaryawan {
    public static void main(String[] args) {
        // Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===\n");

        // Buat objek Karyawan biasa
        Karyawan stafBiasa = new Karyawan("Budi Santoso", 4000000.0);
        System.out.println("Status: Karyawan Biasa");
        stafBiasa.tampilInfo();

        System.out.println();

        // Buat objek Manajer
        Manajer manajer = new Manajer("Siti Aminah", 6000000.0, 2500000.0);
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}

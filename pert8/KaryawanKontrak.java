package pert8;
public interface KaryawanKontrak {

    double hitungGaji(int jamKerja);

    void perpanjangKontrak(int durasiBulan);

    // Default Method
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}
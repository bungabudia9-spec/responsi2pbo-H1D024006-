package pert8;

public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {

    // Atribut/State
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    // Constructor
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false; // Default: false
    }

    @Override
    public double hitungGaji(int jamKerja) {
        double gaji = jamKerja * gajiPerJam;
        System.out.println("Gaji " + nama + " untuk " + jamKerja + " jam kerja: Rp " + gaji);
        return gaji;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        // Output sesuai permintaan
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    // --- Implementasi AksesSistem ---
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;

            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {

            System.out.println("Login gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;

        System.out.println(nama + " berhasil logout.");
    }

    // Override Default Method (Sesuai Peran)
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }

    public boolean isSedangLogin() {
        return sedangLogin;
    }

    public String getNama() {
        return nama;
    }
}
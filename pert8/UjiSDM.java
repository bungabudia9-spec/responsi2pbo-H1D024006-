package pert8;
public class UjiSDM {
    public static void main(String[] args) {

        System.out.println("=== UJI SISTEM SDM (Programmer Magang) ===");

        // 1. Membuat objek ProgrammerMagang
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Menghitung gaji
        andi.hitungGaji(160);

        // 3. Mengecek status cuti (Override getStatusCuti)
        System.out.println("Status cuti: " + andi.getStatusCuti());

        // 4. Mencoba login menggunakan PIN yang salah
        andi.login("9999");

        // 5. Mencoba login menggunakan PIN yang benar
        andi.login("1234");

        // 6. Mengecek peran akses (Override getRoleAkses)
        System.out.println("Role akses: " + andi.getRoleAkses());

        // 7. Memperpanjang kontrak
        andi.perpanjangKontrak(6);

        // 8. Coba logout
        andi.logout();
    }
}
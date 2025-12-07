package pert5;

public class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] daftarMesin = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        daftarMesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        daftarMesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        // Isi array dengan objek mesinTraktor
        daftarMesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        // Isi array dengan objek mesinTraktorListrik
        daftarMesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        daftarMesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        // Loop untuk menampilkan info masing-masing mesin
        for (defaultMesin m : daftarMesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin m : daftarMesin) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin mesinTerbaik = daftarMesin[0];
        for (defaultMesin m : daftarMesin) {
            if (m.nilaiPerforma() > mesinTerbaik.nilaiPerforma()) {
                mesinTerbaik = m;
            }
        }
        System.out.println(mesinTerbaik.namaMesin + " → " + mesinTerbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        // Logika sorting 3 performa tertinggi
        java.util.Arrays.sort(daftarMesin, (a, b) -> Double.compare(b.nilaiPerforma(), a.nilaiPerforma()));
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + daftarMesin[i].namaMesin + " → " + daftarMesin[i].nilaiPerforma());
        }
    }
}

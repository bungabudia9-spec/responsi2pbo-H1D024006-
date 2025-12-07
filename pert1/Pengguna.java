package pert1;
public class Pengguna {
    private int umur;
    private double beratBadan;
    private double tinggiBadan;
    public static final double FAKTOR_AKTIVITAS = 1.2;


    public Pengguna(int umur, double beratBadan, double tinggiBadan) {
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    public double hitungBMI() {
        // Konversi tinggi dari cm ke m
        double tinggiMeter = this.tinggiBadan / 100.0;
        return this.beratBadan / (tinggiMeter * tinggiMeter);
    }

    public void tampilKategori() {
        double bmi = hitungBMI(); // Panggil method hitungBMI

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else { // BMI >= 25
            System.out.println("Kategori: Obesitas");
        }
    }

    public double hitungKalori() {
        // Menggunakan konstanta FAKTOR_AKTIVITAS
        return this.beratBadan * FAKTOR_AKTIVITAS * 10.0;
    }


    public void tampilInfo() {
        double bmi = hitungBMI();
        double kalori = hitungKalori();

        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Berat: " + this.beratBadan + " kg");
        System.out.println("Tinggi: " + this.tinggiBadan + " cm");
        //printf untuk memformat angka desimal
        System.out.printf("BMI: %.2f%n", bmi);
        tampilKategori(); // Panggil method tampilKategori()
        System.out.printf("Kebutuhan Kalori: %.0f kal/hari%n", kalori);
        System.out.println("====================================");
    }
}
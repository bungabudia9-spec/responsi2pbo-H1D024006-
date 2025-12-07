package pert5;

public class defaultMesin {
    // Variabel umum mesin
    protected String namaMesin;
    protected int tenagaHP;

    // Constructor
    public defaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    // Method menampilkan info dasar mesin
    public void tampilInfo() {
        System.out.println("Mesin " + namaMesin + " | Tenaga: " + tenagaHP + " HP");
    }

    // Method menghitung performa standar
    public double nilaiPerforma() {
        return tenagaHP * 1.0;
    }

    // Method kategori default
    public String kategoriMesin() {
        return "Mesin Umum";
    }
}

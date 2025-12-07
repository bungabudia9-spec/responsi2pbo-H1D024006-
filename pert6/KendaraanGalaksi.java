package pert6;

public abstract class KendaraanGalaksi {

    private String namaKendaraan;
    private int levelEnergi; // 0–100
    private int kapasitasPenumpang;

    public KendaraanGalaksi(String namaKendaraan, int kapasitasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.levelEnergi = 100; // default penuh
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public int getLevelEnergi() {
        return levelEnergi;
    }

    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    public final void tampilStatus() {
        System.out.println(namaKendaraan + " | Energi: " + levelEnergi + "% | Kapasitas: " + kapasitasPenumpang + " orang");
    }

    public abstract void aktifkanMesin();
    public abstract void jelajah(int jarak);
    public abstract void isiEnergi(int jumlah);


    protected void setLevelEnergi(int levelEnergi) {
        if (levelEnergi > 100) this.levelEnergi = 100;
        else if (levelEnergi < 0) this.levelEnergi = 0;
        else this.levelEnergi = levelEnergi;
    }
}

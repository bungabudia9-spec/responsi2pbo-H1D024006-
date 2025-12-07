package pert6;

public class KapalEksplorasi extends KendaraanGalaksi {

    private int modulScan; // level 1–5
    public KapalEksplorasi(String namaKendaraan, int kapasitasPenumpang, int modulScan) {
        super(namaKendaraan, kapasitasPenumpang);
        this.modulScan = modulScan;
    }
    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    public void jelajah(int jarak) {
        int energiPerlu = (int) Math.ceil(jarak * 2); // 2% per km
        if (getLevelEnergi() < energiPerlu) {
            System.out.println("Energi tidak cukup untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - energiPerlu);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = getLevelEnergi();
        setLevelEnergi(energiAwal + jumlah);
        System.out.println("Energi bertambah dari " + energiAwal + "% menjadi " + getLevelEnergi() + "%.");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}

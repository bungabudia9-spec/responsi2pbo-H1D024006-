package pert6;

public class PesawatTempur extends KendaraanGalaksi {

    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang); // panggil constructor parent
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    public void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    public void jelajah(int jarak) {
        // konsumsi energi = 3% per km
        int energiPerlu = (int) Math.ceil(jarak * 3); // persen
        if (getLevelEnergi() < energiPerlu) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setLevelEnergi(getLevelEnergi() - energiPerlu);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    public void isiEnergi(int jumlah) {
        int energiAwal = getLevelEnergi();
        setLevelEnergi(energiAwal + jumlah);
        System.out.println("Energi bertambah dari " + energiAwal + "% menjadi " + getLevelEnergi() + "%.");
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak cukup! Tersisa " + jumlahRudal + " rudal.");
        }
    }
}

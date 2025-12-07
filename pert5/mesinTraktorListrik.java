package pert5;
public class mesinTraktorListrik extends mesinTraktor {
    protected double kapasitasBaterai;

    public mesinTraktorListrik(String nama, int hp, double kapasitasTarik, double kapasitasBaterai) {
        super(nama, hp, kapasitasTarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor Listrik " + namaMesin + " | Tarik: " + kapasitasTarik +
                " ton | Baterai: " + kapasitasBaterai + " kWh | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 1.1) + (kapasitasBaterai * 5);
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
    }

    @Override
    public void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}

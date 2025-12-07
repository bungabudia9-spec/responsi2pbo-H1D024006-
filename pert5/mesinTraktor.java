package pert5;

public class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor
    protected double kapasitasTarik;

    // Constructor
    public mesinTraktor(String nama, int hp, double kapasitasTarik) {
        super(nama, hp); // panggil constructor parent defaultMesin
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Traktor " + namaMesin + " | Tarik: " + kapasitasTarik +
                " ton | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 0.9) + (kapasitasTarik * 10); // performa traktor
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
    }

    public void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}

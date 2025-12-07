package pert5;

public class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor
    private String tipeMotor;

    // Constructor
    public mesinMotor(String nama, int hp, String tipeMotor) {
        super(nama, hp);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Mesin Motor " + namaMesin + " | Tipe: " + tipeMotor + " | Tenaga: " + tenagaHP + " HP");
    }

    @Override
    public double nilaiPerforma() {
        return tenagaHP * 1.2;
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
    }

    public void suaraMesin() {
        System.out.println("Brummm! Mesin motor menyala!");
    }
}

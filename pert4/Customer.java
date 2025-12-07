package pert4;
public class Customer {
    // Variabel
    protected String nama;
    protected String idCustomer;
    protected int totalBelanja;

    // Constructor
    public Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    // Method untuk menampilkan info
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + idCustomer + " | Total Belanja: Rp " + totalBelanja);
    }
}


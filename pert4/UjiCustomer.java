package pert4;
public class UjiCustomer {
    public static void main(String[] args) {
        // Header
        System.out.println("=== DATA CUSTOMER BELANJAKU ===\n");

        // Buat objek Customer biasa
        Customer custBiasa = new Customer("Budi Santoso", "CST-001", 500000);
        System.out.println("Status: Customer Biasa");
        custBiasa.tampilkanInfo();

        System.out.println(); // baris baru

        // Buat objek Member
        Member member = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");
        System.out.println("Status: Member");
        member.tampilkanInfo();
    }
}

package pert7;
public class PaymentTest {
    public static void main(String[] args) {

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // Buat objek EWalletPayment
        EWalletPayment pembayaran = new EWalletPayment("OVO", 50000, 150000);

        // Tampilkan saldo awal
        System.out.println("Saldo awal: " + pembayaran.getBalance());

        // Proses pembayaran
        System.out.println("Memproses pembayaran sebesar " + pembayaran.getPaymentAmount() + "...");
        String result = pembayaran.processPayment();
        System.out.println(result);

        // Tampilkan sisa saldo
        System.out.println("Sisa saldo: " + pembayaran.getBalance());

        // Tampilkan detail transaksi
        System.out.println("Detail Transaksi: " + pembayaran.getPaymentDetails());
    }
}


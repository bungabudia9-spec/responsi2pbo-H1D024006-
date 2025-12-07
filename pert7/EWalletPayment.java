package pert7;
public class EWalletPayment implements PaymentMethod {

    private String walletName;
    private double paymentAmount;
    private double userBalance;
    private final double transactionFee = 2000;

    // Constructor
    public EWalletPayment(String walletName, double paymentAmount, double userBalance) {
        this.walletName = walletName;
        this.paymentAmount = paymentAmount;
        this.userBalance = userBalance;
    }

    // Implementasi method interface
    @Override
    public String processPayment() {
        double total = paymentAmount + transactionFee;
        if (userBalance >= total) {
            userBalance -= total;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + walletName;
    }

    @Override
    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public double getBalance() {
        return userBalance;
    }

    // Getter tambahan untuk nominal pembayaran
    public double getPaymentAmount() {
        return paymentAmount;
    }
}

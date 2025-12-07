package pert4;
public class Member extends Customer {
    private int poinReward;
    private String levelKeanggotaan;

    // Constructor
    public Member(String nama, String idCustomer, int totalBelanja, int poinReward, String levelKeanggotaan) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.levelKeanggotaan = levelKeanggotaan;
    }

    // Override method tampilkanInfo
    @Override
    void tampilkanInfo() {
        // Panggil versi parent
        super.tampilkanInfo();
        // Tambahkan info member
        System.out.println("Poin Reward: " + poinReward + " | Level: " + levelKeanggotaan);
    }
}

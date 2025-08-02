package l_oop.b_exercise;

public class WalletPayment extends Payment{
    private double walletAmount = 50d;

    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        if(amount > walletAmount)
            System.out.println("can't");
        else
            System.out.println("can");
    }
}

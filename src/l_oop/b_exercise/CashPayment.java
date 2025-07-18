package l_oop.b_exercise;

public class CashPayment extends Payment{

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment(double amount) {
        System.out.println("payment successfully with cash " + amount);
    }
}

package l_oop.b_exercise;

public abstract class Payment {
    private double amount;

    public Payment(double amount) {
       this.amount = amount;
    }

    abstract void processPayment(double amount);
}

package l_oop.b_exercise;

public class CreditCardPayment extends Payment{
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("pay " + amount + " successful with card " + cardNumber);
    }
}

package l_oop.b_exercise;

public class Main {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment(1000d, "kdlfjl");
        payment.processPayment(200d);
    }
}

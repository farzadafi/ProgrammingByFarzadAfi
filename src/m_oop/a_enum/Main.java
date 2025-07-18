package m_oop.a_enum;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, OrderStatus.DELIVERED);
        order.printStatusMessage();
    }
}

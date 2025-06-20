package m_oop.a_enum;

public class Order {
    private int id;
    private OrderStatus orderStatus;

    public Order(int id, OrderStatus orderStatus) {
        this.id = id;
        this.orderStatus = orderStatus;
    }

    public void printStatusMessage() {
        if(orderStatus.equals(OrderStatus.NEW))
            System.out.println("new order");
        else if(orderStatus.equals(OrderStatus.PROCESSING))
            System.out.println("order is processing");
        else if(orderStatus.equals(OrderStatus.SHIPPED))
            System.out.println("sent order");
        else if(orderStatus.equals(OrderStatus.DELIVERED))
            System.out.println("order delivered");
        else if(orderStatus.equals(OrderStatus.CANCELLED))
            System.out.println("order cancelled");
    }
}

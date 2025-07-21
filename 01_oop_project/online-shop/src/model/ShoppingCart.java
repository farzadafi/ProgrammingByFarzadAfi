package model;

import repository.ShoppingCartRepository;

import java.time.LocalDateTime;

public class ShoppingCart {
    private int id;
    private int totalAmount;
    private LocalDateTime registerDate;
    private int customerId;

    public void setId(int id) {
        this.id = id;
    }

    public ShoppingCart(int customerId) {
        this.customerId = customerId;
    }
}

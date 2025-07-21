package repository;

import model.ShoppingCart;

public class ShoppingCartRepository {

    private static final ShoppingCart[] SHOPPING_CARTS = new ShoppingCart[100];
    private static int size = 0;

    public int getNextId() {
        return size + 1;
    }

    public boolean save(ShoppingCart shoppingCart) {
        if (SHOPPING_CARTS[size] != null)
            return false;
        SHOPPING_CARTS[size] = shoppingCart;
        ++size;
        return true;
    }
}

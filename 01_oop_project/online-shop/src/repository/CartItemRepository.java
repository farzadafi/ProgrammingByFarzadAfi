package repository;

import model.CartItem;

public class CartItemRepository {

    private static final CartItem[] CART_ITEMS = new CartItem[100];
    private static int size = 0;

    public boolean save(CartItem cartItem) {
        if (CART_ITEMS[size] != null)
            return false;
        CART_ITEMS[size] = cartItem;
        ++size;
        return true;
    }
}

package repository;

import model.CartItem;
import util.DynamicArray;

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

    public DynamicArray getProductIdByShoppingCartId(int shoppingCartId) {
        DynamicArray productIdDynamicArray = new DynamicArray("Integer");
        for (int i = 0; i < size; i++) {
            if(CART_ITEMS[i].getShoppingCartId() == shoppingCartId)
                productIdDynamicArray.add(CART_ITEMS[i].getProductId());
        }
        return productIdDynamicArray;
    }
}

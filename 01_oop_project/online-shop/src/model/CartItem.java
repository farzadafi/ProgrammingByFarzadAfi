package model;

public class CartItem {
    private int shoppingCartId;
    private int productId;

    public CartItem(int shoppingCartId, int productId) {
        this.shoppingCartId = shoppingCartId;
        this.productId = productId;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public int getProductId() {
        return productId;
    }
}

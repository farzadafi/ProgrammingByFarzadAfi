package service;

import model.Product;
import model.ShoppingCart;
import repository.ShoppingCartRepository;
import util.DynamicArray;

public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository = new ShoppingCartRepository();
    private final CartItemService cartItemService = new CartItemService();
    private final ProductService productService = new ProductService();

    public int add(ShoppingCart shoppingCart) {
        int nextId = shoppingCartRepository.getNextId();
        shoppingCart.setId(nextId);
        return shoppingCartRepository.save(shoppingCart);
    }

    public int getTotalPriceForShoppingCart(int shoppingCartId) {
        DynamicArray productId = cartItemService.getProductIdByShoppingCartId(shoppingCartId);
        int totalPrice = 0;
        DynamicArray productsById = productService.getProductsById(productId);
        for (int i = 0; i < productsById.getSize() ; i++) {
            Product product = (Product) productsById.getByIndex(i);
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public boolean processShoppingCart(int shoppingCartId) {
        DynamicArray productId = cartItemService.getProductIdByShoppingCartId(shoppingCartId);
        productService.minesQuantityOfProduct(productId);
        return true;
    }
}

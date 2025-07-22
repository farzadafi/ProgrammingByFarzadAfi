package service;

import model.CartItem;
import repository.CartItemRepository;

public class CartItemService {

    private final ProductService productService = new ProductService();
    private final CartItemRepository cartItemRepository = new CartItemRepository();

    public boolean add(CartItem cartItem) {
        int productQuantity = productService.getQuantityById(cartItem.getProductId());
        if (productQuantity < 1)
            return false;
        return cartItemRepository.save(cartItem);
    }
}

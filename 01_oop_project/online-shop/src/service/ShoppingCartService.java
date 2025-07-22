package service;

import model.ShoppingCart;
import repository.ShoppingCartRepository;

public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository = new ShoppingCartRepository();

    public int add(ShoppingCart shoppingCart) {
        int nextId = shoppingCartRepository.getNextId();
        shoppingCart.setId(nextId);
        return shoppingCartRepository.save(shoppingCart);
    }
}

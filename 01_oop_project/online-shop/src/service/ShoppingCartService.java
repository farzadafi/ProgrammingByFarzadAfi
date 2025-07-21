package service;

import model.ShoppingCart;
import repository.ShoppingCartRepository;

public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository = new ShoppingCartRepository();

    public boolean add(ShoppingCart shoppingCart){
        int nextId = shoppingCartRepository.getNextId();
        shoppingCart.setId(nextId);
        shoppingCartRepository.save(shoppingCart);
        return true;
    }
}

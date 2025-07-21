package repository;

import model.Product;

public class ProductRepository {

    private static final Product[] PRODUCTS = new Product[100];
    private static int size = 0;

    public int getNextId() {
        return size + 1;
    }

    public boolean save(Product product) {
        if(PRODUCTS[size] != null)
            return false;
        PRODUCTS[size] = product;
        ++size;
        return true;
    }
}

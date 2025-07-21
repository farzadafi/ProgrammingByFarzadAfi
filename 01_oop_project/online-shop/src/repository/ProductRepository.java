package repository;

import model.Product;
import util.DynamicArray;

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

    public Product findByName(String name) {
        for (int i = 0; i < size; i++) {
            if(PRODUCTS[i].getName().equals(name))
                return PRODUCTS[i];
        }
        return null;
    }

    public DynamicArray getProductsByCategoryId(int categoryId) {
        DynamicArray products = new DynamicArray("Product");
        for (int i = 0; i < size; i++) {
            if(PRODUCTS[i].getCategoryId() == categoryId)
                products.add(PRODUCTS[i]);
        }
        return products;
    }
}

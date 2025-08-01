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
        if (PRODUCTS[size] != null)
            return false;
        PRODUCTS[size] = product;
        ++size;
        return true;
    }

    public Product findByName(String name) {
        for (int i = 0; i < size; i++) {
            if (PRODUCTS[i].getName().equals(name))
                return PRODUCTS[i];
        }
        return null;
    }

    public DynamicArray getProductsByCategoryId(int categoryId) {
        DynamicArray products = new DynamicArray("Product");
        for (int i = 0; i < size; i++) {
            if (PRODUCTS[i].getCategoryId() == categoryId)
                products.add(PRODUCTS[i]);
        }
        return products;
    }

    public int getQuantityById(int id) {
        for (int i = 0; i < size; i++) {
            if (PRODUCTS[i].getId() == id)
                return PRODUCTS[i].getQuantity();
        }
        return -1;
    }

    public DynamicArray getProductsById(DynamicArray dynamicArray) {
        DynamicArray productsDynamicArray = new DynamicArray("Product");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < dynamicArray.getSize(); j++) {
                if (PRODUCTS[i].getId() == (int) dynamicArray.getByIndex(j))
                    productsDynamicArray.add(PRODUCTS[i]);
            }
        }
        return productsDynamicArray;
    }

    public void minesQuantity(DynamicArray productIds) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < productIds.getSize(); j++) {
                int productId = (int) productIds.getByIndex(j);
                if (PRODUCTS[i].getId() == productId) {
                    Product product = PRODUCTS[i];
                    int newQuantity = product.getQuantity() - 1;
                    product.setQuantity(newQuantity);
                    PRODUCTS[i] = product;
                }
            }
        }
    }
}

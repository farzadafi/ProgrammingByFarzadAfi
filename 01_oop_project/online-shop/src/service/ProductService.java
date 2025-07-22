package service;

import dto.ProductWithCategoryName;
import model.Product;
import model.enumeration.SortType;
import repository.ProductRepository;
import util.DynamicArray;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepository();
    private final CategoryService categoryService = new CategoryService();

    public boolean add(Product product, String categoryName) {
        int idFromCategoryName = categoryService.getIdFromCategoryName(categoryName);
        if (idFromCategoryName == -1)
            return false;
        int id = productRepository.getNextId();
        product.setId(id);
        product.setCategoryId(idFromCategoryName);
        return productRepository.save(product);
    }

    public ProductWithCategoryName findProductByName(String name) {
        Product product = productRepository.findByName(name);
        String categoryName = categoryService.getCategoryNameFromId(product.getCategoryId());
        return new ProductWithCategoryName(product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                categoryName);
    }

    public Product[] getProductsByCategoryName(String categoryName, SortType sortType) {
        int categoryId = categoryService.getIdFromCategoryName(categoryName);
        DynamicArray productsDynamicArray = productRepository.getProductsByCategoryId(categoryId);
        Product[] products = convertDynamicArrayToProducts(productsDynamicArray);
        if(sortType.equals(SortType.ASC))
            sortAsc(products);
        else
            sortDesc(products);
        return products;
    }

    private void sortDesc(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (products[i].getPrice() > products[j].getPrice()) {
                    Product product = products[i];
                    products[i] = products[j];
                    products[j] = product;
                }
            }
        }
    }

    private void sortAsc(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length; j++) {
                if (products[i].getPrice() < products[j].getPrice()) {
                    Product product = products[i];
                    products[i] = products[j];
                    products[j] = product;
                }
            }
        }
    }

    private Product[] convertDynamicArrayToProducts(DynamicArray productsDynamicArray) {
        Product[] products = new Product[productsDynamicArray.getSize()];
        for (int i = 0; i < productsDynamicArray.getSize(); i++) {
            products[i] = (Product) productsDynamicArray.getByIndex(i);
        }
        return products;
    }

    public int getQuantityById(int prodcutId) {
        return productRepository.getQuantityById(prodcutId);
    }

    public DynamicArray getProductsById(DynamicArray productsDynamicArray) {
        return productRepository.getProductsById(productsDynamicArray);
    }
}

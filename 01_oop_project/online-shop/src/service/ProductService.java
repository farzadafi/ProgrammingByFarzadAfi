package service;

import dto.ProductWithCategoryName;
import model.Product;
import repository.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository = new ProductRepository();
    private final CategoryService categoryService = new CategoryService();

    public boolean add(Product product, String categoryName) {
        int idFromCategoryName = categoryService.getIdFromCategoryName(categoryName);
        if(idFromCategoryName == -1)
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
}

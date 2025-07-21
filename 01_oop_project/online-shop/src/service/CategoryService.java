package service;

import model.Category;
import repository.CategoryRepository;

public class CategoryService {

    private final CategoryRepository categoryRepository = new CategoryRepository();

    public boolean add(Category category){
        if(categoryRepository.isDuplicateName(category.getName()))
            return false;
        category.setId(categoryRepository.getNextId());
        return categoryRepository.save(category);
    }

    public int getIdFromCategoryName(String name) {
        return categoryRepository.getIdFromName(name);
    }
}
package repository;

import model.Category;

import java.util.DuplicateFormatFlagsException;

public class CategoryRepository {

    private static final Category[] CATEGORIES = new Category[100];
    private int size = 0;

    public boolean isDuplicateName(String name) {
        for (int i = 0; i < size; i++) {
            if(CATEGORIES[i].getName().equals(name))
                return true;
        }
        return false;
    }

    public boolean save(Category category) {
        if(CATEGORIES[size] != null)
            return false;
        CATEGORIES[size] = category;
        ++size;
        return true;
    }

    public int getNextId() {
        return size + 1;
    }
}

package repository;

import model.Category;

import java.util.DuplicateFormatFlagsException;

public class CategoryRepository {

    private static final Category[] CATEGORIES = new Category[100];
    private static int size = 0;

    public boolean isDuplicateName(String name) {
        for (int i = 0; i < size; i++) {
            if (CATEGORIES[i].getName().equals(name))
                return true;
        }
        return false;
    }

    public boolean save(Category category) {
        if (CATEGORIES[size] != null)
            return false;
        CATEGORIES[size] = category;
        ++size;
        return true;
    }

    public int getNextId() {
        return size + 1;
    }

    public int getIdFromName(String name) {
        for (int i = 0; i < size; i++) {
            if (CATEGORIES[i].getName().equals(name))
                return CATEGORIES[i].getId();
        }
        return -1;
    }

    public Category findById(int id) {
        for (int i = 0; i < size; i++) {
            if (CATEGORIES[i].getId() == id)
                return CATEGORIES[i];
        }
        return null;
    }
}

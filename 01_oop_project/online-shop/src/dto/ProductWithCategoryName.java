package dto;

public record ProductWithCategoryName(int id,
                                      String name,
                                      String description,
                                      int price,
                                      String categoryName) {
}

package ir.farzadafi.dto;

public record BookWithBooleanQuantity(int id,
                                      String title,
                                      String authorName,
                                      int publishYear,
                                      boolean hasQuantity) {
}

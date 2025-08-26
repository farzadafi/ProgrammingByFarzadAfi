package ir.farzadafi.dto;

import java.time.LocalDate;

public record UnReturnedBook(String title,
                             LocalDate borrowDate) {
}

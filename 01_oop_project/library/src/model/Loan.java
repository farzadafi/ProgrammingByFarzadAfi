package model;

public class Loan {
    private String nationalCode;
    private String bookTitle;

    public Loan(String nationalCode, String bookTitle) {
        this.nationalCode = nationalCode;
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getNationalCode() {
        return nationalCode;
    }
}

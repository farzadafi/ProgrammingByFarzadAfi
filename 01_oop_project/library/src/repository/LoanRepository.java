package repository;

import model.Loan;

public class LoanRepository {

    private static final Loan[] LOANS = new Loan[100];

    public int countOfLoanBookByTitle(String title) {
        int counter = 0;
        for (int i = 0; i < LOANS.length; i++) {
            if (LOANS[i] != null && LOANS[i].getBookTitle().equals(title))
                ++counter;
        }
        return counter;
    }

    public void save(Loan loan) {
        for (int i = 0; i < LOANS.length; i++) {
            if (LOANS[i] == null) {
                LOANS[i] = loan;
                break;
            }
        }
    }

    public void retrieveBook(String nationalCode, String bookTitle) {
        int i;
        for (i = 0; i < LOANS.length; i++) {
            if ((LOANS[i].getNationalCode().equals(nationalCode)) &&
                    LOANS[i].getBookTitle().equals(bookTitle))
                break;
        }
        LOANS[i] = null;
        for (int j = i; j < LOANS.length; j++) {
            if (LOANS[i + 1] != null) {
                LOANS[i] = LOANS[i + 1];
                LOANS[i + 1] = null;
            }
        }
    }
}

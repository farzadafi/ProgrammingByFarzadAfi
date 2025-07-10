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
}

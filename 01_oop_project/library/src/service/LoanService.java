package service;

import model.Book;
import model.Loan;
import model.User;
import repository.LoanRepository;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LoanService {

    private final LoanRepository loanRepository = new LoanRepository();
    private final UserService userService = new UserService();
    private final BookService bookService = new BookService();

    public int loanBook(String bookTitle, String nationalCode) {
        User user = userService.findUserByNationalCode(nationalCode);
        LocalDate registerDate = user.getRegisterDate();
        LocalDate now = LocalDate.now();
        if(registerDate.plusYears(1).isBefore(now))
            return 1;

        Book book = bookService.findByTitleWithQuantity(bookTitle);
        int countOfLoan = countOfLoanBookByTitle(bookTitle);
        if(countOfLoan == book.getQuantity())
            return 2;

        Loan loan = new Loan(nationalCode, bookTitle, LocalDate.now().minusDays(15));
        loanRepository.save(loan);
        return 3;
    }

    public int countOfLoanBookByTitle(String bookTitle) {
        return loanRepository.countOfLoanBookByTitle(bookTitle);
    }

    public void retrieveBook(String nationalCode, String bookTitle){
        LocalDate loanDate =
                loanRepository.getLoanTimeByNationalCodeAndBookTitle(nationalCode, bookTitle);
        long between = ChronoUnit.DAYS.between(loanDate, LocalDate.now());
        if(between > 10){
            int jarimehDay = (int) (between - 10);
            int jarimeh = jarimehDay * 1000;
            System.out.println("jarimeh is:");
            System.out.println(jarimeh);
        }
        loanRepository.retrieveBook(nationalCode, bookTitle);
    }
}

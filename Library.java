import java.util.*;
import java.util.TreeSet;
public class Library
{
    private String name;
    private Borrower borrower;
    private Book book;
    private Loan loan;

    public Library(String name)
    {
        this.name = name;
    }

    public void displayBooksForLoan()
    {
        for(int i=0; i<=ts.size(); i++)
        {
            Book book = getBook();
            boolean result = isABookAvailableForLoan(int catalogueNumber);
            if(result == true)
            {
                System.out.println(title);
            }
            else {}
        }
    }

    public void displayBooksOnLoan()
    {
        for(int i=0; i<ts.size(); i++)
        {
            book = getBook();
            boolean result = isABookAvailableForLoan(int catalogueNumber);
            if(result == false)
            {
                System.out.println(title);
            }
            else {}
        }
    }

    public String lendOneBook(String borrowerName, String title, String author)
    {
        checkBorrower(borrowerName);
        if(result=="possible")
        {
            checkBook(title, author);
            if(result=="possible")
            {
                Loan loan = createLoan(loanDate, book, borrower);
                storeLoan(loan);
                increaseTheNumberOfBooks();
                System.out.println("대출이 완료되었습니다!");
            }
            else
            {
                System.out.println("대출이 불가능합니다.");
            }
        }
        else
        {
            System.out.println("대출이 불가능합니다.");
        }
    }

    public String returnOneBook(String borrowerName, String title, String author)
    {
        loan = getLoan(borrowerName, title, author);
        checkOverdue(loanDate);
        deleteLoanObject();
        decreaseTheNumberOfBooks();
    }

    public String registerOneBorrower(String borrowerName)
    {
        createBorrower(borrowerName);
    }

    public String registerOneBook(String title, String author)
    {
        createBook(title,author);
    }
}
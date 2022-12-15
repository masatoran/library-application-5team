import java.util.HashSet;
public class Borrower
{
    private String borrowerName;
    private int loanCount = 0;

    public Borrower(String borrowerName)
    {
        this.borrowerName = borrowerName;
        this.loanCount = loanCount;
    }

    public Borrower createBorrower(String borrowerName)
    {
        Borrower borrower = new Borrower(borrowerName);
        return borrower;
    }

    public void increaseTheNumberOfBooks()
    {
        loanCount++;
    }

    public void decreaseTheNumberOfBooks()
    {
        loanCount--;
    }

    public String checkBorrower()
    {
        String result;
        if(loanCount < 15)
        { result = "possible"; }
        else
        { result = "impossible"; }
        return result;
    }

    HashSet<Object> borrowers = new HashSet<Object>();

    public void storeBorrower(Borrower borrower)
    {
        borrowers.add(borrower);
    }
}
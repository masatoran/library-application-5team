import java.util.LinkedList;
import java.util.Calendar;

/**
 * クラス Loan の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Loan
{
    // インスタンス変数 - コードに合わせて説明を書き換えます.
    private Calendar loanDate;
    private Calendar returnDate;
    private Book book;
    private Borrower borrower;
    LinkedList<Loan> linkedList = new LinkedList<>();
    
    /**
     * Loan クラスのインスタンスのためのコンストラクタ
     */
    public Loan(Book book, Borrower borrower)
    {
        this.book = book;
        this.borrower = borrower;
        this.loanDate = Calendar.getInstance();
        this.returnDate = Calendar.getInstance();
        returnDate.add(loanDate.DATE,15);
    }

    
    public boolean checkOverdue(Calendar loanDate)
    {
        Calendar todayDate = Calendar.getInstance();
        int result = todayDate.compareTo(this.returnDate);
        if(result >= 1){
            return false;
        }
        return true;
    }
    
    public void deleteLoanObject(Book book){
        book = null;
        borrower = null;
    }
    
    public void storeLoan(Loan loan){
        linkedList.add(loan);
        System.out.println("정상적으로 대출정보가 등록되었습니다.");
    }
}

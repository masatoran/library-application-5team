import java.util.TreeSet;
import java.util.Scanner;
/**
 * LibraryApplication에서의 book object가 갖는 phild와 method를 모아 놓은 class.
 *
 * @author ()
 * @version ()
 */
public class Book
{
    private String title;
    private String author;
    private int catalogueNumber;
    private Object borrower;
    private Object loan;
    private int i=0;
    Scanner scan = new Scanner(System.in);
    TreeSet<Object> ts = new TreeSet<>();

    public Book(String title, String author, int catalogueNumber)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = ts.last();
    }

    public boolean isABookAvailableForLoan(){
        if(this.borrower == null){
            return true;// able to loan
        }
        else{
            return false;// unable to loan
        }
    }    

    public void createBook(String title, String author, int catalogueNumber){
        Book creatBook = new Book(title,author,catalogueNumber);
    }

    public Object getBook(){
        Object i =0;
        int a =0;
        for(i=0;i==ts.last(i);++i){

            if (ts(i)!=loan){
                System.out.println("대출 가능한 책입니다.");
            }
            else{
                continue;
            }
        }
    }

    public boolean findOneBook(String title, String author){
        return boolean;
    }

    public String checkBook(String title, String author){
        return String;
    }

    public void storeBook(Book book){
        ts.add(book);
        System.out.println("정상적으로 책이 등록되었습니다.");
    }
} 
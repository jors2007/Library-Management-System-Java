package library;

import java.util.ArrayList;
import java.util.Date;

public interface IDBConnectivity {

    void closeConnection();

    Books GetaBookbyId(int book_id);

    ArrayList<Books> LoadAllBooks();

    String GetAuthorofBook(int book_id);

    String GetTitleofBook(int book_id);

    String GetSubjectofBook(int book_id);

    int GetQuantityofBook(int book_id);

    void UpdateBookQuantity(int new_quantity, int id);

    void ChangeBookInfo(int book_id, String UpdatedInfo, int type);

    Borrower GetaBorrowerObjectByUserId(int id);

    ArrayList<Users> LoadAllBorrowers();

    boolean SetFineStatus(int borrower_id, boolean fine_defaulter);

    boolean SetTelephone(int borrower_id, String telnum);

    boolean SetAddress(int borrower_id, String Address);

    boolean SetName(int borrower_id, String name);

    boolean SetGender(int borrower_id, char g);

    boolean SetFineAmount(int borrower_id, double fine_amount);

    boolean GetFineStatus(int borrower_id);

    double GetFineAmount(int borrower_id);

    ArrayList<Librarian> LoadAllLibrarians();

    boolean AddBorrower(int user_id, String user_name, char user_gender, String add, String telnum);

    ArrayList<Clerk> LoadAllClerk();

    ArrayList<Loan> LoadLoanList();

    ArrayList<Loan> LoadLoanListofSpecificUser(int user_id);

    boolean AddNewLoan(Loan LoanObj);

    int GetLoanedBookId(int loanId);

    String GetLoanFineStatus(int loanId);

    Date GetReturnDate(int loanId);

    Date GetIssueDate(int loanId);

    Date GetDueDate(int loanId);

    Books GetLoanedBook(int loanId);

    int GetLoaneeId(int loanId);

    boolean GetLoanReturnedStatus(int loanId);

    void SetLoanReturnedDate(int loanId, Date Ret_date);

    void SetLoanedBook(int loanId, int book_id);

    void SetLoaneeObject(int loanId, int borrower);

    void SetReturnStatus(int loanId, boolean status);

    void SetLoanFineStatus(int loanId, String status);

    void SetLoan(int loanID, Loan LoanObj);

    void AddNewBook(int book_id, String title, String author, String subject, int quantity);

    boolean DeleteABook(int book_id);

    ArrayList<Books> SearchBookbyTitle(String input);

    ArrayList<Books> SearchBookbyAuthor(String input);

    ArrayList<Books> SearchBookbySubject(String input);

    boolean CheckUserId(int ID);

    boolean CheckIsBookLoaned(int book_id);

}

package library.Solution_OCP_1;
import library.Solution_SRP_1.Book;


public interface IBook {
    void AddNewBook(Book book, int quantity);
    boolean DeleteABook(int book_id);
    void updateBookInfo(Book book);
}
package library;

import java.util.ArrayList;

/**
 * Interface that represents book-management capabilities.
 * Implemented by staff who can add/delete/update books (e.g., Librarian).
 */
public interface ManageBooks {

    void AddBook(ArrayList<Books> BooksList, String NewAuthor, String NewTitle, String NewSubject, int quantity);

    boolean DeleteBook(ArrayList<Books> BooksList, int book_id);

    void ChangeInfo(ArrayList<Books> BooksList, int book_id, int command, String NewInfo, int Quantity);

}

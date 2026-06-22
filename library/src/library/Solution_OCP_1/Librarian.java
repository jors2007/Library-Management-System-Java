package library.Solution_OCP_1;

import library.Solution_SRP_1.Book;
import library.Staff;
import java.util.ArrayList;

public class Librarian extends Staff {

    private IBook bookRepository;
    private IDGenerationSt idStrategy;

    public Librarian(int user_id, String user_name, char gender, IBook bookRepository, IDGenerationSt idStrategy) {
        super(user_id, user_name, gender);
        this.bookRepository = bookRepository;
        this.idStrategy = idStrategy;
    }

    
    public void AddBook(ArrayList<Book> BooksList, String NewAuthor, String NewTitle, String NewSubject, int quantity) {
        int book_id = idStrategy.generateId(BooksList);

        Book NewBook = new Book(book_id, NewTitle, NewAuthor, NewSubject);

        bookRepository.AddNewBook(NewBook, quantity);

        BooksList.add(NewBook);
    }

    
    public boolean DeleteBook(ArrayList<Book> BooksList, int book_id) {
        boolean result = bookRepository.DeleteABook(book_id);

        if (result) {
            Book toDelete = null;
            for (Book b : BooksList) {
                if (b.getBook_id() == book_id) {
                    toDelete = b;
                    break;
                }
            }
            if (toDelete != null) {
                BooksList.remove(toDelete);
            }
        }
        return result;
    }

    public void ChangeInfo(ArrayList<Book> BooksList, int book_id, BookUpdateComando updateCommand, String NewInfo, int Quantity) {
        for (Book b : BooksList) {
            if (b.getBook_id() == book_id) {
               
                updateCommand.update(b, NewInfo, Quantity);
                bookRepository.updateBookInfo(b);
                break;
            }
        }
    }
}

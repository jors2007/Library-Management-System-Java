package library.Solution_OCP_1;
import library.Solution_SRP_1.Book;

import java.util.ArrayList;

public interface IDGenerationSt{
    int generateId(ArrayList<Book> booksList);
}


class SequentialIdStrategy implements IDGenerationSt {
    public int generateId(ArrayList<Book> booksList) {
        if (booksList.isEmpty()) {
            return 1;
        }
        Book lastBook = booksList.get(booksList.size() - 1);
        return lastBook.getBook_id() + 1;
    }
}
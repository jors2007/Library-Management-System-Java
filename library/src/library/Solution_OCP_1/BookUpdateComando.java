package library.Solution_OCP_1;
import library.Solution_SRP_1.Book;

public interface BookUpdateComando {
    void update(Book book, String newInfo, int newQuantity);
}

class UpdateTitleCommand implements BookUpdateComando {
    public void update(Book book, String newInfo, int newQuantity) {
        book.setTitle(newInfo); 
    }
}

class UpdateAuthorCommand implements BookUpdateComando {
    public void update(Book book, String newInfo, int newQuantity) {
        book.setAuthor(newInfo);
    }
}


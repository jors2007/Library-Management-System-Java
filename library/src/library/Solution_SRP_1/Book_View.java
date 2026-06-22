package library.Solution_SRP_1;

public class Book_View {
    
    public void printBookInfo(Book_Inventory item) {
        Book book = item.getBook();
        
        System.out.println("Id: " + book.getBook_id());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Subject: " + book.getSubject());
        System.out.println("Available Copies: " + item.getQuantity());
    }
}

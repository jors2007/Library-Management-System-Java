package library.Solution_SRP_1;

public class Book_Inventory {
    private Book book;
    private int quantity;

    public Book_Inventory(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    //Los metodos no rompen el principio de Single Responsability

    public Book getBook() { 
        return book; 
    }
    
    public int getQuantity() { 
        return quantity; 
    }

    
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public boolean decreaseQuantity(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
            return true;
        }
        return false; 
    }

    public boolean ChekcAvailability() {
        return this.quantity > 0;
    }
}


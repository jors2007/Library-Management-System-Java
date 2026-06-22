package library.Solution_SRP_1;
public class Book {
    private int book_id; 
    private String title;
    private String author;
    private String subject;


    public Book(int book_id, String title, String author, String subject) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    //getters y setts basicos, que no rompan el principo de SRP

    public int getBook_id() { 
        return book_id; 
    }
    
    public String getTitle() { 
        return title; 
    }
    
    public String getAuthor() { 
        return author; 
    }
    
    public String getSubject() { 
        return subject; 
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
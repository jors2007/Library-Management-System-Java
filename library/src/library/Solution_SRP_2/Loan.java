package library.Solution_SRP_2;

import java.util.Date;

public class Loan {
    
    private int loan_id;
    private int book_id;
    private int borrower_id;
    private Date issue_date;
    private Date return_date;
    private String returned_status;
    private String fine_status;

    public Loan(int loan_id, int book_id, int borrower_id, Date issue_date, Date return_date) {
        this.loan_id = loan_id;
        this.book_id = book_id;
        this.borrower_id = borrower_id;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.returned_status = "Issued";
        this.fine_status = "None";
    }

    //Getters
    public int getLoan_id() { 
        return loan_id; 
    }
    public int getBook_id() { 
        return book_id;
    }
    public int getBorrower_id() { 
        return borrower_id; 
    }
    public Date getIssue_date() { 
        return issue_date; 
    }
    public Date getReturn_date() { 
        return return_date; 
    }
    public String getReturned_status() { 
        return returned_status; 
    }
    public String getFine_status() { 
        return fine_status; 
    }

    // SETTERS 
    public void SetReturnedDate(Date return_date) { 
        this.return_date = return_date; 
    }
    public void SetReturnStatus(String returned_status) { 
        this.returned_status = returned_status; 
    }
    public void SetFineStatus(String fine_status) { 
        this.fine_status = fine_status; 
    }
    public void SetaBook(int book_id) { 
        this.book_id = book_id; 
    }
    public void SetaBorrower(int borrower_id) { 
        this.borrower_id = borrower_id; 
    }
}
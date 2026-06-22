package library.Solution_SRP_2;

import library.Solution_SRP_3.dbConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Loan_BD {
    private Connection connection;

    //coneccion 
    public Loan_BD(dbConnectivity db) {
        this.connection = db.getConnection();
    }

    
    public void AddNewLoan(Loan loan) {
        try {
            String query = "INSERT INTO Loan (loan_id, book_id, borrower_id, issue_date, return_date, returned_status, fine_status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, loan.getLoan_id());
            pstmt.setInt(2, loan.getBook_id());
            pstmt.setInt(3, loan.getBorrower_id());
            pstmt.setDate(4, new java.sql.Date(loan.getIssue_date().getTime()));
            pstmt.setDate(5, new java.sql.Date(loan.getReturn_date().getTime()));
            pstmt.setString(6, loan.getReturned_status());
            pstmt.setString(7, loan.getFine_status());
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error insertando préstamo: " + e.getMessage());
        }
    }

    public void updateLoanInfo(Loan loan) {
        try {
            String query = "UPDATE Loan SET book_id = ?, borrower_id = ?, return_date = ?, returned_status = ?, fine_status = ? WHERE loan_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, loan.getBook_id());
            pstmt.setInt(2, loan.getBorrower_id());
            pstmt.setDate(3, new java.sql.Date(loan.getReturn_date().getTime()));
            pstmt.setString(4, loan.getReturned_status());
            pstmt.setString(5, loan.getFine_status());
            pstmt.setInt(6, loan.getLoan_id());
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizando préstamo: " + e.getMessage());
        }
    }

    //La parte de Logica SQL, en realidad iria todo el codigo, pero como solo queremos que cumpla el principio de SOLID, lo dejo asi.

    public int GetLoanedBookId() { return 0; /* Lógica SQL */ }
    public String GetLoanFineStatus() { return ""; /* Lógica SQL */ }
    public void GetReturnDate() { /* Lógica SQL */ }
    public void GetIssueDate() { /* Lógica SQL */ }
    public void GetDueDate() { /* Lógica SQL */ }
    
    public void SetLoanReturnedDate() { /* Lógica SQL */ }
    public void SetLoanedBook() { /* Lógica SQL */ }
    public void SetLoaneeObject() { /* Lógica SQL */ }
    public void SetReturnStatus() { /* Lógica SQL */ }
    public void SetLoanFineStatus() { /* Lógica SQL */ }
    public void SetLoan() { /* Lógica SQL */ }
}
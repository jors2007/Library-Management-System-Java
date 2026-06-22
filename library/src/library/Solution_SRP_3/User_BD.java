package library.Solution_SRP_3;

import library.Solution_SRP_2.Loan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class User_BD {
    private Connection connection;

    public User_BD(dbConnectivity db) {
        this.connection = db.getConnection();
    }

    

    
    public ArrayList<Loan> LoadLoanListofSpecificUser(int borrower_id) {
        ArrayList<Loan> userLoans = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM Loan WHERE borrower_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, borrower_id);
            
            ResultSet rs = pstmt.executeQuery();
            
            
            while (rs.next()) {
                int loan_id = rs.getInt("loan_id");
                int book_id = rs.getInt("book_id");
                Date issue_date = rs.getDate("issue_date");
                Date return_date = rs.getDate("return_date");
                
                Loan loan = new Loan(loan_id, book_id, borrower_id, issue_date, return_date);
                loan.SetReturnStatus(rs.getString("returned_status"));
                loan.SetFineStatus(rs.getString("fine_status"));
                
                userLoans.add(loan);
            }
        } catch (Exception e) {
            System.out.println("Error cargando los préstamos del usuario: " + e.getMessage());
        }
        
        return userLoans;
    }
    
    public boolean CheckUserId(int user_id) {
        boolean exists = false;
        
        try {
            String query = "SELECT 1 FROM Users WHERE user_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, user_id);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                exists = true;
            }
        } catch (Exception e) {
            System.out.println("Error verificando el ID del usuario: " + e.getMessage());
        }
        
        return exists;
    }
}

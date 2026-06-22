package library.Solution_SRP_1;

import library.Solution_SRP_3.dbConnectivity;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Book_BD {
    private Connection connection;

    public Book_BD(dbConnectivity db) {
        this.connection = db.getConnection();
    }


    public void updateBookInfo(Book book) {
        try {
            String query = "UPDATE Books SET title = ?, author = ?, subject = ? WHERE book_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getSubject());
            pstmt.setInt(4, book.getBook_id());
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizando información del libro: " + e.getMessage());
        }
    }

    public void updateInventory(Book_Inventory item) {
        try {
            String query = "UPDATE Books SET quantity = ? WHERE book_id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, item.getQuantity());
            pstmt.setInt(2, item.getBook().getBook_id());
            
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error actualizando inventario: " + e.getMessage());
        }
    }

    // Ya se aplico el concepto de SRP, no necesitamos terminar el proyecto, logramos el objetivo

    public void AddNewBook() { 
        // TODO el cod
    }
    
    public void DeleteABook() { 
        // TTODO el cod
    }
    
    public void SearchBookbyTitle() { 
        // TODO el cod
    }
    
    public void SearchBookbyAuthor() { 
        // TODO el cod
    }
    
    public void SearchBookbySubject() { 
        // TODO el cod
    }
    
    public boolean CheckIsBookLoaned() { 
        // TODO el cod
        return false; 
    }
}
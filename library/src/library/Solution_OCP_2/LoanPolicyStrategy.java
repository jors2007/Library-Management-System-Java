package library.Solution_OCP_2;

import library.Solution_SRP_1.Book; 
import library.Users;

public interface LoanPolicyStrategy {
    boolean canCheckOut(Users borrower, Book book); 
    double calculateFineOnCheckIn(int loanId, java.util.Date returnDate);
}
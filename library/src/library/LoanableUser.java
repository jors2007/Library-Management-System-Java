package library;

import java.util.ArrayList;

/**
 * Interface for users that can participate in loans and fines (borrowers).
 * Separates loan/fine behaviour from the generic Users type to satisfy LSP.
 */
public interface LoanableUser {

    boolean GetFineStatus();

    double GetFineAmout();

    void SetFineAmount(double fine);

    boolean SetFineStatus(boolean status);

    boolean AddLoanInfo(Loan loan);

    void UpdateLoanInfo(Loan update, int book_id);

    String ViewInformation();

}

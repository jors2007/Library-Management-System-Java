package library.Solution_OCP_3;

import java.util.ArrayList;

public interface IBorrowe {
    boolean GetFineStatus(int borrower_id);
    double GetFineAmount(int borrower_id);
    void SetFineStatus(int borrower_id, boolean status);
    void SetFineAmount(int borrower_id, double amount);
    void SetTelephone(int borrower_id, String telephone);
    void SetAddress(int borrower_id, String address);
    void SetName(int borrower_id, String name);
    void SetGender(int borrower_id, char gender);
    ArrayList<Object> AllLoansOfUser(int borrower_id); 
}
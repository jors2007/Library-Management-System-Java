package library.Solution_OCP_3;

import library.Users;
import java.util.ArrayList;

public class Borrower extends Users {
    private String telephone;
    private String address;
    private IBorrowe repository;

    public Borrower(int user_id, String user_name, char gender, IBorrowe repository) {
        super(user_id, user_name, gender);
        this.repository = repository;
    }

    public boolean GetFineStatus() {
        return repository.GetFineStatus(this.GetId());
    }

    public double GetFineAmount() {
        return repository.GetFineAmount(this.GetId());
    }

    public void SetTelephone(String telephone) {
        this.telephone = telephone;
        repository.SetTelephone(this.GetId(), telephone);
    }

    public void SetAddress(String address) {
        this.address = address;
        repository.SetAddress(this.GetId(), address);
    }
    
    public void SetName(String name) {
        this.SetName(name);
        repository.SetName(this.GetId(), name);
    }

    public ArrayList<Object> AllLoansOfUser() {
        return repository.AllLoansOfUser(this.GetId());
    }
    
    @Override
    public String ViewInformation() {
        return "Borrower ID: " + this.GetId() + ", Name: " + this.GetName() + 
               ", Fine Status: " + (repository.GetFineStatus(this.GetId()) ? "Fined" : "Clear");
    }
}
package library.Solution_OCP_2;

import library.Solution_SRP_1.Book;
import library.Users;

public class Staff extends Users {

    public Staff(int user_id, String user_name, char gender) {
        super(user_id, user_name, gender);
    }

    public void UpdatePersonalInformation(PersonalInfoUpdateSt updateStrategy, String newValue) {
        updateStrategy.update(this, newValue);
    }

    public boolean RenewItem(int itemId, Users borrower, RenewStrategy renewStrategy) {
        return renewStrategy.renewItem(itemId, borrower);
    }

    public void PayFine(Users borrower, double amount, FinePaymentStrategy paymentStrategy) {
        boolean success = paymentStrategy.processPayment(borrower, amount);
        if (success) {
            System.out.println("Pago procesado exitosamente mediante la estrategia seleccionada.");
        }
    }

    public boolean CheckOutItem(Book book, Users borrower, LoanPolicyStrategy loanPolicy) {
        if (loanPolicy.canCheckOut(borrower, book)) {
            System.out.println("Préstamo aprobado según la política actual.");
            return true;
        }
        System.out.println("Préstamo rechazado por las políticas vigentes.");
        return false;
    }

    public boolean CheckInItem(int loanId, java.util.Date returnDate, LoanPolicyStrategy loanPolicy) {
        double fine = loanPolicy.calculateFineOnCheckIn(loanId, returnDate);
        
        if (fine > 0) {
            System.out.println("El usuario tiene una multa de: $" + fine);
        }
        
        return true;
    }

    @Override
     public String ViewInformation() {
        return "Staff ID: " + this.GetId() + ", Name: " + this.GetName(); 
    }    

    
}

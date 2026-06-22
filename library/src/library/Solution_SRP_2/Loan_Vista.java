package library.Solution_SRP_2;

import java.util.Scanner;
import java.util.Date;

public class Loan_Vista {
    private Scanner scanner;

    public Loan_Vista() {
        this.scanner = new Scanner(System.in);
    }

    
    public Loan GetLoan() {
        System.out.println("--- Registrar Nuevo Préstamo ---");
        
        System.out.print("Ingrese ID del Préstamo: ");
        int loan_id = scanner.nextInt();
        
        System.out.print("Ingrese ID del Libro: ");
        int book_id = scanner.nextInt();
        
        System.out.print("Ingrese ID del Prestatario: ");
        int borrower_id = scanner.nextInt();
        
        Date issue_date = new Date(); 
        long sevenDays = 7L * 24 * 60 * 60 * 1000;
        Date return_date = new Date(issue_date.getTime() + sevenDays); 

        return new Loan(loan_id, book_id, borrower_id, issue_date, return_date);
    }


    public void PrintLoanInfo(Loan loan) {
        System.out.println("\n--- Resumen del Préstamo ---");
        System.out.println("ID Préstamo: " + loan.getLoan_id());
        System.out.println("ID Libro: " + loan.getBook_id());
        System.out.println("ID Prestatario: " + loan.getBorrower_id());
        System.out.println("Fecha de Emisión: " + loan.getIssue_date());
        System.out.println("Fecha Límite: " + loan.getReturn_date());
        System.out.println("Estado: " + loan.getReturned_status());
        System.out.println("Multas: " + loan.getFine_status());
        System.out.println("----------------------------");
    }
}
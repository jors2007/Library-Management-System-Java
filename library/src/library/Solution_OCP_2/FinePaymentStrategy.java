package library.Solution_OCP_2;

import library.Users;

public interface FinePaymentStrategy {
    boolean processPayment(Users borrower, double amount);
}
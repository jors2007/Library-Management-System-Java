package library.Solution_OCP_2;

import library.Users;
public interface RenewStrategy {
    boolean renewItem(int itemId, Users borrower);
}
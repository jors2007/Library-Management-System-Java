package library.Solution_SRP_2;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FineCalculator {
    private static final double DAILY_FINE_RATE = 2.50; 

    public double CalculateFine(Loan loan, Date actual_return_date) {
        if (actual_return_date.after(loan.getReturn_date())) {
            long diffInMillies = Math.abs(actual_return_date.getTime() - loan.getReturn_date().getTime());
            long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            
            return diffInDays * DAILY_FINE_RATE;
        }
        return 0.0; 
    }
}
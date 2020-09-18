/*
 */
package universityParkingSystem;

import java.util.ArrayList;
import java.time.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 14, 2020
 */

/**
 * This class builds a Transaction Manager object with an ArrayList.
 * It contains a getter methods for the ArrayList.
 * It also contains methods to park (add a parking transaction),
 * compute all parking charges for one customer or one permit
 * and add a Transaction object to the ArrayList.
 */

public class TransactionManager {
    private ArrayList<ParkingTransaction> transactions;
    
    public TransactionManager() {
        transactions = new ArrayList<ParkingTransaction>();
    }
    
    public ParkingTransaction park(LocalDate date, ParkingPermit parkingPermit, ParkingLot parkingLot) {
        ParkingTransaction newTransaction = new ParkingTransaction(date, parkingPermit, parkingLot);
        addTransaction(newTransaction);
        return newTransaction;
    }
    
    public Money getParkingCharges(ParkingPermit parkingPermit) {
        Money totalCharge = null;
        double runningTotal = 0;
        String permitId = parkingPermit.getId();
        // ArrayList<ParkingTransaction> permitTransactions = transactions.get(permitId);
        for (ParkingTransaction trans : transactions) {
            if (trans.getPermit().getId().equals(permitId)) {
                //return trans;
                runningTotal += trans.getChargedAmount().getAmount();
            }
        } // Close for loop
        
        totalCharge = new Money(runningTotal, "$");
        return totalCharge;
    }
    
    public Money getParkingCharges(Customer customer) {
        Money totalCharge = null;
        double runningTotal = 0;
        String customerId = customer.getId();
        // ArrayList<ParkingTransaction> permitTransactions = transactions.get(permitId);
        for (ParkingTransaction trans : transactions) {
            if (trans.getPermit().getCar().getOwner().getId().equals(customerId)) {
                //return trans;
                runningTotal += trans.getChargedAmount().getAmount();
            }
        } // Close for loop
        
        totalCharge = new Money(runningTotal, "$");
        return totalCharge;
    }
    
    public void addTransaction(ParkingTransaction newParkingTransaction) {
        transactions.add(newParkingTransaction);
        System.out.println("The parking transaction on " + newParkingTransaction.getTransactionDate() + 
                " has been added to the list.");
    }
    
    public ArrayList<ParkingTransaction> getTransactionList() {
        return transactions;
    }
}

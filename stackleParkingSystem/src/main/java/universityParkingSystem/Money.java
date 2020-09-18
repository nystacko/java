/*
 */
package universityParkingSystem;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
/**
 * This immutable class builds a Money object out of a double and a string.
 * It contains getter methods for each attribute.
 * It also contains a getter method that returns a string concatenating the currency type and
 * the amount with two decimal places,
 */
public final class Money {
    private final double amount;
    private final String currency;
    
    public Money (double amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public String getCurrency() {
        return currency;
    }
    
    public String getMoneyString() {
        // Use the string formatter to show 2 decimal places.
        String strDouble = String.format("%.2f", amount);
        return currency + strDouble;
    }
}

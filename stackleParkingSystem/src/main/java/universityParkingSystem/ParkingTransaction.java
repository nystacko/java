/*
 */
package universityParkingSystem;
import java.time.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */

/**
 * This immutable class builds a Parking Transaction object out of a LocalDate,
 * a Parking Permit object, a Parking Lot object, and a Money object.
 * It contains getter methods for each attribute.
 * It also contains a getter method that returns the parking fee charged.
 */
public final class ParkingTransaction {
    private final LocalDate date;
    private final ParkingPermit permit;
    private final ParkingLot parkingLot;
    private final Money chargedAmount;
    
    public ParkingTransaction (LocalDate date, ParkingPermit permit, ParkingLot parkingLot) {
        // this.date = LocalDate.now();
        this.date = date;
        this.permit = permit;
        this.parkingLot = parkingLot;
        this.chargedAmount = getChargedAmount();
    }    
    
    // Compute the parking rate based on the parking lot and the type of car.
    public Money getChargedAmount() {
        Money amount = parkingLot.getDailyRate(permit.getCar().getType());
        return amount;
    }
    
    public ParkingPermit getPermit() {
        return permit;
    }
    
    public LocalDate getTransactionDate() {
        return date;
    }
    
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
    
    
} // Close ParkingTransaction

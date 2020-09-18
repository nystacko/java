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
 * This immutable class builds a Car object out of an enum, a string, and a Customer object.
 * It contains getter methods for each attribute.
 */
public final class Car {
    private final CarType type;
    private final String licensePlate;
    private final Customer owner;
    
    public Car (CarType type, String licensePlate, Customer owner) {
        this.type = type;
        this.licensePlate = licensePlate;
        this.owner = owner;
    } // Close constructor
    
    public CarType getType() {
        return type;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public Customer getOwner() {
        return owner;
    }

}// Close Car

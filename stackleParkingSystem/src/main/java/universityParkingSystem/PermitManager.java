/*
 */
package universityParkingSystem;

import java.util.ArrayList;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */

/**
 * This class builds a Permit Manager object with an ArrayList.
 * It contains a getter methods for the ArrayList.
 * It also contains methods to register a car
 * and add a Parking Permit object to the ArrayList.
 */

public class PermitManager {
    private ArrayList<ParkingPermit> permits;
    
    public PermitManager () {
        permits = new ArrayList<ParkingPermit>();
    }
    
    public ArrayList<ParkingPermit> getParkingPermitList() {
        return permits;
    }
    
    public ParkingPermit register(Car car) {
        ParkingPermit newPermit = new ParkingPermit(car);
        return newPermit;
    }
    
    public void addPermit(ParkingPermit newPermit) {
        permits.add(newPermit);
        System.out.println("Permit " + newPermit.getId() + " has been added to the list.");
    }
    
    
    
}

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
 * This immutable class builds a Parking Permit object out of a string, a Car object, 
 * and a LocalDate object.
 * It contains getter methods for each attribute.
 */
public final class ParkingPermit {
    private static int idCounter = 0;
    private final String id;
    private final Car car;
    private LocalDate expiration;
    
    public ParkingPermit(Car car) {
        this.id = new Id().getId();
        this.car = car;
        this.expiration = getExpiration();
    }

    // This class creates an ID that is a string that starts with 'P'
    // followed by an auto-incrementing integer.
    public class Id {
        private int idNum;
        private String idString;

        public Id() {
            setId(++idCounter);
        }
        public void setId(int idNum) {
           this.idNum = idNum;
        }
        public String getId() {
            idString = "P" + idNum;
            return idString;
        }
    }
    
    public String getId() {
            return id;
        }
    
    public Car getCar() {
        return car;
    }
    
    // This method creates a LocalDate object that is August 31 of the end of the parking year.
    public LocalDate getExpiration() {
        int thisYear = Year.now().getValue();
        LocalDate currentDate = LocalDate.now();
        LocalDate endPermitDate = LocalDate.parse(thisYear + "-08-31");
        // Set the permit expiration date to the end of the parking year, August 31.
        // If the current date is after August 31, change the expiration year to the following
        // calendar year.
        boolean isBefore = currentDate.isBefore(endPermitDate);
        if (isBefore) {
            expiration = endPermitDate;
        } else {
            expiration = LocalDate.parse( (thisYear + 1) + "-08-31");
        }
        // Return the expiration date.
        return expiration;
    }
    
} // Close ParkingPermit

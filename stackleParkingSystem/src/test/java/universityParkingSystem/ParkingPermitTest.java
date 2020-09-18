/*
 */
package universityParkingSystem;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
public class ParkingPermitTest {
    
    public ParkingPermitTest() {
    }

    /**
     * Test of getExpiration method, of class ParkingPermit.
     */
    @Test
    public void testGetExpiration() {
        System.out.println("Test getExpiration method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddress);
        CarType suvCarType = CarType.SUV;
        Car testCar = new Car(suvCarType, "ABC1234", testCustomer);
        ParkingPermit testPermit = new ParkingPermit(testCar);
        LocalDate expResult = LocalDate.parse("2020-08-31");
        LocalDate result = testPermit.getExpiration();
        assertEquals(expResult, result);
    }
    
}

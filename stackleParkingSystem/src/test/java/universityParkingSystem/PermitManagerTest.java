/*
 */
package universityParkingSystem;
import java.time.*;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
public class PermitManagerTest {
    
    public PermitManagerTest() {
    }

    /**
     * Test of register method, of class PermitManager.
     */
    @Test
    public void testRegister() {
        System.out.println("Test register method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddress);
        CarType suvCarType = CarType.SUV;
        Car testCar = new Car(suvCarType, "ABC1234", testCustomer);
        ParkingPermit testPermit = new ParkingPermit(testCar);
        LocalDate expResult = testPermit.getExpiration();
        LocalDate result = new ParkingPermit(testCar).getExpiration();
        assertEquals(expResult, result);
    }
    
    
}

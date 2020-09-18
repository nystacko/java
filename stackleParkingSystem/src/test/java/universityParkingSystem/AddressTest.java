/*
 * 
 */
package universityParkingSystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * WEEK 6 Assignment: Add Parking Lot and Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated July 24, 2020
 */
public class AddressTest {
    
    public AddressTest() {
    }
    
    /**
     * Test of getAddressInfo method, of class Address.
     */
    @Test
    public void testGetAddressInfo() {
        System.out.println("Test getAddressInfo method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        String expResult = "address 1 address 2 city state zip";
        String result = testAddress.getAddressInfo();
        assertEquals(expResult, result);
    }
    
}

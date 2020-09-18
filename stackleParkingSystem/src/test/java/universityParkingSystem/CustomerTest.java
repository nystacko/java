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
public class CustomerTest {
    
    public CustomerTest() {
    }

    /**
     * Test of getCustomerName method, of class Customer.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("Test getCustomerName method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddress);
        String expResult = "First Last";
        String result = testCustomer.getCustomerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomerInfo method, of class Customer.
     */
    @Test
    public void testGetCustomerInfo() {
        System.out.println("Test getCustomerInfo method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddress);
        String expResult = "ID First Last Phone address 1 address 2 city state zip";
        String result = testCustomer.getCustomerInfo(testAddress);
        assertEquals(expResult, result);
    }
}

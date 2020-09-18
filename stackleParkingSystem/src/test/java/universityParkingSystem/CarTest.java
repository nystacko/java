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
public class CarTest {
    
    public CarTest() {
    }
    
    /**
     * Test of getAddressInfo method, of class Address.
     */
    @Test
    public void testGetLicensePlate() {
        System.out.println("Test getLicensePlate method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddress);
        CarType suvCarType = CarType.SUV;
        Car testCar = new Car(suvCarType, "ABC1234", testCustomer);
        String expResult = "ABC1234";
        String result = testCar.getLicensePlate();
        assertEquals(expResult, result);
    }
    
    /*
    public String getLicensePlate() {
        return licensePlate;
    }
    */
    
}

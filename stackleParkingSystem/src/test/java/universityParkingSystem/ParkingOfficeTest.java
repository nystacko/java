/*
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
public class ParkingOfficeTest {
    
    public ParkingOfficeTest() {
    }

    /*n("Test getAddressInfo method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        String expResult = "address 1 address 2 city state zip";
        String result = testAddress.getAddressInfo();
        assertEquals(expResult, result);
    }*/

    @Test
    public void testGetParkingOfficeName() {
        System.out.println("Test getParkingOfficeName method");
        Address testParkingOfficeAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingOffice testParkingOffice = new ParkingOffice("Test Parking Office", 
                testParkingOfficeAddress);
        String expResult = "Test Parking Office";
        String result = testParkingOffice.getParkingOfficeName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParkingOfficeAddress method, of class ParkingOffice.
     */
    @Test
    public void testGetParkingOfficeAddress() {
        System.out.println("Test getParkingOfficeAddress method");
        Address testParkingOfficeAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingOffice testParkingOffice = new ParkingOffice("Test Parking Office", 
                testParkingOfficeAddress);
        Address expResult = testParkingOfficeAddress;
        Address result = testParkingOffice.getParkingOfficeAddress();
        assertEquals(expResult, result);
    }

}
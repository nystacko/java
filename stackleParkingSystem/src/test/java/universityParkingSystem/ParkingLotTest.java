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
public class ParkingLotTest {
    
    public ParkingLotTest() {
    }
    /**
     * Test of getId method, of class ParkingLot.
     */
    @Test
    public void testGetId() {
        System.out.println("Test getId method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 1);
        String expResult = "T";
        String result = testParkingLot.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParkingLotName method, of class ParkingLot.
     */
    @Test
    public void testGetParkingLotName() {
        System.out.println("Test getParkingLotName method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 1);
        String expResult = "Test";
        String result = testParkingLot.getParkingLotName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParkingLotAddress method, of class ParkingLot.
     */
    @Test
    public void testGetParkingLotAddress() {
        System.out.println("Test getParkingLotAddress method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 1);
        Address expResult = testAddress;
        Address result = testParkingLot.getParkingLotAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDailyRate method, of class ParkingLot.
     */
    @Test
    public void testGetDailyRate() {
        System.out.println("Test getDailyRate method");
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 10);
        double expResult = 10.0;
        double result = testParkingLot.getDailyRate(CarType.SUV).getAmount();
        // assertEquals(expResult, result, 8.0);
        assertEquals(expResult, result, 1.0);
    }
}

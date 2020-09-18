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
public class ParkingTransactionTest {
    
    public ParkingTransactionTest() {
    }

    /**
     * Test of getChargedAmount method, of class ParkingTransaction.
     */
    @Test
    public void testGetChargedAmount() {
        System.out.println("Test getChargedAmount method");
        // ParkingTransaction instance = null;
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 1);
        Address testAddressC = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddressC);
        CarType suvCarType = CarType.SUV;
        Car testCar = new Car(suvCarType, "ABC1234", testCustomer);
        ParkingPermit testPermit = new ParkingPermit(testCar);
        double expResult = new Money(1, "$").getAmount();
        double result = testParkingLot.getDailyRate(testPermit.getCar().getType()).getAmount();
        // System.out.println(testParkingLot.getDailyRate(testPermit.getCar().getType()).getAmount());
        assertEquals(expResult, result, 0.1);
    }
    
}

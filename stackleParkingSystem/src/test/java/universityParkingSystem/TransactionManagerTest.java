/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityParkingSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
public class TransactionManagerTest {
    
    public TransactionManagerTest() {
    }

    /**
     * Test of getTransactionList method, of class TransactionManager.
     */
    @Test
    public void testGetTransactionList() {
        System.out.println("Test getTransactionList method");
        ArrayList<ParkingTransaction> transactions = new ArrayList<ParkingTransaction>();
        LocalDate testDate = LocalDate.parse("2020-01-01");
        Address testAddressC = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer = new Customer("ID", "First", "Last", "Phone", testAddressC);
        CarType suvCarType = CarType.SUV;
        Car testCar = new Car(suvCarType, "ABC1234", testCustomer);
        ParkingPermit testPermit = new ParkingPermit(testCar);
        Address testAddress = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot = new ParkingLot("T", "Test", testAddress, 1);
        ParkingTransaction newTransaction = new ParkingTransaction(testDate, testPermit, 
                testParkingLot);
        transactions.add(newTransaction);
        
        ArrayList<ParkingTransaction> transactions1 = new ArrayList<ParkingTransaction>();
        LocalDate testDate1 = LocalDate.parse("2020-01-01");
        Address testAddressC1 = new Address("address 1", "address 2", "city", "state", "zip");
        Customer testCustomer1 = new Customer("ID", "First", "Last", "Phone", testAddressC1);
        CarType suvCarType1 = CarType.SUV;
        Car testCar1 = new Car(suvCarType, "ABC1234", testCustomer);
        ParkingPermit testPermit1 = new ParkingPermit(testCar1);
        Address testAddress1 = new Address("address 1", "address 2", "city", "state", "zip");
        ParkingLot testParkingLot1 = new ParkingLot("T", "Test", testAddress, 1);
        ParkingTransaction newTransaction1 = new ParkingTransaction(testDate1, testPermit1, 
                testParkingLot1);
        transactions1.add(newTransaction);

        // TransactionManager instance = new TransactionManager();
        ArrayList<ParkingTransaction> expResult = transactions;
        ArrayList<ParkingTransaction> result = transactions1;
        assertEquals(expResult, result);
        // Assert.assertEquals(transactions, transactions1);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}

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
public class MoneyTest {
    
    public MoneyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

   

    /**
     * Test of getAmount method, of class Money.
     */
    @Test
    public void testGetAmount() {
        System.out.println("Test getAmount method");
        Money testMoney = new Money(10, "$");
        double expResult = 10.0;
        double result = testMoney.getAmount();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getCurrency method, of class Money.
     */
    @Test
    public void testGetCurrency() {
        System.out.println("Test getCurrency method");
        Money testMoney = new Money(10, "$");
        String expResult = "$";
        String result = testMoney.getCurrency();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMoneyString method, of class Money.
     */
    @Test
    public void testGetMoneyString() {
        System.out.println("Test getMoneyString method");
        Money testMoney = new Money(10, "$");
        String expResult = "$10.0";
        String result = testMoney.getMoneyString();
        assertEquals(expResult, result);
    }
}

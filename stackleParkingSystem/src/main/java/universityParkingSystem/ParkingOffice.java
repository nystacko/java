/*
 */
package universityParkingSystem;
import java.util.*;  

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
/**
 * This class builds a ParkingOffice object out of 2 strings and 2 ArrayLists.
 * It contains getter methods for each attribute.
 * It also contains methods to register a customer
 * and add Customer and ParkingLot objects to their respective ArrayLists.
 */
public class ParkingOffice {
   
    private String parkingOfficeName;
    private Address parkingOfficeAddress;
    private ArrayList<Customer> listOfCustomers;
    private ArrayList<ParkingLot> listOfParkingLots;
    
    public ParkingOffice(String parkingOfficeName, Address parkingOfficeAddress) {
        this.parkingOfficeName = parkingOfficeName;
        this.parkingOfficeAddress = parkingOfficeAddress;
        listOfCustomers = new ArrayList<Customer>();
        listOfParkingLots = new ArrayList<ParkingLot>(); 
    }

    public String getParkingOfficeName() {
        return parkingOfficeName;
    }
    public Address getParkingOfficeAddress() {
        return parkingOfficeAddress;
    }
    public ArrayList<Customer> getCustomerList() {
        return listOfCustomers;
    }
    public ArrayList<ParkingLot> getParkingLotList() {
        return listOfParkingLots;
    }
    public void register(Customer customer) {
        listOfCustomers.add(customer);
        System.out.println("Customer " + customer.getCustomerName() + " has been registered.");
    }

    public void addParkingLot(ParkingLot newParkingLot) {
        listOfParkingLots.add(newParkingLot);
        System.out.println("Parking Lot " + newParkingLot.getParkingLotName() + " has been added to"
                + " the list.");
    }
}

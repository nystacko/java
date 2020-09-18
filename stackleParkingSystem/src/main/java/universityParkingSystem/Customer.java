/*
 */
package universityParkingSystem;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
/**
 * This immutable class builds a Customer object out of 4 strings and an Address object.
 * It contains getter methods for the 4 strings.
 * It also contains getter methods that return a customer's full name and
 * a concatenated string of all the customer's contact information.
 */
public final class Customer {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final Address address;
  
    public Customer(String id, String firstName, String lastName, String phoneNumber, 
            Address address) 
    { 
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    } 
    public String getId(){ 
        return id;
    }
    public String getFirstName(){ 
        return firstName;
    }
    public String getLastName(){ 
        return lastName;
    }
    public String getPhoneNumber(){ 
        return phoneNumber;
    }
    // This method returns a concatenated string of the customer's full name.
    public String getCustomerName(){ 
        return firstName + " " + lastName;
    } 
    // This method returns the customer address object.
    public Address getCustomerAddress(){ 
        return address;
    }
    // This method returns a concatenated string of all customer attributes.
    public String getCustomerInfo(Address address){ 
        return id + " " + firstName + " " + lastName + " " + phoneNumber + " " + 
                address.getAddressInfo();
    } 
    
}
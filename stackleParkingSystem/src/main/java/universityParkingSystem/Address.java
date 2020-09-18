/*
 */
package universityParkingSystem;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 14, 2020
 */
/**
 * This immutable class builds an Address object out of 5 strings.
 * It contains getter methods for each attribute.
 * It also contains a getter method that returns all 5 strings concatenated.
 */
public final class Address {
    private final String streetAddress1;
    private final String streetAddress2;
    private final String city;
    private final String state;
    private final String zipcode;
  
    public Address(String streetAddress1, String streetAddress2, String city, String state, 
            String zipcode) 
    { 
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    } 
    public String getStreetAddress1(){ 
        return streetAddress1;
    }
    public String getStreetAddress2(){ 
        return streetAddress2;
    }
    public String getCity(){ 
        return city;
    }
    public String getState(){ 
        return state;
    }
    public String getZipcode(){ 
        return zipcode;
    }
    // This method returns a concatenated string of all 5 address attributes.
    public String getAddressInfo(){ 
        return streetAddress1 + " " + streetAddress2 + " " + city + " " + state + " " + zipcode;
    } 
}
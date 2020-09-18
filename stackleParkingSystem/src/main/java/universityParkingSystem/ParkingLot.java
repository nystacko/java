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
 * This immutable class builds a ParkingLot object out of 2 strings, a double, and an Address obj.
 * It contains getter methods for each attribute.
 * It also contains a method to return the daily parking rate, based on the type of car.
 */
public final class ParkingLot {
    private final String id;
    private final String name;
    private final Address parkingLotAddress;
    private final double lotDailyRate;
    
    public ParkingLot (String id, String name, Address parkingLotAddress, double lotDailyRate) {
        this.id = id;
        this.name = name;
        this.parkingLotAddress = parkingLotAddress;
        this.lotDailyRate = lotDailyRate;
    }
    public String getId() {
        return id;
    }
    public String getParkingLotName() {
        return name;
    }
    public Address getParkingLotAddress() {
        return parkingLotAddress;
    }
    public double getLotDailyRate() {
        return lotDailyRate;
    }
    
    public Money getDailyRate(CarType carType) {
        double dailyParkingRate = lotDailyRate;
        
        // The University provides a 20% discount to compact cars compared to SUV cars.
        if(checkCarType(carType)) {
            dailyParkingRate = dailyParkingRate * 0.8;
        }
        // Create a Money object that represents the daily parking rate and return it.
        Money dailyRate = new Money(dailyParkingRate, "$");
        return dailyRate;   
    }
    // Check whether the car is a compact.
    public boolean checkCarType(CarType carType) {
        if(carType == CarType.COMPACT) {
           return true;
        }
        return false;
        }
    
}

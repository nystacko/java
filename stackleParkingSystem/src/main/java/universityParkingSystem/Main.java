/* 
 */
package universityParkingSystem;
import java.time.*;

/**
 * WEEK 9 Assignment: Car, Parking Permit, Parking Transaction, Parking Office Classes
 * ICT-4305, Summer 2020, Dr. Ryan Rucker, PhD
 * @author Steve Stackle
 * Updated August 15, 2020
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("\nAdding Data...\n");
        
        // ==========  INSTANTIATE ALL OBJECTS  ==========
        // Create new car types using enum.
        CarType suvCarType = CarType.SUV;
        CarType compactCarType = CarType.COMPACT;
        
        // Create a new Permit Manager object.
        PermitManager newPermitManager = new PermitManager();
        
        // Create a new Transaction Manager object.
        TransactionManager newTransactionManager = new TransactionManager();
        
        // Create a new Parking Office object.
        Address newParkingOfficeAddress = new Address("2130 S. High St.","", "Denver", "CO", 
                "80208");
        ParkingOffice newParkingOffice = new ParkingOffice("DU Parking Office", 
                newParkingOfficeAddress);
        
        // Initialize Customer objects and their associated objects.
        
        // === Customer 1 ===
        Address customer1Address = new Address("123 Sesame Street", "Apt 1", "New York", "NY", 
                "10036");
        Customer customer1 = new Customer("007", "Steve", "Stackle", "867-5309", customer1Address);
        Car customer1Car1 = new Car(compactCarType, "ABC1234", customer1);
        Car customer1Car2 = new Car(suvCarType, "JEEP234", customer1);
        ParkingPermit permit1 = newPermitManager.register(customer1Car1);
        ParkingPermit permit4 = newPermitManager.register(customer1Car2);
        
        // === Customer 2 ===
        Address customer2Address = new Address("456 Main Street", "Apt 2", "Syracuse", "NY", 
                "13201");
        Customer customer2 = new Customer("008", "Fred", "Jones", "222-2200", customer2Address);
        Car customer2Car1 = new Car(suvCarType, "ZYX9876", customer2);
        Car customer2Car2 = new Car(suvCarType, "MEGA876", customer2);
        ParkingPermit permit2 = newPermitManager.register(customer2Car1);
        ParkingPermit permit5 = newPermitManager.register(customer2Car2);
        
        // === Customer 3 ===
        Address customer3Address = new Address("789 Cherry Street", "Apt 3", "Albany", "NY", 
                "12084");
        Customer customer3 = new Customer("009", "Bob", "Smith", "333-3300", customer3Address);
        Car customer3Car1 = new Car(suvCarType, "BOBSCAR", customer3);
        ParkingPermit permit3 = newPermitManager.register(customer3Car1);
        
        // Initialize Parking Lot objects and the associated objects.
        
        // === Parking Lot D ===
        Address parkingLotDAddress = new Address("2199 S University Blvd","", "Denver", "CO", 
                "80208");
        ParkingLot parkingLotD = new ParkingLot("D", "Lot D", parkingLotDAddress, 10);
        
        // === Parking Lot Q ===
        Address parkingLotQAddress = new Address("1901 E Asbury Ave","", "Denver", "CO", 
                "80208");
        ParkingLot parkingLotQ = new ParkingLot("Q", "Lot Q", parkingLotQAddress, 20);
        
        // === Parking Lot W ===
        Address parkingLotWAddress = new Address("1919 S University Blvd","", "Denver", "CO", 
                "80208");
        ParkingLot parkingLotW = new ParkingLot("W", "Lot W", parkingLotWAddress, 30);
        
        // ==========  ADD OBJECTS TO LISTS  ==========

        // Add the Parking Lot objects to the Array List in the Parking Office object just created.
        newParkingOffice.addParkingLot(parkingLotD);
        newParkingOffice.addParkingLot(parkingLotQ);
        newParkingOffice.addParkingLot(parkingLotW);
        
        // Register the new customers.
        newParkingOffice.register(customer1);
        newParkingOffice.register(customer2);
        newParkingOffice.register(customer3);
        
        // Register the new permits.
        newPermitManager.addPermit(permit1);
        newPermitManager.addPermit(permit2);
        newPermitManager.addPermit(permit3);
        newPermitManager.addPermit(permit4);
        newPermitManager.addPermit(permit5);
        
        // Create a bunch of transaction dates.
        LocalDate transaction1Date = LocalDate.parse("2020-01-15");
        LocalDate transaction2Date = LocalDate.parse("2020-01-21");
        LocalDate transaction3Date = LocalDate.parse("2020-02-04");
        LocalDate transaction4Date = LocalDate.parse("2020-02-06");
        LocalDate transaction5Date = LocalDate.parse("2020-03-26");
        LocalDate transaction6Date = LocalDate.parse("2020-04-20");
        LocalDate transaction7Date = LocalDate.parse("2020-05-07");
        LocalDate transaction8Date = LocalDate.parse("2020-06-11");
        LocalDate transaction9Date = LocalDate.parse("2020-07-13");
        LocalDate transaction10Date = LocalDate.parse("2020-08-01");
        
        // Create a bunch of transactions.
        ParkingTransaction transaction1 = newTransactionManager.park(transaction1Date, permit1, 
                parkingLotD);
        ParkingTransaction transaction2 = newTransactionManager.park(transaction2Date, permit2, 
                parkingLotQ);
        ParkingTransaction transaction3 = newTransactionManager.park(transaction3Date, permit3, 
                parkingLotW);
        ParkingTransaction transaction4 = newTransactionManager.park(transaction4Date, permit4, 
                parkingLotD);
        ParkingTransaction transaction5 = newTransactionManager.park(transaction5Date, permit5, 
                parkingLotQ);
        ParkingTransaction transaction6 = newTransactionManager.park(transaction6Date, permit1, 
                parkingLotW);
        ParkingTransaction transaction7 = newTransactionManager.park(transaction7Date, permit2, 
                parkingLotD);
        ParkingTransaction transaction8 = newTransactionManager.park(transaction8Date, permit3, 
                parkingLotQ);
        ParkingTransaction transaction9 = newTransactionManager.park(transaction9Date, permit4, 
                parkingLotW);
        ParkingTransaction transaction10 = newTransactionManager.park(transaction10Date, permit5, 
                parkingLotD);
        
        // ==========  PRINT DATA  ==========
        System.out.println("\n---- Parking office info ----");
        System.out.println("\nParking Office Name: " + newParkingOffice.getParkingOfficeName());
        System.out.println("Parking Office Address: " + newParkingOffice.getParkingOfficeAddress().
                getAddressInfo());
        
        System.out.println("\n---- Permitted car types are listed below ----");
        System.out.println("\nCar type 1: " + suvCarType);
        System.out.println("Car type 2: " + compactCarType);
        
        System.out.println("\n---- Info for all customers is listed below ----");
        for (Customer c : newParkingOffice.getCustomerList()){
            System.out.println("\nCustomer Name: " + c.getCustomerName() );
            System.out.println("Customer Address: " + c.getCustomerAddress().getAddressInfo() );
            System.out.println("All Customer Contact Info: " + 
                    c.getCustomerInfo(c.getCustomerAddress()) );
        }
        System.out.println("\n---- Info for all parking lots is listed below ----");
        for (ParkingLot p : newParkingOffice.getParkingLotList()){
            System.out.println("\nParking Lot ID: " + p.getId() );
            System.out.println("Parking Lot Name: " + p.getParkingLotName() );
            System.out.println("Parking Lot Address: " + p.getParkingLotAddress().getAddressInfo());
            System.out.println("SUV Daily Rate: " + p.getDailyRate(suvCarType).getMoneyString());
            System.out.println("Compact Car Daily Rate: " + p.getDailyRate(compactCarType).
                    getMoneyString());
        }
        System.out.println("\n---- Info for all parking permits is listed below ----");
        for (ParkingPermit pp : newPermitManager.getParkingPermitList()){
            System.out.println("\nPermit ID: " + pp.getId() );
            System.out.println("Customer: " + pp.getCar().getOwner().getCustomerName() );
            System.out.println("Car License Plate #: " + pp.getCar().getLicensePlate() );
            System.out.println("Permit Expires: " + pp.getExpiration() );
        }
        
        System.out.println("\n---- Info for all parking transactions is listed below ----");
        for (ParkingTransaction pt : newTransactionManager.getTransactionList()){
            System.out.println("\nDate: " + pt.getTransactionDate() );
            System.out.println("Permit ID: " + pt.getPermit().getId() );
            System.out.println("Parking Lot: " + pt.getParkingLot().getParkingLotName() );
            System.out.println("Car License Plate #: " + pt.getPermit().getCar().getLicensePlate() );
            System.out.println("Parking Fee Charged: " + pt.getChargedAmount().getMoneyString() );
        }
        
        System.out.println("\n--- Total Charges Per Customer ---");
        System.out.println("Customer " + customer1.getId() + " " + customer1.getCustomerName() +  
                " Charges: " +newTransactionManager.getParkingCharges(customer1).getMoneyString() );
        System.out.println("Customer " + customer2.getId() + " " + customer2.getCustomerName() +  
                " Charges: " +newTransactionManager.getParkingCharges(customer2).getMoneyString() );
        System.out.println("Customer " + customer3.getId() + " " + customer3.getCustomerName() +  
                " Charges: " +newTransactionManager.getParkingCharges(customer3).getMoneyString() );
        
        System.out.println("\n--- Total Charges Per Permit ---");
        System.out.println("Permit " + permit1.getId() + " Holder " + 
                permit1.getCar().getOwner().getCustomerName() + " Charges: " + 
                newTransactionManager.getParkingCharges(permit1).getMoneyString() );
        System.out.println("Permit " + permit2.getId() + " Holder " + 
                permit2.getCar().getOwner().getCustomerName() + " Charges: " + 
                newTransactionManager.getParkingCharges(permit2).getMoneyString() );
        System.out.println("Permit " + permit3.getId() + " Holder " + 
                permit3.getCar().getOwner().getCustomerName() + " Charges: " + 
                newTransactionManager.getParkingCharges(permit3).getMoneyString() );
        System.out.println("Permit " + permit4.getId() + " Holder " + 
                permit4.getCar().getOwner().getCustomerName() + " Charges: " + 
                newTransactionManager.getParkingCharges(permit4).getMoneyString() );
        System.out.println("Permit " + permit5.getId() + " Holder " + 
                permit5.getCar().getOwner().getCustomerName() + " Charges: " + 
                newTransactionManager.getParkingCharges(permit5).getMoneyString() );
        
        
    } // Close PSVM 

} // Close Main


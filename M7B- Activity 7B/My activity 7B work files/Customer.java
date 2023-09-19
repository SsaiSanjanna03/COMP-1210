 /**
* Program containing methods that sets the customer's location, changes the
* customer balance, gets the location and gets the balance.
* 
* Activity_7B.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/17/22
*/
public class Customer implements Comparable<Customer> {
/**
     * Creating instance variables.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables
   private String custName;
   private String custLocation;
   private double custBalance;
   
   /**
      * constructor takes name of the customer as parameter.
      * @param nameIn for customer name
      */
   // constructor
   public Customer(String nameIn) {
   // sets customer name to nameIn
      custName = nameIn;
   // sets customer location to empty string
      custLocation = "";
   // sets customer balance to 0
      custBalance = 0;
   }
   
    // methods
  /**
      * creating a method to set the location of customer.
      * @param locationIn for customer location
      */
   public void setLocation(String locationIn) {
      // sets customer's location to locationIn
      custLocation = locationIn;
   }
  
  /**
      * creating a method to change the customer's balance.
      * @param amount of customer's balance
      */
   public void changeBalance(double amount) {
      // adds amount to customer's balance
      custBalance += amount;
   }
   
  /**
      * creating a method to get the location of customer.
      * @return customer's location
      */
   public String getLocation() {
      return custLocation;
   }
  
  /**
      * creating a method to get the balance of customer.
      * @return customer's balance
      */
   public double getBalance() {
      return custBalance;
   }
   
   /**
      * creating a second setLocation method to
      * set the location of customer using two parameters.
      * @param city for customer's city
      * @param state for customer's state
      */
   public void setLocation(String city, String state) {
      // sets customer's location with city name and state name
      custLocation = city + ", " + state;
   }
   
   /**
      * creating a method to show the customer's name, their location 
      * and their balance.
      * @return output string
      */
   public String toString() {
      String output = custName + "\n" + getLocation() + "\n$" + getBalance();
      return output;
   }
   
   /**
      * creating a compareTo method to compare objects between two
      * compatible objects.
      * @param obj for any other object
      * @return 0 or -1 or 1 based on conditions mentioned
      */
   public int compareTo(Customer obj) {
      // if both are equal
      if (Math.abs(this.custBalance - obj.getBalance()) < 0.000001) {
         // returns the integer 0
         return 0;
      }
      // if one object is less than the other
      else if (this.custBalance < obj.getBalance()) {
         // returns the negative integer -1
         return -1;
      }
      // if one object is greater than the other
      else {
         // returns the positive integer 1
         return 1;
      }
   } 
}


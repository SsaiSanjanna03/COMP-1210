   /**
* Program that contains a class to represent an inventory item in a store
* using subclasses and an abstract class.
* It also contains an array that holds inventoryItem objects and a 
* main class to print all the information of items from the store.
*
* Activity_10.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/07/22
*/
public class InventoryItem { // Represents an inventory item in store
/**
     * Creating instance variables.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables using protected visibility modifier
   protected String name;
   protected double price;
   private static double taxRate = 0;
/**
      * constructor takes name of the item and price as parameters.
      * @param nameIn for item's name
      * @param priceIn for price of the item
      */
   // constructor
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn; // sets nameIn to name
      price = priceIn; // sets priceIn to price
   } 
 
 // Methods
 /**
      * creating a method to get name of the item.
      * @return item's name
      */
   public String getName() {
      return name;
   }
    /**
      * creating a method to calculate price of the item.
      * @return total cost
      */
   public double calculateCost() {
      double cost = price * (1 + taxRate);
      return cost; // price including tax
   }
   /**
      * creating a method to set tax rate.
      * @param taxRateIn for taxRate
      */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn; // sets taxRateIn to taxRate
   }
   /**
      * creating a method to represent name and price(tax included)
      * of the item.
      * @return name with total price
      */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}
   





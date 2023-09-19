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
public class ElectronicsItem extends InventoryItem {
// Class that holds information of shipping costs 
// for items taken from InventoryItem class

/**
     * Creating an instance variable and a constant variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variable using protected visibility modifier
   protected double weight;
/** constant varibale. */
   public static final double SHIPPING_COST = 1.5; // shipping cost per pound
   /**
      * constructor takes item's name, price and weight as parameters.
      * @param nameIn for item's name
      * @param priceIn for price of the item
      * @param weightIn for item's weight
      */
   // constructor
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn); // Invoking the constructor for InventoryItem
      weight = weightIn; // sets weightIn to weight
   }
   
   // Methods
     /**
      * creating a method to calculate price of the item.
      * @return total cost
      */
   public double calculateCost() { // Over-riding the calculateCost method
      // item's price + tax + shipping
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}

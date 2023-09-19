 /**
* Program that contains a class to represent an inventory item in a store
* using subclasses and an abstract class.
* It also contains a main class to print all the information of items
* from the store.
*
* Activity_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/31/22
*/
public abstract class OnlineTextItem extends InventoryItem {
// An abstract class to represent an online text item 
// such as electronic book or journal article

// Instantiation not requires-> abstract class
/**
      * constructor takes item's name and price as parameters.
      * @param nameIn for item's name
      * @param priceIn for price of the item
      */
   // constructor --> only calls the constructor of parent class
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn); // Invoking the constructor for InventoryItem
   }
      
      // Methods
      /**
      * creating a method to give out price of the item.
      * @return total cost
      */
   public double calculateCost() { //Over-riding the calculateCost method
      // No tax is charged for online items
      return price; // only item's price
   }
}


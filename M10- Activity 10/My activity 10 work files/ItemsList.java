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
public class ItemsList { // Class that holds an array of InventoryItem objects
   
   /**
     * Creating instance variables.
     * @param args Command line arguments (not used).
     */
   private InventoryItem[] inventory; // Array of InventoryItem objects
   private int count; // Number of items in the array
    
    /**
      * Constructor with no parameters.
      */
   // constructor
   public ItemsList() {
      // Instantiating the array with size '20'
      inventory = new InventoryItem[20]; 
   }
   
   // Methods
    /**
      * creating a method to add an item of type InventoryItem to array.
      * @param itemIn for item
      */
   public void addItem(InventoryItem itemIn) {
      // Assigning the new element to the element at position count
      inventory[count] = itemIn; 
      count++; // Incrementing count by one
   }
   
   /**
      * creating a method to calculate total price(Surcharge included)
      * of the item.
      * @param electronicsSurcharge for surcharges of electronic items
      * @return total cost
      */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) { // Iterating through array 'inventory'
         // Checking if the item in inventory is an ElectronicItem type
         if (inventory[i] instanceof ElectronicsItem) {
            // Adds electronic surcharge to total cost
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else { // if the item is not an ElectronicsItem type
            // Doesn't add the surcharges
            total += inventory[i].calculateCost(); 
         }
      }
      return total;
   }
   
   /**
      * creating a method to represent name and price(tax included)
      * of the item.
      * @return name with total price
      */
   public String toString() {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++) { // Iterating through 'inventory'
         output += inventory[i] + "\n";
      }
      return output;
   }
}
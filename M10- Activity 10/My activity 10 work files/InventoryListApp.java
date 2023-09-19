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
public class InventoryListApp {
   
   /**
     * Instantiates and adds items to the array 'inventory' and then
     * prints the array with the total cost.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args) {
      // Creating a class of type 'ItemsList'
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05); // sets tax rate to '0.05'
      // Adds item of type ElectronicsItem 
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      // Adds item of type InventoryItemItem
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      // Adds item of type OnlineBook
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      // Adds item of type OnlineArticle
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      // Prints items with prices from the array 'inventory' 
      System.out.println(myItems.toString());
      // Prints the total cost of all item in inventory
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}
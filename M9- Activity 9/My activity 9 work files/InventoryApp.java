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
public class InventoryApp {
/**
     * Instantiates and prints each of the objects from previous classes.
     * @param args Command line arguments (not used).
     */

   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05); // Sets tax rate to 0.05
      
      // Instantiating InventoryItem object with the name 'item1'
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      System.out.println(item1.toString()); // Prints out the object
      
      // Instantiating ElectronicsItem object with the name 'item2'
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      System.out.println(item2.toString()); // Prints out the object
      
      // Instantiating OnlineArticle object with the name 'item3'
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700); // Sets word count to 700
      System.out.println(item3.toString()); // Prints out the object
      
      // Instantiating OnlineBook object with the name 'item4'
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      System.out.println(item4.toString()); // Prints out the object
   }
}

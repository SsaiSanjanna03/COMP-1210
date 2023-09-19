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
public class OnlineArticle extends OnlineTextItem {
// Electronic text class that keeps tracks of word count 
// along with all the information from parent class and OnlineTextItem class

/**
     * Creating an instance variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variable
   private int wordCount;
   /**
      * constructor takes item's name and price as parameters.
      * @param nameIn for item's name
      * @param priceIn for price of the item
      */
   // constructor
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn); // Invoking the constructor for InventoryItem
      wordCount = 0; // Initialising wordCount to '0'
   }
   
   // Methods
   /**
      * creating a method to set word count.
      * @param wordCountIn for wordCount
      */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn; // sets wordCountIn to wordCount
   }
}


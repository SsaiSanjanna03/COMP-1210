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
public class OnlineBook extends OnlineTextItem {
// Class to represent name, author and price of an online text book

/**
     * Creating an instance variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variable using protected visibility modifier
   protected String author;
   /**
      * constructor takes item's name and price as parameters.
      * @param nameIn for item's name
      * @param priceIn for price of the item
      */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn); // Invoking the constructor for InventoryItem
      author = "Author Not Listed"; // Initialising author name
   }
   
   // Methods
   
    /**
      * creating a method to represent name, author and price
      * of the item.
      * @return book name with name of author and price
      */
   public String toString() { // Over-riding the toString method
      // "Book name - author name: price"
      return name + " - " + author + ": $" + calculateCost();
   }
   /**
      * creating a method to set author's name.
      * @param authorIn for author
      */
   public void setAuthor(String authorIn) {
      author = authorIn; // sets authorIn to author
   }
}



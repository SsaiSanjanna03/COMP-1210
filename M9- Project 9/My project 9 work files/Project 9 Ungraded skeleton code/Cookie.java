/**
* Program that contains a class to represent an inventory item in a store
* using subclasses and an abstract class.
* It also contains a main class to print all the information of items
* from the store.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/2/22
*/

// Abstarct class that stores data and provides methods to access the data
public class Cookie extends BakedItem {
/**
     * Creating a constant variable.
     * @param args Command line arguments (not used).
     */
   public static final double BASE_RATE = 0.35;
    /**
      * constructor takes baked item's name, flavor, quantity and 
      * a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param ingredientsIn for an array of ingredients
      */
   // constructor
   public Cookie(String bakedNameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
   }
   
   // Methods
   /**
      * creating a method to calculate price of the cookie.
      * @return price
      */
   public double price() {
      double price = BASE_RATE * quantity;
      return price;
   }   
}

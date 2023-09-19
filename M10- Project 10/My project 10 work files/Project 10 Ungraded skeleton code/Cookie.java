/**
* Program that contains various classes to represent categories of baked items,
* in which the first class is the parent class and other classes are
* derived from it.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/

// A sub-class of BakedItem to represent price of a baked cookie
public class Cookie extends BakedItem {

/**
     * Creating a constant variable.
     * @param args Command line arguments (not used).
     */
   public static final double BASE_RATE = 0.35;
    
    /**
      * Constructor takes baked item's name, flavor, quantity and 
      * a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param ingredientsIn for an array of ingredients
      */
   // Constructor
   public Cookie(String bakedNameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      // Invokes the cnstructor for BakedItem
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
   }
   
   // Methods
   /**
      * creating a method to calculate price of the cookie.
      * @return price
      */
   public double price() {
     // Price = 0.35 multiplied by quantity of item baked
      double price = BASE_RATE * quantity;
      return price;
   }   
}

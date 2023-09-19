  /**
* Program that contains various classes to represent categories of baked items,
* in which the first class is the parent class and other classes are
* derived from it.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/

// A sub-class of Cake to represent price of a baked wedding cake
public class WeddingCake extends Cake {
    
    /**
     * Creating an instance variable.
     * @param args Command line arguments (not used).
     */
   private int tiers;
   
   /**
     * Creating a constant variable.
     * @param args Command line arguments (not used).
     */
   public static final double BASE_RATE = 15.0;
   
   /**
      * constructor takes baked item name, flavor, quantity, number of layers,
      * number of tiers and a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param layersIn for layers
      * @param tiersIn for tiers
      * @param ingredientsIn for an array of ingredients
      */
   // constructor
   public WeddingCake(String bakedNameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String...ingredientsIn) {
      // Invokes the cnstructor for Cake
      super(bakedNameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      setTiers(tiersIn); // sets tiersIn to tiers
   }
   
   // Methods
   /**
      * Creating a method to get the number of tiers.
      * @return tiers
      */
   public int getTiers() {
      return tiers;
   }
   
   /**
      * Creating a method to set the number of tiers as given parameter.
      * @param tiersIn for tiers
      */
   public void setTiers(int tiersIn) {
      tiers = tiersIn; // sets tiersIn to tiers
   }
   
   /**
      * creating a method to calculate price of the wedding cake.
      * @return price
      */
   public double price() {
      // Total cost of wedding cake = Quantity multiplied by product of 
      // number of layers, number of tiers and 15.0
      double wedCakePrice = (BASE_RATE * layers * tiers) * quantity;
      return wedCakePrice;
   }
}

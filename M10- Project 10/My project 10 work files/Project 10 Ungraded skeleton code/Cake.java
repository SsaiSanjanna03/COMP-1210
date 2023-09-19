 /**
* Program that contains various classes to represent categories of baked items,
* in which the first class is the parent class and other classes are
* derived from it.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/

// A sub-class of BakedItem to represent price of a baked cake
public class Cake extends BakedItem {
   
   /**
     * Creating an instance variable.
     * @param args Command line arguments (not used).
     */
   protected int layers; // Using protected visibility modifier
   
   /**
     * Creating a constant variable.
     * @param args Command line arguments (not used).
     */
   public static final double BASE_RATE = 8.0;
   
   /**
      * constructor takes baked item's name, flavor, quantity, number of layers 
      * and a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param layersIn for layers
      * @param ingredientsIn for an array of ingredients
      */
   // Constructor
   public Cake(String bakedNameIn, String flavorIn, int quantityIn, 
      int layersIn, String...ingredientsIn) {
      // Invokes the constructor for BakedItem
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
      setLayers(layersIn); // sets layersIn to layers
   }
    
    // Methods
   /**
      * Creating a method to get the number of layers.
      * @return layers
      */
   public int getLayers() {
      return layers;
   }
    
    /**
      * Creating a method to set the number of layers as given parameter.
      * @param layersIn for layers
      */
   public void setLayers(int layersIn) {
      layers = layersIn; // sets layersIn for layers
   }
    
    /**
      * creating a method to calculate price of the cake.
      * @return price
      */
   public double price() {
      // Total price of cake = Quantity multiplied by 
      // product of number of layers and 8.0
      double cakePrice = (BASE_RATE * layers) * quantity;
      return cakePrice;
   }
}

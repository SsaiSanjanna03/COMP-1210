/**
* Program that contains various classes to represent categories of baked items,
* in which the first class is the parent class and other classes are
* derived from it.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/

// A sub-class of BakedItem to represent price of a baked pie
public class Pie extends BakedItem {
   
   /**
     * Creating an instance variable.
     * @param args Command line arguments (not used).
     */
   private double crustCost;
   
   /**
     * Creating a constant varible.
     * @param args Command line arguments (not used).
     */
   public static final double BASE_RATE = 12.0; 

/**
      * constructor takes baked item's name, flavor, quantity, cost of crust 
      * and a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param crustCostIn for crustCost
      * @param ingredientsIn for an array of ingredients
      */
   // Constructor
   public Pie(String bakedNameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String...ingredientsIn) {
      // Invokes the cnstructor for BakedItem
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
      setCrustCost(crustCostIn); // sets crustCostIn for crustCost
   }
   
   // Methods
    /**
      * Creating a method to get the cost of crust.
      * @return crust cost
      */
   public double getCrustCost() {
      return crustCost;
   }
    
    /**
      * Creating a method to set the cost of crust as given parameter.
      * @param crustCostIn for crustCost
      */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn; // sets crustCostIn for crustCost
   }
    
    /**
      * creating a method to calculate price of the pie.
      * @return price
      */
   public double price() {
      // Total price of pie = Quantity multiplied by sum of crust cost and 12.0
      double piePrice = (BASE_RATE + crustCost) * quantity;
      return piePrice;
   }
}
   
   


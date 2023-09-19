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
public class Pie extends BakedItem {
   private double crustCost;
   public static final double BASE_RATE = 12.0;

   public Pie(String bakedNameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String...ingredientsIn) {
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }
   public double getCrustCost() {
      return crustCost;
   }
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
   public double price() {
      double piePrice = (BASE_RATE + crustCost) * quantity;
      return piePrice;
   }
}
   
   


import java.text.DecimalFormat;
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
public abstract class BakedItem { 
/**
     * Creating instance variables and a static variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables using protected visibility modifier
   protected String bakedName;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;
   // Static variable
   protected static int numBakedObjects = 0;
   /**
      * constructor takes baked item's name, flavor, quantity and 
      * a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param ingredientsIn for an array of ingredients
      */
   // constructor
   public BakedItem(String bakedNameIn, String flavorIn, int quantityIn,
       String...ingredientsIn) {
      bakedName = bakedNameIn; // sets bakedNameIn to bakedName
      flavor = flavorIn; // sets flavorIn to flavor
      quantity = quantityIn; // sets quantityIn to quantity
      ingredients = ingredientsIn; // sets ingredientsIn to array 'ingredients'
      numBakedObjects++; // increments number of baked item objects created
   }
   
   // Methods
   /**
      * creating a method to get name of baked item.
      * @return item's name
      */
   public String getName() {
      return bakedName;
   }
   /**
      * creating a method to set the name of baked item as given parameter.
      * @param bakedNameIn for bakedName
      */
   public void setName(String bakedNameIn) {
      bakedName = bakedNameIn; // sets bakedNameIn to bakedName
   }
/**
      * creating a method to get flavor of baked item.
      * @return item's flavor
      */
   public String getFlavor() {
      return flavor;
   }
   /**
      * creating a method to set the flavor of baked item as given parameter.
      * @param flavorIn for flavor of item that is baked
      */
   public void setFlavor(String flavorIn) {
      flavor = flavorIn; // sets flavorIn to flavor
   }
 /**
      * creating a method to get the quantity of baked item.
      * @return quantity
      */
   public int getQuantity() {
      return quantity;
   }
   /**
      * creating a method to set the quantity of baked item as given parameter.
      * @param quantityIn fror quantity
      */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn; // sets quantityIn to quantity
   }
/**
      * creating a method to get the ingredients of baked item.
      * @return an array of ingredients
      */
   public String[] getIngredients() {
      return ingredients;
   }
   /**
      * creating a method to set the quantity of baked item as given parameter.
      * @param ingredientsIn for ingredients
      */
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }
   /**
      * creating a method to get number of baked item objects created.
      * @return number of objects
      */
   public static int getCount() {
      return numBakedObjects;
   }
   /**
      * creating a method to reset the name of baked item objects created to 0.
      */
   public static void resetCount() {
      numBakedObjects = 0; // resets the count to zero
   }
   /**
      * creating a method to represent name, flavor, price and ingredients used.
      * @return output String
      */
   public final String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      String output = "";
      output += this.getClass().toString().substring(6) + ": ";
      output += getName() + " - " + getFlavor() + "   ";
      output += "Quantity: " + getQuantity() + "   ";
      output += "Price: $" + df.format(price()) + "\n(Ingredients: ";
      int numIngs = ingredients.length;
      for (int i = 0; i < numIngs; i++) {
         if ((i > 0) && (i % 5 == 0)) {
            output += "\n";
         }
         if (i != numIngs - 1) {
            output += ingredients[i] + ", ";
         }
         else
         {
            output += ingredients[i] + ")";
         }
      }
      return output;
      
   }
   /**
      * creating a method to represent name, flavor, price and ingredients used.
      * @return price
      */
   public abstract double price();
}


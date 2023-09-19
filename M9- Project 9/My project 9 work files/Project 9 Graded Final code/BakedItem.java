import java.text.DecimalFormat;
/**
* Program that contains various classes to represent categories of baked items,
* in which the first class is the parent class and other classes are
* derived from it.
*
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/

// Abstract class that stores data and provides methods to access the data
public abstract class BakedItem { // Parent class

/**
     * Creating instance variables and a static variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables using protected visibility modifier
   protected String bakedName; //Name of the item baked
   protected String flavor; // Flavor of the item baked
   protected int quantity; // The quantity of the item baked
   protected String[] ingredients; // An array with ingredients used
   
   // Static variable
   protected static int numBakedObjects = 0; // Number of items baked
   
   /**
      * Constructor takes baked item's name, flavor, quantity and 
      * a variable length parameter for the array.
      * @param bakedNameIn for baked item's name
      * @param flavorIn for item's flavor
      * @param quantityIn for quantity
      * @param ingredientsIn for an array of ingredients
      */
   // Constructor
   public BakedItem(String bakedNameIn, String flavorIn, int quantityIn,
       String...ingredientsIn) {
      setName(bakedNameIn); // sets bakedNameIn to bakedName
      setFlavor(flavorIn); // sets flavorIn to flavor
      setQuantity(quantityIn); // sets quantityIn to quantity
      setIngredients(ingredientsIn); // sets ingredientsIn to 'ingredients'
      numBakedObjects++; // increments number of baked item objects created
   }
   
   // Methods
   /**
      * Creating a method to get name of baked item.
      * @return item's name
      */
   public String getName() {
      return bakedName;
   }
   
   /**
      * Creating a method to set the name of baked item as given parameter.
      * @param bakedNameIn for bakedName
      */
   public void setName(String bakedNameIn) {
      bakedName = bakedNameIn; // sets bakedNameIn to bakedName
   }
    
    /**
      * Creating a method to get flavor of baked item.
      * @return item's flavor
      */
   public String getFlavor() {
      return flavor;
   }
    
    /**
      * Creating a method to set the flavor of baked item as given parameter.
      * @param flavorIn for flavor of item that is baked
      */
   public void setFlavor(String flavorIn) {
      flavor = flavorIn; // sets flavorIn to flavor
   }
    
    /**
      * Creating a method to get the quantity of baked item.
      * @return quantity
      */
   public int getQuantity() {
      return quantity;
   }
    
    /**
      * Creating a method to set the quantity of baked item as given parameter.
      * @param quantityIn for quantity
      */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn; // sets quantityIn to quantity
   }
    
    /**
      * Creating a method to get the ingredients of baked item.
      * @return an array of ingredients
      */
   public String[] getIngredients() {
      return ingredients;
   }
    
    /**
      * Creating a method to set the array 'ingredients' as given parameter.
      * @param ingredientsIn for ingredients
      */
   public void setIngredients(String...ingredientsIn) {
      // sets the variable length parameter to the array 'ingredients'
      ingredients = ingredientsIn;
   }
    
    /**
      * Creating a method to get number of baked item objects created.
      * @return number of objects
      */
   public static int getCount() {
      return numBakedObjects;
   }
    
    /**
      * Creating a method to reset the number of baked item objects to 0.
      */
   public static void resetCount() {
      numBakedObjects = 0; // resets the count to zero
   }
   
   /**
      * Creating a method to represent name, flavor, quantity, price 
      * and ingredients used.
      * @return output String
      */
   public final String toString() { // Cannot be overriden
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String output = "";
      // overriding the default toString method to get the class name 
      output += this.getClass().toString().substring(6) + ": ";
      output += getName() + " - " + getFlavor() + "   ";
      output += "Quantity: " + getQuantity() + "   ";
      output += "Price: " + df.format(price()) + "\n(Ingredients: ";
      int numIngs = ingredients.length; // Number of ingredients
      for (int i = 0; i < numIngs; i++) { // Iterating through 'ingredients'
         if ((i > 0) && (i % 5 == 0)) {
            output += "\n"; // Returns a new line for every five ingredients
         }
         if (i != numIngs - 1) { // Evaluates true till the last term of array
            output += ingredients[i] + ", "; 
         }
         else // prints the last term in the array
         {
            output += ingredients[i] + ")";
         }
      }
      return output;
      
   }
    
    /**
      * creating an abstract method to give out price of item baked.
      * @return price
      */
   public abstract double price(); // An abstract method, so has no body
}


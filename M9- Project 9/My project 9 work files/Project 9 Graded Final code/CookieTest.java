import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file that tests whether the methods from 
* both BakedItem class and Cookie class are correct or not.
* 
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/
public class CookieTest {

   /** Fixture initialization (common initialization
    *  for all tests).
    **/
   @Before public void setUp() {
   }
   
   /**
     * A test to check both getName and setName methods. 
     */
   @Test public void bakedNameTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      // sets the baked item name as 'Chocochip delight'
      c.setName("Chocochip delight"); 
      
      Assert.assertEquals("BakedName test: ", "Chocochip delight", c.getName());
   }
   
   /**
     * A test to check both getFlavor and setFlavor methods. 
     */
   @Test public void flavorTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      // sets the item's flavor to 'Chocolate'
      c.setFlavor("Chocolate");
      
      Assert.assertEquals("Flavor test: ", "Chocolate", c.getFlavor());
   }
   
   /**
     * A test to check both getQuantity and setQuantity methods. 
     */
   @Test public void quantityTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      // sets the quantity of item baked to 24
      c.setQuantity(24);
      
      Assert.assertEquals("Quantity test: ", 24, c.getQuantity());
   }
   
   /**
     * A test to check both getIngredients and setIngredients methods. 
     */
   @Test public void getIngredientsTest() {
      // Creating an array of ingredients
      String[] ings = {"flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt"};
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      // Assigns the set of strings to the array 'ingredients'
      c.setIngredients("flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      // Tests whether the two arrays are equal
      
      Assert.assertArrayEquals("Ingredients  test: ", ings, c.getIngredients());
   }
   
   /**
     * A test to check both getCount and resetCount methods. 
     */
   @Test public void countTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.resetCount(); // resets the number of baked item objects created to 0
     
      Assert.assertEquals("Flavor test: ", 0, c.getCount());
   }
   
   /**
     * A test to check the toString method. 
     */
   @Test public void toStringTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      
      // Tests whether the output contains the word "Price"
      Assert.assertTrue(" To String test: ", c.toString().contains("Price"));
   }
   
   /**
     * A test to check the price method. 
     */
   @Test public void priceTest() {
      // Creating an instance object of Cookie class
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      
      Assert.assertEquals("Price test: ", 4.20, c.price(), 0.01);
   }
}

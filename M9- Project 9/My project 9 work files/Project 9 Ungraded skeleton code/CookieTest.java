import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests).
    **/
   @Before public void setUp() {
   }
   @Test public void BakedNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setName("Chocochip delight");
      Assert.assertEquals("BakedName test: ", "Chocochip delight", c.getName());
   }
   @Test public void flavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setFlavor("Chocolate");
      Assert.assertEquals("Flavor test: ", "Chocolate", c.getFlavor());
   }
   @Test public void quantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setQuantity(24);
      Assert.assertEquals("Quantity test: ",24 , c.getQuantity());
   }
   @Test public void getIngredientsTest() {
      String[] ings = {"flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt"};
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.setIngredients("flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertArrayEquals("Ingredients  test: ", ings, c.getIngredients());
   }
   @Test public void countTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      c.resetCount();
      Assert.assertEquals("Flavor test: ",0 , c.getCount());
   }
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertTrue(" To String test: ", c.toString().contains("Price"));
   }
   @Test public void PriceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, "flour", 
         "sugar", "dark chocolate chips", "butter", "baking soda", "salt");
      Assert.assertEquals("Price test: ", 4.20, c.price(), 0.01);
   }
}

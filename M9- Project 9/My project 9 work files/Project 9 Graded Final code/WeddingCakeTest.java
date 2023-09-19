import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file that tests whether the methods from 
* WeddingCake class are correct or not.
* 
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/
public class WeddingCakeTest {

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /**
     * A test to check both getTiers and setTiers methods. 
     */
   @Test public void tiersTest() {
      // Creating an instance object of WeddingCake class
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", 
         "salt");
      c3.setTiers(4); // sets the number of tiers to '4'
      
      Assert.assertEquals("Tiers test: ", 4, c3.getTiers());
   }
   
   /**
     * A test to check the price method. 
     */
   @Test public void priceTest() {
      // Creating an instance object of WeddingCake class
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", 
         "salt");
      
      Assert.assertEquals("Price test: ", 135.00, c3.price(), 0.01);
   }
}

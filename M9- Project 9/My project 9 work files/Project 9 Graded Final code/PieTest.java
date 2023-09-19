import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file that tests whether the methods from 
* Pie class are correct or not.
* 
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/
public class PieTest {

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /**
     * A test to check both getCrustCost and setCrustCost methods. 
     */
   @Test public void crustCostTest() {
      // Creating an instance object of Pie class
      Pie p1 = new Pie("Summer Special", "Key Lime", 1, 2,
         "flour", "sugar", "lime juice", "lemon juice",
          "graham crackers", "butter", "baking soda", "salt");
      p1.setCrustCost(2.0); // sets the crust cost to '2.0'
      
      Assert.assertEquals("Crust cost test: ", 2, p1.getCrustCost(), 0.01);  
   }
   
   /**
     * A test to check the price method. 
     */
   @Test public void priceTest() {
      // Creating an instance object of Pie class
      Pie p1 = new Pie("Summer Special", "Key Lime", 1, 2,
         "flour", "sugar", "lime juice", "lemon juice",
          "graham crackers", "butter", "baking soda", "salt");
     
      Assert.assertEquals("Price test: ", 14.00, p1.price(), 0.01);  
   }
}

import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file that tests whether the methods from 
* Cake class are correct or not.
* 
* Project_9.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/04/22
*/
public class CakeTest {

   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   
   /**
     * A test to check both getLayers and setLayers methods. 
     */
   @Test public void layersTest() {
      // Creating an instance object of Cake class
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
          "butter", "baking soda", "baking power", "salt");
      c1.setLayers(2); // sets number of layers to '2'
      
      Assert.assertEquals("Layers test: ", 2, c1.getLayers());  
   }
   
   /**
     * A test to check the price method. 
     */
   @Test public void priceTest() {
      // Creating an instance object of Cake class
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
          "butter", "baking soda", "baking power", "salt");
      
      Assert.assertEquals("Price test: ", 8.00, c1.price(), 0.01);  
   }
}

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class CakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   @Test public void layersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
          "butter", "baking soda", "baking power", "salt");
      c1.setLayers(2);
      Assert.assertEquals("Layers test: ", 2, c1.getLayers());  
   }
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1,
         "flour", "sugar", "cocoa powder", "vanilla", "eggs",
          "butter", "baking soda", "baking power", "salt");
      Assert.assertEquals("Price test: ", 8.00, c1.price(), 0.01);  
   }
}

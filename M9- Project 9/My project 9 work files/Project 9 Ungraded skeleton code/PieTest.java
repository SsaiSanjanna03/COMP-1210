import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   @Test public void crustCostTest() {
      Pie p1 = new Pie("Summer Special", "Key Lime", 1, 2,
         "flour", "sugar", "lime juice", "lemon juice",
          "graham crackers", "butter", "baking soda", "salt");
      p1.setCrustCost(2.0);
      Assert.assertEquals("Crust cost test: ", 2, p1.getCrustCost(), 0.01);  
   }
   @Test public void priceTest() {
      Pie p1 = new Pie("Summer Special", "Key Lime", 1, 2,
         "flour", "sugar", "lime juice", "lemon juice",
          "graham crackers", "butter", "baking soda", "salt");
      Assert.assertEquals("Price test: ", 14.00, p1.price(), 0.01);  
   }
}

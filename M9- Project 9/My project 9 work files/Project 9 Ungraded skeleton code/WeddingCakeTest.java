import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class WeddingCakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }
   @Test public void tiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", 
         "salt");
      c3.setTiers(4);
      Assert.assertEquals("Tiers test: ", 4, c3.getTiers());
   }
   @Test public void priceTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3,
         "flour", "sugar", "buttermilk", "coffee",
         "eggs", "butter", "baking soda", "baking powder", 
         "salt");
      Assert.assertEquals("Price test: ", 135.00, c3.price(), 0.01);
   }
}

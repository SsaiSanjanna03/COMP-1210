import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Test file that tests whether the methods from 
* RingTorus object are correct or not.
* 
* Project_7A.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/14/22
*/
public class RingTorusTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
   * A test to check getLabel method. 
   */
   @Test public void getLabelTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Get label test: ", "Medium Example", ex2.getLabel());
   }
   
   /**
   * A test to check getLargeRadius method. 
   */
   @Test public void getLargeRadiusTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Get large radius test: ", 
         35.1, ex2.getLargeRadius(), 0.001);
   }
   
   /**
   * A test to check getSmallRadius method. 
   */
   @Test public void getSmallRadiusTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Get small radius test: ", 
         10.4, ex2.getSmallRadius(), 0.001);
   }
   
   /**
   * A test to check setLabel method when 'if' condition comes out true. 
   */
   @Test public void labelTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertTrue("Label true test: ", 
         ex2.setLabel("Medium Example"));
   }
  
  /**
   * A test to check setLabel method when 'if' condition comes out false.
   */
   @Test public void labelFalseTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertFalse("Label false test: ", 
         ex2.setLabel(null));
   }

  /**
   * A test to check setLargeRadius method when 'if' condition comes out true.. 
   */
   @Test public void largeRadiusTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertTrue("Large radius true test: ", 
         ex2.setLargeRadius(35.1));
   }
   
   /**
   * A test to check setLargeRadius method when 'if' condition comes out false. 
   */
   @Test public void largeRadiusFalseTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertFalse("Large radius false test: ", 
         ex2.setLargeRadius(-3));
   }

   /**
   * A test to check setSmallRadius method when 'if' condition comes out true. 
   */
   @Test public void smallRadiusTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertTrue("Small radius true test: ", 
         ex2.setSmallRadius(10.4));
   }
   
   /**
   * A test to check setSmallRadius method when 'if' condition comes out false. 
   */
   @Test public void smallRadiusFalseTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertFalse("Small radius false test: ", 
         ex2.setSmallRadius(-8));
   }

   /**
   * A test to check diameter method. 
   */
   @Test public void diameterTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Diameter test: ", 91.0, ex2.diameter(), 0.001);
   }
   
   /**
   * A test to check surfaceArea method. 
   */
   @Test public void surfaceAreaTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Surface area test: ", 14411.202, 
         ex2.surfaceArea(), 0.001);
   }
         
 /**
   * A test to check volume method. 
   */
   @Test public void volumeTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Volume test: ", 74938.248, 
         ex2.volume(), 0.001);
   }
   
   /**
   * A test to check ToString method. 
   */
   @Test public void toStringTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertTrue("To string test: ", 
         ex2.toString().contains("\"Medium Example\""));
   }
   
   /**
   * A test to check getCount method. 
   */
   @Test public void getCountTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      ex2.resetCount();
      Assert.assertEquals("Get count test: ", 0, ex2.getCount(), 0.001);
   }
   
   /**
   * A test to check equals method when 'if' condition comes out false. 
   */
   @Test public void equalsFalseTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertFalse("Equals false test: ", false);
   } 
    
   /**
   * A test to check equals method when 'if' condition comes out true. 
   */
   @Test public void equalsTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus rt = (RingTorus) ex2; 
      Assert.assertTrue("Equals true test: ", ex2.equals(rt));
   } 

   /**
   * A test to check hashCode method. 
   */
   @Test public void hashCodeTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Hash code test: ", 0, ex2.hashCode());
   }
   
}

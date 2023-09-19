import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Test file that tests whether the methods from 
* RingTorus object are correct or not.
* 
* Project_7B.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/21/22
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
   * A test to check setLargeRadius method when 'if' condition comes out true. 
   */
   @Test public void largeRadiusTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      
      // Large radius satisfies all of the 'if' conditions --> test passes 
      Assert.assertTrue("Large radius true test: ", 
         ex2.setLargeRadius(35.1));
      
      // Large radius is not a positive number --> test fails
      Assert.assertFalse("Large radius false test: ", 
         ex2.setLargeRadius(-3.0));
      
      // Large radius is less than small radius --> test fails
      Assert.assertFalse("Large radius false test: ", 
         ex2.setLargeRadius(9.8));   
   }
   
   /**
   * A test to check setLargeRadius method when 'if' condition comes out false. 
   */
   @Test public void largeRadiusFalseTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertFalse("Large radius false test: ",
         ex2.setLargeRadius(9.6));
   }

   /**
   * A test to check setSmallRadius method when 'if' condition comes out true. 
   */
   @Test public void smallRadiusTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      
      // Small radius satisfies all of the 'if' conditions --> test passes
      Assert.assertTrue("Small radius true test: ", 
         ex2.setSmallRadius(10.4));
      
      // Small radius is not a positive number --> test fails
      Assert.assertFalse("Small radius false test: ", 
         ex2.setSmallRadius(-0.9));
      
      // Small radius is greater than large radius --> test fails
      Assert.assertFalse("Small radius false test: ", 
         ex2.setSmallRadius(40.6));  
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
      Assert.assertFalse("Equals false label test: ", ex2.equals(0)); 
   } 
    
   /**
   * A test to check equals method when 'if' condition comes out true. 
   */
   @Test public void equalsTrueTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      
      // Creating new object same as 'ex2'
      RingTorus rt = (RingTorus) ex2; 
      // New object with a different label
      RingTorus ex4 = new RingTorus("Moderate Example", 35.1, 10.4);
      // New object with a different large radius
      RingTorus ex5 = new RingTorus("Medium Example", 37.9, 10.4);
      // New object with a different small radius
      RingTorus ex6 = new RingTorus("Medium Example", 35.1, 12.3);
      
      // Label, large radius, small radius matches --> test passes
      Assert.assertTrue("Equals true test: ", ex2.equals(rt));
      // Label is not same --> test fails
      Assert.assertFalse("Label not matchingtest: ", ex2.equals(ex4));
      // Large radius is not same --> test fails
      Assert.assertFalse("Large radius not matching: ", ex2.equals(ex5));
      // Small radius is not same --> test fails
      Assert.assertFalse("Small radius not matching: ", ex2.equals(ex6)); 
   } 

   /**
   * A test to check hashCode method. 
   */
   @Test public void hashCodeTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      Assert.assertEquals("Hash code test: ", 0, ex2.hashCode());
   }
   
   /**
   * A test to check compareTo method. 
   */
   @Test public void compareToTest() {
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus rt = (RingTorus) ex2;
      
      // Volume of 'ex2' is less than volume of 'ex3' --> 'if' executes
      Assert.assertEquals("compareTo if test: ", -1, ex2.compareTo(ex3));
      // Volume of 'ex2' is greater than volume of 'ex4' --> 'else if' executes
      Assert.assertEquals("compareTo else if test: ", 1, ex2.compareTo(ex1));
      // Volume of 'ex2' is equal to volume of 'rt' --> 'else' executes
      Assert.assertEquals("compareTo else test: ", 0, ex2.compareTo(rt));
   }
     
}

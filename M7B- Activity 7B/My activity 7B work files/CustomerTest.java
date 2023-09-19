import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* Test file that tests whether the methods from 
* the Customer object are correct or not.
* 
* Activity_7B.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/17/22
*/
public class CustomerTest {
/** 
  * Fixture initialization (common initialization for all tests). 
  **/
   @Before public void setUp() {
   }
   
   /**
   * A test to check setLocation method when a single parameter is given. 
   */
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      // checks whether the customer's location is BOSTON, MA.
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   
   /**
   * A test to check setLocation method when two parameters (
   * city, state) are given. 
   */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      // checks whether the customer's location is ATLANTA, GA
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   
   /**
   * A test to check changeBalance method. 
   */
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      // checks whether the customer's balance is 100
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   
   /**
   * A test to check toString method. 
   */
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   
   /**
   * A test to check compareTo method when both objects are same.
   */
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
      
      // checks whether the 'if' condition is true
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   
   /**
   * A test to check compareTo method when one object is less than the other.
   */
   @Test public void compareToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
   
      // checks whether the 'else if' condition is true
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
  
  /**
   * A test to check compareTo method when one object is greater than the other.
   */
   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500); 
   
      // checks whether the 'else' condition is true
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}

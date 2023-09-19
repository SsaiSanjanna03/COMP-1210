import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Test file that tests whether the methods from 
* BankLoan file are correct or not.
* 
* Activity_7A.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/11/22
*/
public class BankLoanTest {
   
   /** 
     * Fixture initialization (common initialization for all tests).
     */
   @Before public void setUp() {
   }
   
   /**
     * A test to check the chargeInterest method.
     */
   @Test public void chargeInterestTest()
   {
      BankLoan loan1 = new BankLoan("jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}


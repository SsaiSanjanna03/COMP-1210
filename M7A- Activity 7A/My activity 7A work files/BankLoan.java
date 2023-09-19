/**
* Program that contains bank loan details.
* 
* Activity_7A.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/11/22
*/

public class BankLoan {
	/**
     * Initialising constant fields and declaring instance variables.
     * @param args Command line arguments (not used).
     */
   
   // constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
    
    /**
      * constructor takes a string and a double as parameters.
      * @param customerNameIn for customerName
      * @param interestRateIn for interestRate
      */
   // constructor
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      // number of BankLoan objects increments each time the object is called
      loansCreated++;
   }
 
 // METHODS.
 /**
      * creating a method to check whether loan is made or not.
      * @param amount for amount borrowed from bank by customer
      * @return true if sum of balance and amount is less than maximum loan 
      * amount, otherwise false
      */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
 
 /**
      * creating a method to update balance amount based on amount paid.
      * @param amountPaid for loan amount paid by customer
      * @return overcharge if balance is paid beyond needed
      */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
    /**
      * creating method to get tha balance amount.
      * @return balance
      */
   public double getBalance() {
      return balance;
   }
    
    /**
      * creating a method to set an interest rate.
      * @param interestRateIn for interestRate
      * @return true if entered interest rate is between 0 and 1, 
      * otherwise false
      */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
    /**
      * creating a method to get interest rate.
      * @return interest rate
      */
   public double getInterestRate() {
      return interestRate;
   }
   
    /**
      * creating a method to rest the balance amount.
      */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
      * creating a method to represent customer name, interest rate
      * and balance together in a string.
      * @return output string
      */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
      * creating a method to check whether the loan amount is greater than
      * or equal to 0.
      * @param amount for loan amount taken
      * @return true: is satisfies above condition, otherwise false.
      */
   public static boolean isAmountValid(double amount)
   {
      if (amount >= 0)
      {
         return true;
      }
      return false;
   }
   
   /**
      * creating a method to check whether the balance loan amount 
      * is greater than 0.
      * @param loan for BankLoan object
      * @return true: is satisfies above condition, otherwise false.
      */
   public static boolean isInDebt(BankLoan loan) 
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }
  
  /**
      * creating a method to get number of BankLoan objects.
      * @return number of loans created.
      */
   public static int getLoansCreated()
   {
      return loansCreated;
   }
   
   /**
      * creating a method to reset number of loans created.
      */
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }

}

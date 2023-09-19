/**
* This program is to learn handling exceptions using try-catch statements
* and throw exceptions in your program
*
* Activity_11.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/14/22
*/
public class Division {

/**
    * Creating a method that takes two int parameters
    * to perform integer division.
    * @param num for numerator
    * @param denom for denominator
    * @return result of dividing numerator and denominator
    */
   public static int intDivide(int num, int denom) {
      try { // Using try-catch statement to overcome arithmetic exception error
         return num / denom;
      }
      catch (ArithmeticException e) {
         return 0; // Returns '0' if exception occurs
      }
   }
   
   /**
    * Creating a method that takes two int parameters
    * to perform floating point division.
    * @param numerator for numerator
    * @param denominator for denominator
    * @return result of dividing numerator and denominator
    */
   public static float decimalDivide(int numerator, int denominator) {
      float num = (float) numerator; // Casting numerator to float
      float denom = (float) denominator; // Casting denominator to float
      if (denom == 0) { 
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return num / denom;
   }
}
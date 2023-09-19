/**
* Program to create a class which holds an integer value and provides methods
  to perform various operations on that value.
* 
* Activity_5.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/20/22
*/
public class NumberOperations 
{
/**
      * Creates the Number operations class.
      * @param args Command line arguments (not used).
      */
      // instance variables
   private int number; 
   /**
      * Constructor takes a value for variable 'number' of type int.
      * @param numberIn for number
      */
   // constructor
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   //Creating various methods to perform various functions
   // methods
   /**
      * creates a method to get value of number.
      * @return number
      */
   public int getValue()
   {
      return number;
   }
   /**
      * Creating a method to give out all positive odd integers less than
      * value of number.
      * @return output         
      */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         // checks whether i is odd or even
         if (i % 2 != 0)
         {
            // if true: adds value of i to output
            output += i + "\t";
         }
         // incrementing i by 1
         i++;
      }
      return output;
   }
   /**
      * Creating a method to give out all positive powers of two less than
      * value of number.
      * @return output
      */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         // adding value of powers to output
         output += powers + "\t";
         // assigns power to the value of next power of 2 
         powers = powers * 2; 
      }
      return output;
   }
   /**
      * Compares value of number with 'compare number'.
      * @param compareNumber for isGreater
      * @return appropriate output based on comparison         
      */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) 
      {
         // 1: number greater than compare number
         return 1; 
      }
      else if (number < compareNumber) // number
      {
         // -1: number less than compare number
         return -1;
      }
      else
      {
         // 0: number equals to compare number
         return 0;
      }
   }
   /**
      * creates a method to convert output to string.
      * @return output string
      */
   public String toString()
   {
      return number + "";
   }
}
  
  

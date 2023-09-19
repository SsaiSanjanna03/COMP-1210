import java.util.Scanner;
  /**
* Program to find the result of indicated formuala.
* 
* Project_2.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 08/31/22
*/
public class MySolver
{
/**
     * Prints the result of formula.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      //Prints formuala:
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      //Prompts the user to enter 'x' value:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      //Prompts the user to enter 'y' value:
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      //Prompts the user to enter 'z' value:
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      if (z != 0)
      {
      //calculate the result of given formula
         result = (8.5 * x + 6.1) * (10 * y + 7.9) / (z);
         System.out.println("result = " + result);
      }
      else
      {
         System.out.println("result is undefined");
      }
   }
      
}

   
  

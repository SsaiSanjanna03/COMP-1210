import java.util.Scanner;
import java.text.DecimalFormat;
/**
* Program that solves for the result of a specified expression using 
  methods from the Math class.
* 
* Project_3.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/09/22
*/
public class RadicalFormula
{
/**
     * Prints the result of given formula for a value of x of type double.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      // prompts the user to enter value of 'x'
      System.out.print("Enter a value for x: ");
      double x = Double.parseDouble(userInput.nextLine());
      // breaking down formula into small expressions
      double a = Math.pow(3 * Math.pow(x, 8) - 2 * Math.pow(x, 3), 2);
      double b = Math.abs((3 * Math.pow(x, 5)) - (2 * Math.pow(x, 3)));
      double c = a + b;
      double result = Math.sqrt(c);
      // prints the final value of formula for a given input 'x'
      System.out.println("Result: " + result);
      // converting result from type double to type string
      Double resultO = result;
      String resultS = Double.toString(resultO);
      // finding decimal position and length of string result
      int d = resultS.indexOf(".");
      int l = resultS.length();
      String beforeDecimal = resultS.substring(0, d);
      String afterDecimal = resultS.substring(d + 1, l);
      // prints number of characters in string result before and after decimal
      System.out.println("# digits to left of decimal point: " 
         + beforeDecimal.length());
      System.out.println("# digits to right of decimal point: " 
         + afterDecimal.length());
      // introducing decimal format
      DecimalFormat fr =  new DecimalFormat("#,##0.0##");
      // prints the final result in desired format
      System.out.println("Formatted Result: " + fr.format(result));
   }
}
  

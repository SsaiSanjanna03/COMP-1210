import javax.swing.JOptionPane; // Importing package to create input dailog box
 /**
* This program is to learn handling exceptions using try-catch statements
* and throw exceptions in your program
*
* Activity_11.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/14/22
*/

public class DivisionDriver {

/**
    * Creating a main method that gets numerator and denominator from the user
    * and prints the integer division and decimal divisionn result.
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
      // Creating dialog box that will get numerator as a string
      String numInput = JOptionPane.showInputDialog("Enter the numerator: ");
      // Creating dialog box that will get denominator as a string
      String denomInput = JOptionPane.
         showInputDialog("Enter the denominator: ");
      // Using a try-catch statement to catch exception and tell user what went 
      // wrong without creating a run-time error
      try { 
         int num = Integer.parseInt(numInput); // Converting to integer
         int denom = Integer.parseInt(denomInput); // Converting to integer
         // Printing results of both division types
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         // Prints the result in a dialog box
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) { // When exception occurs
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      // Second catch statement to catch exception in decimalDivide method
      catch (IllegalArgumentException e) { 
         JOptionPane.showMessageDialog(null,
            e, "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}
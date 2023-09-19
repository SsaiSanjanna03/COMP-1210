import java.util.Scanner;
/**
* Program that exchanges letters in a String to encode a message.
* 
* Activity_3.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/06/22
*/
public class MessageConverter
{
/**
    * Prints a message based on the number given as input.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String message = " ";
      int outputType = 0;
      String result = " ";
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      if (outputType == 0)
      {
      // prints out the message unchanged
         result = message;
      }
      else if (outputType == 1)
      {
      // prints trimmed message
         result = message.trim();
      }
      else if (outputType == 2)
      {
      // changes to lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3)
      {
      // changes to upper case
         result = message.toUpperCase();
      }
      else if (outputType == 4)
      {
      // replaces vowels with _
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5)
      {
      // prints message without first and last characters
         result = message.substring(1, message.length() - 1);
      }
      else
      { 
      // invalid input
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);
   }
}

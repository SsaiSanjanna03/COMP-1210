import java.util.ArrayList;
import java.util.Scanner;
/**
* Program that includes two classes in which the first class holds data 
* regarding temperatures while the second class allows users to interact 
* with the data in first class.
* 
* Activity_6.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/26/22
*/
public class TemperatureInfo
{
 /**
    * Prints temperature information based on input.
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) 
   {
      // creating a scanner object to read input from keyboard
      Scanner userInput = new Scanner(System.in);
      
      // introducing an array list
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      // adding a do while loop that reads input values and adds to array list
      String tempInput = "";
      do 
      {
         System.out.print("Enter a temperature (or nothing to end list): ");
         // takes input values until user presses enter with no value
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals(""))
         {
            // adds input values to array list
            tempsList.add(Integer.parseInt(tempInput));
         }
      }
      // iterates until user presses enter with no value
      while (!tempInput.equals(""));
      
      // creating another object with the array list
      Temperatures temps = new Temperatures(tempsList);
      
      // adding another do while loop that iterates until user presses 
      // 'E' to end the loop
      char choice = 'E';
      do
      {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, [P]rint, "
            + "[E]nd: ");
         // changes input to upper case and assigns first character to 'choice'
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice)
         {
            case 'L':
               // prints low temperature from the list
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            
            case 'H':
               // prints high temperature from the list
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            
            case 'P':
               // prints the object
               System.out.println(temps);
               break;
            
            case 'E':
               // prints 'Done' indicating end of the loop
               System.out.println("\tDone");
               break;
            
            default:
               // prints as below when user enters characters apart from the
               // ones that were mentioned above
               System.out.println("\tInvalid choice!");
               break;
         }
      }
      while (choice != 'E');
   }
}




   
   

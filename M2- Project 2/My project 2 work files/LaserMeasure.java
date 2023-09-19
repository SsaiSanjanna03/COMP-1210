import java.util.Scanner;
/**
* Program that displays the distance as a combination of miles, yards, 
feet and inches.
* 
* Project_2.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/02/22
*/
public class LaserMeasure
{
/**
    * Prints AgeStatistics of a person.
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      int distance = 0;
      int miles = 0;
      int yards = 0;
      int feet = 0; 
      int inches = 0;
   //Prompts the user to enter raw distance measurement
      System.out.print("Enter the raw distance measurement in inches: ");
      distance = userInput.nextInt();
      if (distance >= 0)
      {
         miles = distance / 63360;
         yards = (distance % 63360) / 36;
         feet = ((distance % 63360) % 36) / 12;
         inches = ((distance % 63360) % 36) % 12;
         System.out.println();
         System.out.println("Measurement by combined miles, yards,"
            + " feet, inches:");
         System.out.println("\tmiles: " + miles);
         System.out.println("\tyards: " + yards);
         System.out.println("\tfeet: " + feet);
         System.out.println("\tinches: " + inches);
         System.out.println();
         System.out.println(distance + " in = " + miles + " mi, " 
            + yards + " yd, " + feet + " ft, " + inches + " in");
      }
      else
      {
         System.out.println("Measurement must be non-negative!");
         System.out.println();
      } 
   }
}
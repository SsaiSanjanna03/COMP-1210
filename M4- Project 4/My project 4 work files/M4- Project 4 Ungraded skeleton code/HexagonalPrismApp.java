import java.util.Scanner;
/**
* Program to create two classes in which the first class defines right regular
hexagonal prism objects and the other reads in data and prints the object.   
*
* Project_4.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/16/22
*/
public class HexagonalPrismApp
{
/**
      * Prints message by calling methods from hexagonal prism class.     
      * @param args Command line arguments (not used).
      */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, edge, and height for a hexagonal"
         + " prism.");
      String iLabel = userInput.nextLine();
      Double iEdge = Double.parseDouble(userInput.nextLine());
      Double iHeight = Double.parseDouble(userInput.nextLine());
      HexagonalPrism hp = new HexagonalPrism(iLabel, iEdge, iHeight);
      System.out.print("\tlabel: " + iLabel);
      System.out.print("\n\tedge: " + iEdge);
      if (iEdge > 0)
      {
         System.out.print("\n\theight: " + iHeight);
         if (iHeight > 0)
         {
            hp.setLabel(iLabel);
            hp.setEdge(iEdge);
            hp.setHeight(iHeight);
            hp.lateralSurfaceArea();
            hp.baseArea();
            hp.surfaceArea();
            hp.volume();
            System.out.println("\n" + hp);
         }
         else
         {
            System.out.println("\nError: height must be greater than zero.");
         }
      
      }
      else
      {
         System.out.println("\nError: edge must be greater than zero.");
      }
   }
}
   

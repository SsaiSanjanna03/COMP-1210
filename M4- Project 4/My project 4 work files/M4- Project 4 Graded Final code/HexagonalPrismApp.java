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
      String iLabel;
      Double iEdge;
      Double iHeight;
      HexagonalPrism hp = new HexagonalPrism();
      System.out.println("Enter label, edge, and height for a hexagonal"
         + " prism.");
      iLabel = userInput.nextLine().trim();
      System.out.print("\tlabel: ");
      if (hp.setLabel(iLabel))
      {
         System.out.print("\n\tedge: ");
         iEdge = Double.parseDouble(userInput.nextLine());
         if (iEdge <= 0)
         {
         
            System.out.println("\nError: edge must be greater than zero.");
            return;
         }
         else
         {
            System.out.print("\n\theight: ");
            iHeight = Double.parseDouble(userInput.nextLine());
            if (iHeight <= 0)
            {
               System.out.println("\nError: height must be greater than zero.");
               return;
            }
            else
            {
               hp.setLabel(iLabel);
               hp.setEdge(iEdge);
               hp.setHeight(iHeight);
               hp.lateralSurfaceArea();
               hp.baseArea();
               hp.surfaceArea();
               hp.volume();
               System.out.println("\n\n" + hp);
            }
         }
      }
   }
}        
 

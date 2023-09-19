import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Program that is comosed of three classes in which the third class prints
* the summary information of list of objects.
* 
* Project_5.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/23/22
*/
public class HexagonalPrismListApp
{
 /**
    * Prints the file name, list of objects and summary information.
	 * @throws FileNotFoundException for scanner
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) throws FileNotFoundException
   {
      
      // first scanner object to scan file name from keyboard
      Scanner userInput = new Scanner(System.in);
      ArrayList<HexagonalPrism> objectList;
      objectList = new ArrayList<HexagonalPrism>();
      
      // initialising all the variables
      double edge = 0;
      double height = 0;
      String input;
      String label;
      String listName;
      String nameOfFile;
      
      // prompts the user to enter the file name
      System.out.print("Enter file name: ");
      nameOfFile = userInput.nextLine();
      
      // second scanner object to read the data from the file
      Scanner scanFile = new Scanner(new File(nameOfFile));
      
      // reads the list name from the file
      listName = scanFile.nextLine();
      while (scanFile.hasNext())
      {
         // reads label, edge and height from the file
         label = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         // creating HexagonalPrism object
         HexagonalPrism hp = new HexagonalPrism(label, edge, height);
         
         // adding hexagonal prism object to the list
         objectList.add(hp);
      }
      
      // creating another object with name of list and the list
      HexagonalPrismList finalList = 
            new HexagonalPrismList(listName, objectList);
      System.out.println("\n" + finalList + "\n");
      System.out.println(finalList.summaryInfo());
   }
}
    
   
      

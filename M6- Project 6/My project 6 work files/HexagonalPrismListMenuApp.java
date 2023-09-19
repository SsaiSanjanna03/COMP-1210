import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
* Program that is composed of three classes in which the first class defines
* objects, the second class defines the list of objects and the third class
* presents a menu to the user with eight options and implements the choosen
* option.
* 
* Project_6.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/30/22
*/
public class HexagonalPrismListMenuApp
{
/**
 * Presents a menu to the user and prints accordingly with the chosen option.
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      String menuName = "no list name";
      ArrayList<HexagonalPrism> hexList = new ArrayList<HexagonalPrism>();
      HexagonalPrismList hpL = new HexagonalPrismList(menuName, hexList);
      String nameFile = "no file name";
      
      String label;
      double edge, height;   
      
      String choice = "";
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("HexagonalPrism List System Menu\n"
                       + "R - Read File and Create HexagonalPrism List\n"
                       + "P - Print HexagonalPrism List\n" 
                       + "S - Print Summary\n"
                       + "A - Add HexagonalPrism\n"   
                       + "D - Delete HexagonalPrism\n"   
                       + "F - Find HexagonalPrism\n"
                       + "E - Edit HexagonalPrism\n"
                       + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = input.nextLine();
         if (choice.length() == 0) {
            continue;
         }
         choice = choice.toUpperCase();
         char choiceChar = choice.charAt(0);
         switch(choiceChar) {
            case 'R': // Read File and Create HexagonalPrism List
               System.out.print("\tFile name: ");
               nameFile = input.nextLine();
            
               hpL = hpL.readFile(nameFile);
            
               System.out.println("\tFile read in and "
                              + "HexagonalPrism List created\n");
               break; 
                    
            case 'P': // Print HexagonalPrism List
               System.out.println("\n" + hpL);
               break;
               
            case 'S': // Print Summary
               System.out.println("\n" + hpL.summaryInfo() + "\n");
               break;
                      
            case 'A': // Add HexagonalPrism
               System.out.print("\tLabel: ");
               label = input.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(input.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(input.nextLine());
            
               hpL.addHexagonalPrism(label, edge, height);
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;   
               
            case 'D': // Delete HexagonalPrism
               System.out.print("\tLabel: ");
               label = input.nextLine();
               
               if (hpL.deleteHexagonalPrism(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;   
                  
            case 'F': // Find HexagonalPrism
               System.out.print("\tLabel: ");
               label = input.nextLine();
               
               HexagonalPrism hp = hpL.deleteHexagonalPrism(label);
               if (hp != null) {
                  System.out.println(hp + "deleted\n");
               }
               else {
                  System.out.println("\t\"Not A Real Label\" not found\n");
               }
               break;   
            
            case 'E': // Edit HexagonalPrism
               System.out.print("\tLabel: ");
               label = input.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(input.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(input.nextLine());
              
               if (hpL.editHexagonalPrism(label, edge, height))
               {
                  System.out.println("\t\"" 
                     + hpL.findHexagonalPrism(label).getLabel()
                      + "\" successfully edited\n");
               }
               else
               {
                  System.out.println("\t\"" + label + "\" not found\n");
                  
               }
               break;
               
            case 'Q': //Quit
            
               break;
            
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***\n"); 
               break; 
         }
         
      
      } while (!choice.equalsIgnoreCase("Q"));   
      
   }
}
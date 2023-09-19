import java.io.FileNotFoundException; 
/**
* This program is the part-2 of Bakery project.
* This program contains a class that represents a list of baked items and
* several specialised methods and a main method to run the whole program
*
* Project_10.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/14/22
*/

public class BakeryPart2 { //Main method to print all the reports
   
   /**
    * Prints all reports..
	 * @throws FileNotFoundException for scanner
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) throws FileNotFoundException {
      // If no file name is provided in command line arguments
      if (args.length == 0) { 
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else { // If file name is provided in command line arguments
         // Creating an instance of BakedItemList
         BakedItemList bakedList = new BakedItemList();
         bakedList.readItemFile(args[0]); // Reads in file name 
         // Prints report with original order
         System.out.println(bakedList.generateReport());
         // Prints report with natural order
         System.out.println(bakedList.generateReportByClass());
         // Prints price sorted report
         System.out.println(bakedList.generateReportByPrice());
         // Prints flavor sorted report
         System.out.println(bakedList.generateReportByFlavor());
         // Prints report with excluded objects
         System.out.println(bakedList.generateExcludedRecordsReport());
      }
   }
}





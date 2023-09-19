import java.io.FileNotFoundException; 
/**
* This program is the part-3 of Bakery project.
* This program contains a class that represents a list of baked items and
* several specialised methods and a main method to run the whole program.
* In this project, we use try-catch statements to handle exceptions.
*
* Project_11.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/18/22
*/

public class BakeryPart3 { //Main method to print all the reports

/**
    * Uses try-catch statement to handle when an input file is not found.
    * Prints all reports when input file is found
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
      
      try { // Executes when input file is found
         
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
      
      // A catch statement to handle when the input file is not found
      catch (FileNotFoundException fileException) { 
         System.out.println("Attempted to read file: " + args[0]
               + " (No such file or directory)");
         System.out.println("Program ending.");
      }
   }
}

      

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;

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

//Class providing methods for reading in data file and generating reports
public class BakedItemList { 
   
   /**
     * Creating instance variables and a static variable.
     * @param args Command line arguments (not used).
     */
   private String listName; // List name
   private BakedItem[] itemList; // Array that holds BakedItem objects
   private int itemCount; // Number of BakedItem objects in array
   private String[] excludedRecords; // Array that holds unprocessed objects
   private int excludedCount; // Number of unprocessed objects in array
   private static int listCount = 0; // Number of bakedItemList objects created
   
   /**
      * Constructor takes no parameters, but initializes instance fields.
      */
   // Constructor
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100]; //Size of array --> 100
      itemCount = 0;
      excludedRecords = new String[30]; //Size of array --> 30
      excludedCount = 0;
      listCount++; // Incrementing number of bakedItemList objects
   }
   
   // Methods
   /**
      * Creating a method to get name of the list.
      * @return list's name
      */
   public String getListName() {
      return listName;
   }
  
  /**
      * Creating a method to set name of the list as given parameter.
      * @param listNameIn for listName
      */
   public void setListName(String listNameIn) {
      listName = listNameIn; // sets listName as listNameIn
   }
   
   /**
      * Creating a method to get the array of BakedItem objects.
      * @return array
      */
   public BakedItem[] getItemList() {
      return itemList;
   }
   
   /**
      * Creating a method to set array of BakedItem objects as given parameter.
      * @param itemListIn for itemList
      */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn; // sets itemList as itemListIn
   }
   
   /**
      * Creating a method to get number of objects in list.
      * @return count of objects
      */
   public int getItemCount() {
      return itemCount;
   }
   
   /**
      * Creating a method to set number of objects in list as given parameter.
      * @param itemCountIn for itemCount
      */
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn; // sets itemCount as itemCountIn
   }
   
   /**
      * Creating a method to get the array holding unprocessed objects.
      * @return array of excluded objects
      */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
      * Creating a method to set array of unprocessed objects as given
      * parameter.
      * @param excludedRecordsIn for excludedRecords
      */
   public void setExcludedRecords(String[] excludedRecordsIn) {
      // sets excludedRecords as excludedRecordsIn
      excludedRecords = excludedRecordsIn; 
   }
   
   /**
      * Creating a method to get number of unprocessed objects in the list.
      * @return count of excluded objects
      */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
      * Creating a method to set number of unprocessed objects in the list 
      * as given parameter.
      * @param excludedCountIn for excludedCount
      */
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   
   /**
      * Creating a method to get number of BakedItemList objects.
      * @return count of BakedItemListobjects
      */
   public static int getListCount() {
      return listCount;
   }
   
   /**
      * Creating a method to reset number of BakedItemList objects to 0.
      */
   public static void resetListCount() {
      listCount = 0; 
   }
    
    /**
      * Creating a method to read a file whose name is given as 
      * command line argument.For each valid category read in, 
      * a new baked item object is created and added to list.
      * This method uses try-catch statements to handle exceptions that
      * occured for each incorrect line scanned
      * 
      * @param dataFileIn for name of the file
      * @throws FileNotFoundException when the corresponding file of
      * input fileName is not found
      */
   public void readItemFile(String dataFileIn) 
      throws FileNotFoundException
   {
      // Creating a scanner object to read in the file and then 
      // reads the file line by line
      Scanner dataScan = new Scanner(new File(dataFileIn));
      listName = dataScan.nextLine(); // Reads name of list(1st line in file)
      
      while (dataScan.hasNext()) { // When file has next line
         
         String line = dataScan.nextLine(); // Reads the second line
         // Creating a second scanner to read through the line 
         // using ',' to separate terms
         Scanner lineScan = new Scanner(line).useDelimiter(",");
         
         String category = lineScan.next().substring(0, 1); // 1st character
         String bakedName = ""; //Name of the item baked
         String flavor = ""; // Flavor of the item baked
         int quantity = 0;  // The quantity of the item baked
         String[] ingredients = new String[50]; // Array of ingredients
         double crustCost = 0; // Cost of each crust in a Pie
         int layers = 0; // Number of layers of a cake
         int tiers = 0; // Number of tiers of a Wedding cake
         int numIngs = 0; // Number of ingredients in each bakedItem
         
         try { // Including a try statement which executes when nothing 
         // invalid is scanned
            switch (category) { // Using switch to check for valid categories
            // 'C', 'P', 'K', 'W' --> Valid categories
               
               case "C":
                  bakedName = lineScan.next(); 
                  flavor = lineScan.next();
                  quantity = Integer.parseInt(lineScan.next());
                  String[] ingsCookie = {}; // Empty array of cookie ingredients
                  while (lineScan.hasNext()) // Reads in ingredients
                  {
                     ingredients[numIngs] = lineScan.next(); 
                     numIngs++;
                  }            
               // Creating a copy of ingredients array with 
               // number of ingredients
                  ingsCookie = Arrays.copyOf(ingredients, numIngs);
               // Creating an instance of Cookie class(BakedItem object)
                  BakedItem cookie = new Cookie(bakedName, flavor, quantity,
                     ingsCookie);
                  itemList[itemCount] = cookie; // Adding object to list
                  itemCount++; // Incrementing count of list objects
                  break;
               
               case "P": 
                  bakedName = lineScan.next(); 
                  flavor = lineScan.next();
                  quantity = Integer.parseInt(lineScan.next());
                  crustCost = Double.parseDouble(lineScan.next());
                  String[] ingsPie = {}; // Empty array of pie ingredients
                  while (lineScan.hasNext()) // Reads in ingredients
                  {
                     ingredients[numIngs] = lineScan.next();
                     numIngs++;
                  }              
               // Creating a copy of ingredients array with 
               // number of ingredients
                  ingsPie = Arrays.copyOf(ingredients, numIngs);
               // Creating an instance of Cookie class(BakedItem object)
                  BakedItem pie = new Pie(bakedName, flavor, quantity,
                      crustCost, ingsPie);
                  itemList[itemCount] = pie; // Adding object to list
                  itemCount++; // Incrementing count of list objects
                  break;
              
               case "K":
                  bakedName = lineScan.next(); 
                  flavor = lineScan.next();
                  quantity = Integer.parseInt(lineScan.next());
                  String[] ingsCake = {}; // Empty array of cake ingredients
                  layers = Integer.parseInt(lineScan.next());
                  while (lineScan.hasNext()) // Reads in ingredients
                  {
                     ingredients[numIngs] = lineScan.next();
                     numIngs++; 
                  }              
               // Creating a copy of ingredients array with 
               // number of ingredients
                  ingsCake = Arrays.copyOf(ingredients, numIngs);
               // Creating an instance of Cookie class(BakedItem object)
                  BakedItem cake = new Cake(bakedName, flavor, quantity, layers,
                     ingsCake);
                  itemList[itemCount] = cake; // Adding object to list
                  itemCount++; // Incrementing count of list objects
                  break;
               
               case "W":
                  bakedName = lineScan.next(); 
                  flavor = lineScan.next();
                  quantity = Integer.parseInt(lineScan.next());
                  layers = Integer.parseInt(lineScan.next());
                  tiers = Integer.parseInt(lineScan.next());
                  String[] ingsWedCake = {}; // Empty array of cake ingredients
                  while (lineScan.hasNext()) // Reads in ingredients
                  {
                     ingredients[numIngs] = lineScan.next();
                     numIngs++;
                  
                  }              
               // Creating a copy of ingredients array with 
               // number of ingredients
                  ingsWedCake = Arrays.copyOf(ingredients, numIngs);
               // Creating an instance of Cookie class(BakedItem object)
                  BakedItem weddingCake = new WeddingCake(bakedName, flavor,
                     quantity, layers, tiers, ingsWedCake);
                  itemList[itemCount] = weddingCake; // Adding object to list
                  itemCount++; // Incrementing count of list objects
                  break;
               
               default: // If no valid category is found
               // Throws an invalid category exception defined in separate class
                  throw new InvalidCategoryException(category);
            }
         }
         
         // A catch statement to handle when an invalid category is scanned
         catch (InvalidCategoryException categoryException) {
            // Adds the corresponding line to the excluded records array
            excludedRecords[excludedCount] = "*** " + categoryException
                + " in:\n" + line;
            excludedCount++; // Increments number of excluded objects
         }
         
         // A catch statement to handle when a line has valid category but has 
         // invalid numeric data (if quantity has alphabetical character)
         // This is automatically thrown by JRE
         catch (NumberFormatException numberException) { 
           // Adds the corresponding line to the excluded records array
            excludedRecords[excludedCount] = "*** " + numberException
                + " in:\n" + line;
            excludedCount++; // Increments number of excluded objects
         }
         
         // A catch statement to handle when a line has valid category 
         // but has missing data.
         // This is automatically thrown by JRE
         catch (NoSuchElementException elementException) {
            // Adds the corresponding line to the excluded records array
            excludedRecords[excludedCount] = "*** " + elementException
                + " in:\n" + line;
            excludedCount++; // Increments number of excluded objects
         }
      }
   
   }
      
   /**
      * Creating a method to generate a Bakery report with the 
      * original order of items from the file.
      * @return original order of items from list
      */
   public String generateReport() {
      String report = "";
      report += "\n---------------------------------------\n"; 
      report += "Report for " + listName + "\n"; 
      report += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) { // Iterating through the list
         report += "\n" + itemList[i] + "\n"; // Adds each item to report
      }
      return report; // Returns the unsorted report as a string
   }
   
   /**
      * Creating a method to generate a Bakery report with the 
      * natural order of items from the file.
      * @return natural order of items from list
      */
   public String generateReportByClass() {
      // Creating a copy of list
      BakedItem[] sortedList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(sortedList); // Sorts the items in the list in natural order
      String reportByClass = "";
      reportByClass += "\n---------------------------------------\n"; 
      reportByClass += "Report for " + listName + " (by Class)\n"; 
      reportByClass += "---------------------------------------\n";
      for (int i = 0; i < sortedList.length; i++) { // Iterating through list
         // Adds each item to report
         reportByClass += "\n" + sortedList[i] + "\n"; 
      }
      return reportByClass; // Returns the sorted report as a string
   }
   
   /**
      * Creating a method to generate a Bakery report with items in 
      * list sorted from lowest to highest prices.
      * @return sorted array
      */
   public String generateReportByPrice() {
      // Creating a copy of list
      BakedItem[] itemByPrice = Arrays.copyOf(itemList, itemCount);
      // Sorts items from lowest to highest prices using PriceComparator
      Arrays.sort(itemByPrice, new PriceComparator());
      String reportByPrice = "";
      reportByPrice += "\n---------------------------------------\n"; 
      reportByPrice += "Report for " + listName + " (by Price)\n"; 
      reportByPrice += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) { // Iterating through the list
         // Adds each item to report
         reportByPrice += "\n" + itemByPrice[i] + "\n"; 
      }
      return reportByPrice; // Returns the sorted report as a string
   }
   
   /**
      * Creating a method to generate a Bakery report with items in 
      * list sorted based on flavor of each item(Alphabetical order, 
      * ignoring case).
      * @return sorted array
      */
   public String generateReportByFlavor() {
      // Creating a copy of list
      BakedItem[] itemByFlavor = Arrays.copyOf(itemList, itemCount);
      // Sorts items using FlavorComparator
      Arrays.sort(itemByFlavor, new FlavorComparator());
      String reportByFlavor = "";
      reportByFlavor += "\n---------------------------------------\n"; 
      reportByFlavor += "Report for " + listName + " (by Flavor)\n"; 
      reportByFlavor += "---------------------------------------\n";
      for (int i = 0; i < itemCount; i++) { // Iterating through the list
         // Adds each item to report
         reportByFlavor += "\n" + itemByFlavor[i] + "\n"; 
      }
      return reportByFlavor; // Returns the sorted report as a string
   }
   
   /**
      * Creating a method to generate a Bakery report with excluded items.
      * @return array containing excluded objects
      */
   public String generateExcludedRecordsReport() {
      String excludedReport = "";
      excludedReport += "\n---------------------------------------\n"; 
      excludedReport += "Excluded Records Report\n"; 
      excludedReport += "---------------------------------------\n";
      for (int i = 0; i < excludedCount; i++) { // Iterating through the list
         // Adds each excluded item to report
         excludedReport += "\n" + excludedRecords[i]; 
      }
      return excludedReport; // Returns the  excluded report as a string
   }
}

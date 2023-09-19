import java.util.ArrayList;
import java.text.DecimalFormat;
/**
* Program that is composed of three classes in which the third class prints
* the summary information of list of objects.
* 
* Project_5.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/23/22
*/
public class HexagonalPrismList
{
/**
     * Initialising instance variables: a string and an array list.
     * @param args Command line arguments (not used).
     */
  // instance variables
   private String name = "";
   private ArrayList<HexagonalPrism> hpList = new ArrayList<HexagonalPrism>();
  /**
      * Constructor takes a value for variable 'number' of type int.
      * @param nameIn for name
      * @param hpListIn for hpList
      */
   // constructor
   public HexagonalPrismList(String nameIn, ArrayList<HexagonalPrism> hpListIn)
   {
      name = nameIn;
      hpList = hpListIn;
   }
   //Creating various methods for the list
   // methods
   /**
      * creates a method to represent the name of the list.
      * @return name
      */
   public String getName()
   {
      return name;
   }
      /**
      * creates a method to represent the number of objects in list.
      * @return number of objects
      */
   public int numberOfHexagonalPrisms()
   {
      int numObjects = hpList.size();
      while (numObjects != 0)
      {
         return numObjects;
      }
      return 0;
   }
      /**
      * creates a method to represent the total surface area of all objects
      * in list.
      * @return total surface area
      */
   public double totalSurfaceArea()
   {
      double tsArea = 0;
      int index = 0;
      while (index < hpList.size())
      {
         tsArea += hpList.get(index).surfaceArea();
         index++;
      }
      return tsArea;
   }
   /**
      * creates a method to represent the total volume of all objects in list.
      * @return total volume
      */
   public double totalVolume()
   {
      double tVolume = 0;
      int index = 0;
      while (index < hpList.size())
      {
         tVolume += hpList.get(index).volume();
         index++;
      }
      return tVolume;
      
   }
   /**
      * creates a method to represent the average surface area for the objects
      * in list.
      * @return average surface area
      */
   public double averageSurfaceArea()
   {
      double avgArea = 0;
      while (numberOfHexagonalPrisms() != 0)
      {
         avgArea = totalSurfaceArea() / numberOfHexagonalPrisms();
         return avgArea;
      }
      return 0;
   }
   /**
      * creates a method to represent the average volume for the objects
      * in list.
      * @return average volume
      */
   public double averageVolume()
   {
      double avgVolume = 0;
      while (numberOfHexagonalPrisms() != 0)
      {
         avgVolume = totalVolume() / numberOfHexagonalPrisms();
         return avgVolume;
      }
      return 0;
   }
   /**
      * creates a method to represent the list name with information      
      * of each object in list.
      * @return result of type string
      */
   public String toString()
   {
      String result = "";
      int i = 0;
      result = "----- " + name + " -----\n";
      while (i < numberOfHexagonalPrisms())
      {
         result += "\n" + hpList.get(i).toString();
         result += "\n";
         i++;
      }
      return result;
   }
   /**
      * creates a method to represent the list name with summary items.
      * @return output of type string
      */
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of HexagonalPrisms: " + numberOfHexagonalPrisms();
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units";
      output += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      return output;
   }
}
   




      
      
   


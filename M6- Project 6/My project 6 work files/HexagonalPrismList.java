import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
   /**
      * creates a method to get the list of HexagonalPrism objects.
      * @return list
      */
   public ArrayList<HexagonalPrism> getList()
   {
      return hpList;
   }
   /**
      * creates a method to read a file whose name is given as input.
      * @param fileNameIn for fileName
      * @throws FileNotFoundException when the corresponding file of
      * input fileName is not found
      * @return HexagonalPrismList object
      */
   public HexagonalPrismList readFile(String fileNameIn) 
      throws FileNotFoundException
   {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      ArrayList<HexagonalPrism> hpObjects = new ArrayList<HexagonalPrism>();
      String hexHPList = "";
      String label = "";
      double edge = 0;
      double height = 0;
      
      name = fileScan.nextLine();
      
      while (fileScan.hasNext())
      {
         label = fileScan.nextLine();
         edge = Double.parseDouble(fileScan.nextLine());
         height = Double.parseDouble(fileScan.nextLine()); 
         HexagonalPrism hp = new HexagonalPrism(label, edge, height);
         hpObjects.add(hp);
      }
      HexagonalPrismList hplistObject = new HexagonalPrismList(name, hpObjects);
      return hplistObject;
   }
   /**
      * creates a method to add a new object to the HexagonalPrismList.
      * @param label1 for label
      * @param edge1 for edge
      * @param height1 for height
      */
   public void addHexagonalPrism(String label1, double edge1, double height1)
   {
      HexagonalPrism hp = new HexagonalPrism(label1, edge1, height1);
      hpList.add(hp);
   }
   /**
      * creates a method to find the object in the list based on the 
      * input label.
      * @param label1 for label
      * @return HexagonalPrismList object if the input label is matched 
      * with already existing label,otherwise return null
      */
   public HexagonalPrism findHexagonalPrism(String label1)
   {
      int index = 0;
      while (index < hpList.size())
      {
         HexagonalPrism hex = hpList.get(index);
         String label2 = hex.getLabel();
         if (label1.equalsIgnoreCase(label2))
         {
            return hpList.get(index);
         }
         index++;
         
      }
      return null;
   }
   /**
      * creates a method to delete the object from the list based on the 
      * input label.
      * @param label1 for label
      * @return HexagonalPrismList object after deleting the corresponding 
      * object of input label, otherwise return null
     */
   public HexagonalPrism deleteHexagonalPrism(String label1)
   {
      int index = 0;
      while (index < hpList.size())
      {
         HexagonalPrism hex = hpList.get(index);
         String label2 = hex.getLabel();
         if (label1.equalsIgnoreCase(label2))
         {
            
            hex = hpList.remove(index);
            return hex;
         }
         index++;
         
      }
      return null;
   }
   /**
      * creates a method to edit the object in the list.
      * @param label1 for label
      * @param edge1 for edge
      * @param height1 for height
      * @return true if input label is matched, otherwise return false
      */
   public boolean editHexagonalPrism(String label1, double edge1, 
      double height1)
   {
      boolean result = false;
      int index = 0;
      while (index < hpList.size())
      {
         HexagonalPrism hex = hpList.get(index);
         String label2 = hex.getLabel();
         if (label1.equalsIgnoreCase(label2))
         {
            hex.setEdge(edge1);
            hex.setHeight(height1);
            result = true;
         }
         index++;
         
      }
      return result;
   }
}
   




      
      
   


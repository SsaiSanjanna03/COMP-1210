import java.text.DecimalFormat;
 /**
* Program that contains four classes: The first represents a RingTorus object, 
* the second one is a JUnit test class for RingTorus class,
* the third one represents a list of RingTorus objects,
* and the fourth is a JUnit test class for RingTorusList class.
* 
* Project_8.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/28/22
*/
public class RingTorusList {
/**
     * Initialising instance variables and class variables.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables
   private String listName;
   private RingTorus[] rtList;
   private int numObjects;
   
   /**
      * constructor takes a string, an array and a int.
      * @param listNameIn for listNsme
      * @param rtListIn for rtList
      * @param numObjectsIn for numObjects
      */
   // constructor
   public RingTorusList(String listNameIn, RingTorus[] rtListIn, 
      int numObjectsIn) {
      listName = listNameIn;
      rtList = rtListIn;
      numObjects = numObjectsIn;
   }
   
   // methods
  /**
      * creating a method to get name of list of type String.
      * @return listName
      */
   public String getName() {
      return listName;
   }
   
    /**
      * creating a method to represent number of RingTorus objects in list.
      * @return number of RingTorus objects
      */
   public int numberOfRingToruses() {
      return numObjects;
   }
   
   /**
      * creating a method to represent the total diameters for all objects
      * in list.
      * @return sum of diameters
      */
   public double totalDiameter() {
      double objDiameter = 0;
      double sumDiameters = 0;
      int index = 0;
      if (numObjects > 0) {
         while (index < numObjects) {
            RingTorus torusObj = rtList[index];
            objDiameter = torusObj.diameter();
            sumDiameters += objDiameter;
            index++;
         }
      }
      return sumDiameters;
   
   }
    
    /**
      * creating a method to represent the total surface areas for all objects
      * in list.
      * @return sum of surface areas
      */
   public double totalSurfaceArea() {
      double objArea = 0;
      double sumAreas = 0;
      int index = 0;
      if (numObjects > 0) {
         while (index < numObjects) {
            RingTorus torusObj = rtList[index];
            objArea = torusObj.surfaceArea();
            sumAreas += objArea;
            index++;
         }
      }
      return sumAreas;
   }
   
    /**
      * creating a method to represent the total volume for all objects
      * in list.
      * @return sum of volumes
      */
   public double totalVolume() {
      double objVolume = 0;
      double sumVolumes = 0;
      int index = 0;
      if (numObjects > 0) {
         while (index < numObjects) {
            RingTorus torusObj = rtList[index];
            objVolume = torusObj.volume();
            sumVolumes += objVolume;
            index++;
         }
      }
      return sumVolumes;
   }
   
    /**
      * creating a method to represent the average diameter for all objects
      * in list.
      * @return average of diameters
      */
   public double averageDiameter() {
      double avgDiameter = 0;
      if (numObjects != 0) {
         avgDiameter = totalDiameter() / numberOfRingToruses();
         return avgDiameter;
      }
      return 0;
   }
   
    /**
      * creating a method to represent the average surface area for all objects
      * in list.
      * @return average of surface areas
      */
   public double averageSurfaceArea() {
      double avgArea = 0;
      if (numObjects != 0) {
         avgArea = totalSurfaceArea() / numberOfRingToruses();
         return avgArea;
      }
      return 0;  
   }
   
    /**
      * creating a method to represent the average volume for all objects
      * in list.
      * @return average of volumes
      */
   public double averageVolume() {
      double avgVolume = 0;
      if (numObjects != 0) {
         avgVolume = totalVolume() / numberOfRingToruses();
         return avgVolume;
      }
      return 0;  
   }
    
    /**
      * creating a method to represent information about the RingTorus list
      * such as name of list, number of objects in it, total and average  
      * diameter, total and average surface area, total and average of volume.
      * @return output string
      */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of RingToruses: " + numberOfRingToruses();
      output += "\nTotal Diameter: " + df.format(totalDiameter()) + " units";   
      output += "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units";
      output += "\nTotal Volume: " + df.format(totalVolume()) 
         + " cubic units";
      output += "\nAverage Diameter: " + df.format(averageDiameter())
         + " units"; 
      output += "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + df.format(averageVolume()) 
         + " cubic units";
      return output;
   }
   
    /**
      * creating a method to get the array list of RingTorus objects.
      * @return array list
      */
   public RingTorus[] getList() {
      return rtList;
   }
    
    /**
      * creating a method to add a new RingTorus object to the array list.
      * @param label1 for label
      * @param largeRadius1 for largeRadius
      * @param smallRadius1 for smallRadius 
      */
   public void addRingTorus(String label1, double largeRadius1, 
         double smallRadius1) {
      RingTorus torusObj = new RingTorus(label1, largeRadius1, smallRadius1); 
      rtList[numObjects] = torusObj;
      numObjects++;
   }
    
    /**
      * creating a method to find the corresponding RingTorus object from list.
      * @param label1 for label
      * @return RingTorus object
      */
   public RingTorus findRingTorus(String label1)
   {
      int index = 0;
      while (index < numObjects)
      {
         RingTorus torus = rtList[index];
         String label2 = torus.getLabel();
         if (label1.equalsIgnoreCase(label2))
         {
            return rtList[index];
         }
         index++;  
      }
      return null;
   }
    
    /**
      * creating a method to delete the corresponding RingTorus object 
      * from list.
      * @param label1 for label
      * @return RingTorus object
      */
   public RingTorus deleteRingTorus(String label1) {
      RingTorus torusDelete = null;
      for (int i = 0; i < numObjects; i++) {
         if (rtList[i].getLabel().equalsIgnoreCase(label1)) {
            torusDelete = rtList[i];
            for (int j = i; j < numObjects - 1; j++) {
               rtList[j] = rtList[j + 1];
            }
            rtList[numObjects - 1] = null;
            numObjects--;
         }
      }
      return torusDelete;
   }
   
    /**
      * creates a method to edit the object in the list.
      * @param label1 for label
      * @param largeRadius1 for largeRadius
      * @param smallRadius1 for smallRadius
      * @return true if input label is matched, otherwise return false
      */
   public boolean editRingTorus(String label1, double largeRadius1, 
      double smallRadius1) {
      boolean result = false;
      int index = 0;
      while (index < numObjects)
      {
         RingTorus torusEdit = rtList[index];
         String label2 = torusEdit.getLabel();
         if (label1.equalsIgnoreCase(label2))
         {
            torusEdit.setLargeRadius(largeRadius1);
            torusEdit.setSmallRadius(smallRadius1);
            result = true;
         }
         index++;  
      }
      return result;
   }
    
    /**
      * creating a method to find the object with largest volume.
      * @return RingTorus object
      */
   public RingTorus findRingTorusWithLargestVolume() {
      
      if (numObjects > 0) {
         RingTorus largeVolumeObj = rtList[0];
         for (int i = 0; i < numObjects; i++) {
            if (largeVolumeObj.volume() <= rtList[i].volume()) {
               largeVolumeObj = rtList[i];
            }
         }
         return largeVolumeObj; 
      }
      return null;
   }
}



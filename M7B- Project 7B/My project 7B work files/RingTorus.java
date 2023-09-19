import java.text.DecimalFormat;
 /**
* Program that contains two classes: First class represents a RingTorus object,
* implements comparable interface for object of type RingTorus and the
* second class is build with set of test methods which includes method, 
* statement and conditional coverage for each emthod in RingTorus class.
* 
* Project_7B.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/21/22
*/
public class RingTorus implements Comparable<RingTorus> {
/**
     * Initialising instance variables and class variables.
     * @param args Command line arguments (not used).
     */
   
   // Instance variables
   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   
   // Class variable
   // number of RingTorus objects
   private static int count = 0;
   
   /**
      * constructor takes a string and two double values as parameters.
      * @param labelIn for label
      * @param largeRadiusIn for largeRadius
      * @param smallRadiusIn for smallRadius
      */
   // constructor
   public RingTorus(String labelIn, double largeRadiusIn, double smallRadiusIn) 
   {
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      // count is increased by 1, each time a RingTorus object is constructed
      count++;
   }
   
   // methods
  /**
      * creating a method to get label of type string.
      * @return label
      */
   public String getLabel() {
      return label;
   }
   
   /**
      * creating a method to set the string label.
      * @param labelIn for label
      * @return true if labelIn is not null, otherwise false
      */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         // sets trimmed string labelIn to label
         label = labelIn.trim();
         return true;
      }
      // if string labelIn is null then label is not set
      return false;
   }
   
   /**
      * creating a method to get large radius.
      * @return large radius
      */
   public double getLargeRadius() {
      return largeRadius;
   }
   
   /**
      * creating a method to set largeRadius of type double.
      * @param largeRadiusIn for largeRadius
      * @return true if largeRadiusIn is positive and greater than 
      * current small radius, otherwise false
      */
   public boolean setLargeRadius(double largeRadiusIn) {
      if (largeRadiusIn > 0 && largeRadiusIn > smallRadius) {
         // sets largeRadiusIn to largeRadius
         largeRadius = largeRadiusIn;
         return true;
      }
      // if largeRadiusIn is negative or is less than small radius
      // largeRadius is not set
      return false;
   }
   
   /**
      * creating a method to get small radius.
      * @return small radius
      */
   public double getSmallRadius() {
      return smallRadius;
   }
   
   /**
      * creating a method to set the smallradius of type double.
      * @param smallRadiusIn for smallRadius
      * @return true if smallRadiusIn is positive and less than 
      * current large radius, otherwise false
      */
   public boolean setSmallRadius(double smallRadiusIn) {
      if (smallRadiusIn > 0 && smallRadiusIn < largeRadius) {
         // sets smallRadiusIn to smallRadius
         smallRadius = smallRadiusIn;
         return true;
      }
      // if smallRadiusIn is negative or is less than large radius
      // smallRadius is not set
      return false;
   }
  
   /**
      * creating a method to calculate diamter of the object.
      * @return diameter
      */
   public double diameter() {
      // diameter = 2(R + r)
      double diameter = 2 * (largeRadius + smallRadius);
      return diameter;
   }
   
   /**
      * creating a method to calculate surface area of the object.
      * @return surface area
      */
   public double surfaceArea() {
      // surface area = (2.Pi.R)(2.Pi.r)
      double surfaceArea = (2 * Math.PI * largeRadius)
         * (2 * Math.PI * smallRadius);
      return surfaceArea;
   }
   
   /**
      * creating a method to calculate volume of the object.
      * @return volume
      */
   public double volume() {
      // volume = (2.Pi.R)(Pi.r^2)
      double volume = (2 * Math.PI * largeRadius)
         * (Math.PI * Math.pow(smallRadius, 2));
      return volume;
   }
  
  /**
      * creating a method to represent information about the RingTorus object
      * such as label, large radius, small radius, diameter, surface area
      * and volume.
      * @return output string
      */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "RingTorus \"" + label + "\"\n\t";
      output += "large radius = " + df.format(largeRadius) + " units\n\t";
      output += "small radius = " + df.format(smallRadius) + " units\n\t";
      output += "diameter = " + df.format(diameter()) + " units\n\t";
      output += "surface area = " + df.format(surfaceArea()) + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units\n";
      return output;
   }
   
   /**
      * creating a method to get number of RingTorus objects.
      * @return count
      */
   public static int getCount() {
      return count;
   }
 
 /**
      * creating a method to reset number of RingTorus objects.
      */
   public static void resetCount() {
      // number of objects sets to zero
      count = 0;
   }
   
   /**
     * creating an instance method that takes an Object.
     * @param obj for Object
     * @return false if parameter of object is not a RingTorus object
     * otherwise true
   */
   public boolean equals(Object obj) {
      // if object taken at instance is not a RingTorus object
      if (!(obj instanceof RingTorus)) {
         return false;
      }
      else {
         // creating an instance object equal to a RingTorus object
         RingTorus rt = (RingTorus) obj;
         return (label.equalsIgnoreCase(rt.getLabel())
                && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001)
                && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001));
      }
   }
   
   /**
    * creating a method which is used only when equals method is implemented.
    * @return zero
   */
   public int hashCode() {
      return 0;
   }
   
   /**
      * creating a compareTo method to compare objects between 
      * a RingTorus object and any other object which is of type RingTorus.
      * @param obj for any other object
      * @return -1 or 1 or 0 based on conditions mentioned
      */
   public int compareTo(RingTorus obj) {
   
   // if RingTorus object's volume is less than 
   // volume of the object taken as paramter
      if (this.volume() < obj.volume()) {
         // returns the negative integer '-1'
         return -1;
      }
      
      // if RingTorus object's volume is greater than
      // volume of the object taken as paramter   
      else if (this.volume() > obj.volume()) {
         // returns the positive integer '1'
         return 1;
      }
      
      // if RingTorus object's volume is equal to 
      // volume of object taken as paramter 
      else {
         // returns the integer '0'
         return 0;
      }
   }
}

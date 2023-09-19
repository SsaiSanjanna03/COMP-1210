import java.text.DecimalFormat;
/**
* Program to create two classes in which the first class defines right regular
 hexagonal prism objects and the other reads in data and prints the object.
* 
* Project_4.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/16/22
*/
public class HexagonalPrism 
{
/**
     * Initialising instance variables.
     * @param args Command line arguments (not used).
     */
  // instance variables
   private String label = " ";
   private double edge = 0;
   private double height = 0;
   /**
     * creates a blank constructor.
     */
   public HexagonalPrism()
   {
   }
  // constructor
   /**
     * Creates the hexagonal prism.
     * @param labelIn for string label
     * @param edgeIn for double edge
     * @param heightIn for double height
     */
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn)
   {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
  // methods
  /**
    * creates a method to return label.
    * @return get location
    */
   public String getLabel()
   {
      return label;
   }
  /**
    * creates a method to set a label.
    * @param labelIn for string label
    * @return isSet-as true if label is not null, otherwise as false
    */
   public boolean setLabel(String labelIn)
   {
      if (labelIn != null)
      {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
  /**
    * creates a method to get edge.
    * @return edge value
    */ 
   public double getEdge()
   {
      return edge;
   }
  /**
    * creates a method to set edge.
    * @param edgeIn for double edge
    * @return isSet-as true if edge is > 0, otherwise as false
    */
   public boolean setEdge(double edgeIn)
   {
      if (edgeIn > 0)
      {
         edge = edgeIn;
         return true;
      }
      return false;
   }
  /**
    * creates a method to get height.
    * @return height
    */
   public double getHeight()
   {
      return height;
   }
 /**
    * creates a method to set height.
    * @param heightIn for double height
    * @return isSet-as true if height is > 0, otherwise as false
    */
   public boolean setHeight(double heightIn)
   {  
      if (heightIn > 0)
      {
         height = heightIn;
         return true;
      }
      return false;
   }
 /**
    * creates a method to get surface area.
    * @return surface
    */
   public double surfaceArea()
   {
      return ((6 * getEdge() * getHeight()) 
         + (3 * Math.sqrt(3) * Math.pow(getEdge(), 2)));
   }
 /**
    * creates a method to get lateral surface area.
    * @return lateral surface area
    */
   public double lateralSurfaceArea()
   {
      return (6 * getEdge() * getHeight());
   }
 /**
    * creates a method to get base area.
    * @return base area
    */
   public double baseArea()
   {
      return (3 * Math.sqrt(3) * getEdge() * getEdge() * 0.5);
   }
 /**
    * creates a method to get volume.
    * @return volume
    */
   public double volume()
   {
      return (3 * Math.sqrt(3) * getEdge() * getEdge() * getHeight() * 0.5);
   }
   /**
    * creates a method to convert output to string.
    * @return output
    */
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "HexagonalPrism \"" + (getLabel()) + "\" has 8 faces, "
         + "18 edges, and 12 vertices.";
      output += "\n\tedge = " + df.format(edge) + " units";
      output += "\n\theight = " + df.format(height) + " units";
      output += "\n\tlateral surface area = " 
         + df.format(lateralSurfaceArea()) + " square units";
      output += "\n\tbase area = " 
         + df.format(baseArea()) + " square units";
      output += "\n\tsurface area = " 
         + df.format(surfaceArea()) + " square units";
      output += "\n\tvolume = " 
         + df.format(volume()) + " cubic units";
      return output;
   }
}








     
      
      

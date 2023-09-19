import java.util.ArrayList;
/**
* Program that includes two classes in which the first class holds data 
* regarding temperatures while the second class allows users to interact 
* with the data in first class.
* 
* Activity_6.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/26/22
*/
public class Temperatures
{
/**
     * Initialising instance variable of type ArrayList with generic integer.
     * @param args Command line arguments (not used).
     */
  // instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   /**
      * Constructor takes an ArrayList of type int.
      * @param temperaturesIn for temperatures
      */
   // constructor
   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   //Creating various methods for the list
   // methods
   /**
      * creates a method to get the low temperature of type int.
      * @return 0 if list is empty, otherwise low temperature
      */
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
      * creates a method to get the high temperature of type int.
      * @return 0 if list is empty, otherwise high temperature
      */
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp: temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
      return high;
   }
    /**
      * creates a method to get the minimum temperature in the list.
      * @param lowIn for minimum
      * @return minimum temperature
      */
   public int lowerMinimum(int lowIn)
   {
   // checks whether given parameter is lower than getLowTemp()
   // if true: minimum temperature is given parameter
   // if false: minimum temperature is getLowTemp() 
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
     * creates a method to get the maximum temperature in the list.
      * @param highIn for maximum
      * @return maximum temperature
      */
   public int higherMaximum(int highIn)
   {
   // checks whether given parameter is higher than getHighTemp()
   // if true: maximum temperature is given parameter
   // if false: maximum temperature is getHighTemp() 
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
     * creates a method to represent low and high temperatures in the list.
     * @return type string
     */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}


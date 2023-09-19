import java.util.Comparator;
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

// Comparator interface for BakedItem objects to order it's items based
// on alphabetical order of flavor
public class FlavorComparator implements Comparator<BakedItem> {
   /**
      * creating a compare method to order two BakedItem objects in
      * alphabetical order of their flavor.
      * @param b1 for first BakedItem object
      * @param b2 for second BakedItem object
      * @return -1 or 1 or 0 indicating the lowest to highest order
      */

   public int compare(BakedItem b1, BakedItem b2) {
      // Converting all to lower case to ignore 'Case errors' 
      return b1.getFlavor().toLowerCase().
         compareTo(b2.getFlavor().toLowerCase()); 
   }
}
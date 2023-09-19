import java.util.Comparator;
/**
* This program is the part-2 of Bakery project.
* This program contains a class that represents a list of baked items and
* several specialised methods and a main method to run the whole program
*
* Project_10.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 11/14/22
*/

// Comparator interface for BakedItem objects to order it's items 
// from lowest to highest prices
public class PriceComparator implements Comparator<BakedItem> {
   
   /**
      * creating a compare method to order two BakedItem objects from 
      * lowest to highest based on price.
      * @param b1 for first BakedItem object
      * @param b2 for second BakedItem object
      * @return -1 or 1 or 0 indicating the lowest to highest order
      */
   public int compare(BakedItem b1, BakedItem b2) {
      double b1Price = b1.price();
      double b2Price = b2.price();
      if (Math.abs(b1Price - b2Price) < 0.00001) { // When prices are equal
         return 0;
      }
      else if (b1Price < b2Price) { // When b1 has lesser price than b2
         return -1;
      }
      else { // when b1 has greater price than b2
         return 1;
      }
   }
}

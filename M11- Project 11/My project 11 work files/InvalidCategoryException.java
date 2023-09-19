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

// User defined exception extending the exception class
// This is thrown and caught in readItemFile method in BakedItemList class
// when a line has an invalid character
public class InvalidCategoryException extends Exception {

/**
      * Constructor takes String 'category' as parameter.
      * @param category for category defined in BakedItemList class
      */
   // Constructor
   public InvalidCategoryException(String category) {
      // Invokes the super constructor for 'category'
      super("For category: " + "\"" + category + "\"");
   }
}
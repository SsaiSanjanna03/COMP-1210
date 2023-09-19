/**
* Program that contains a class that holds an array of numerical values and
* provide methods that allows users to interact with the Scores class.
* 
* Activity_8.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/24/22
*/
public class Scores {
/**
     * Declaring instance variable.
     * @param args Command line arguments (not used).
     */
   
   // Instance variable --> An array of int values
   private int[] numbers;
   
   /**
      * constructor takes an array of int values as parameter.
      * @param numbersIn for the array-'numbers'
      */
   // constructor
   public Scores(int[] numbersIn) {
      // Assigning numbersIn to the array-'numbers'
      numbers = numbersIn;
   }
   
   // methods
  /**
      * creating a method to find all of the even-valued scores in the array.
      * @return an array of even values from the array-'numbers'
      */
   public int[] findEvens() {
      // numberEvens --> number of even scores
      int numberEvens = 0;
      // iterating through the array to find total number of even scores
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      // creating a new  array of even scored values from the array-'numbers'
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            // Adding the even scores to the array-'evens'
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
      
  /**
      * creating a method to find all of the odd-valued scores in the array.
      * @return an array of odd values from the array-'numbers'
      */
   public int[] findOdds() {
      // numberOdds --> number of odd scores
      int numberOdds = 0;
      // iterating through the array to find total number of odd scores
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      // creating a new  array of even scored values from the array-'numbers'
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            // Adding the odd scores to the array-'odds'
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
      * creating a method to calculate the average of all scores in the array.
      * @return average
      */
   public double calculateAverage() {
      // sum --> sum of all scores in the array-'numbers'
      int sum = 0;
      // iterating through the array to find the total sum of all scores
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      // Changing sum from type 'int' to 'double'
      double total = sum;
      // Changing number of scores from type 'int' to 'double'
      double numScores = numbers.length;
      // Computing average: 'total' divided by 'number of scores'
      return total / numScores;
   }
      
      /**
      * creating a method to represent all scores in the array as a string.
      * @return result
      */
   public String toString() {
      String result = "";
      // iterating through the array from '0' to end
      for (int i = 0; i < numbers.length; i++) {
         // Concatenating all values of numbers to the String result
         result += numbers[i] + "\t";
      }
      return result;
   }
     
      /**
      * creating a method to represent all scores in the array 
      * in reverse order as a string.      
      * @return result in reverse order
      */
   public String toStringInReverse() {
      String result = "";
      // iterating through the array from end to '0'
      for (int i = numbers.length - 1; i > -1; i--) {
         // Concatenating all values of numbers to the String result
         result += numbers[i] + "\t";
      }
      return result;
   }

}


import java.util.Scanner;
import java.text.DecimalFormat;
/**
* Program to accept coded box lunch order as input that includes the theme,
  the number of adult meals, price of adult meal, number of child meals, price 
  of child meal, and name of the customer.
* 
* Project_3.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/09/22
*/
public class BoxLunch
{
/**
     * Prints the user's order information including the total, as well as 
       "lucky number" between 1 and 9999.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      // prompts the user to enter code
      System.out.print("Enter order code: ");
      String orderCode = userInput.nextLine();
      // using if else to check whether length of order code is >= 13 before
      // proceeding further
      if (orderCode.length() >= 13)
      {
         // trims the order code given as input
         orderCode = orderCode.trim(); 
         // splitting adult price into its whole number part and decimal part
         String adultPriceW = orderCode.substring(3, 5);  
         String adultPriceD = orderCode.substring(5, 7);
         // adding a '.' in between whole and decimal part of adult price
         String adultPriceS = adultPriceW + "." + adultPriceD;
         // splitting child price into its whole number part and decimal part
         String childPriceW = orderCode.substring(9, 11);
         String childPriceD = orderCode.substring(11, 13);
         // adding a '.' in between whole and decimal part of child price
         String childPriceS = childPriceW + "." + childPriceD;
         // coverting adult and child prices from type string to type double
         Double adultPrice = Double.parseDouble(adultPriceS);
         Double childPrice = Double.parseDouble(childPriceS);
         // coverting adult price and child price from type string to type int
         int adultMeals = Integer.parseInt(orderCode.substring(1, 3));
         int childMeals = Integer.parseInt(orderCode.substring(7, 9));
         // prints name from the order code given as input
         System.out.println("\nName: " 
            + orderCode.substring(13, orderCode.length()));
         // introducing decimal format for meal prices and total price
         DecimalFormat mp = new DecimalFormat("$#,##0.00");
         // prints number of adult meals and child meals with their 
         //respective prices in above introduced decimal format
         System.out.println("Adult meals: " + adultMeals + " at " 
            + mp.format(adultPrice));
         System.out.println("Child meals: " + childMeals + " at " 
            + mp.format(childPrice));
         // expression for calculating total price
         Double totalPrice = adultMeals * adultPrice 
            + childMeals * childPrice;
         // prints total price in above introduced decimal format
         System.out.println("Total: " + mp.format(totalPrice));
         // converting theme part of string order code to type int 
         int theme = Integer.parseInt(orderCode.substring(0, 1));
         // using if else if else for printing theme
         if (theme == 0)
         {
            System.out.println("Theme: Birthday");
         }
         else if (theme == 1)
         {
            System.out.println("Theme: Graduation");
         }
         else
         {
            System.out.println("Theme: Holiday");
         }
         // introducing decimal format for random lucky number
         DecimalFormat ln = new DecimalFormat("0000");
         // expression for generating a random number between 1 and 9999
         Double luckyNumber = Math.random() * 9999 + 1;
         // prints random lucky number
         System.out.println("Lucky Number: " + ln.format(luckyNumber));         
      }
      // else statement for the first 1st. This executes if length of 
      //order code is below 13
      else
      {
         // prints else statements
         System.out.println("\n*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      }
   }
} 
    
    

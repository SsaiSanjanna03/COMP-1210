/**
* Program to create two classes in which the the second class creates
  instances of first class and calls its methods.   
*
* Activity_4.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/13/22
*/
public class UserInfoDriver
{
/**
     * Prints information such as first name, last name, location, age and
       status of two user: user1 and user2.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args) 
   {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}

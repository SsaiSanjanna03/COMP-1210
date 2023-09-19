/**
* Program to create two classes in which the the second class creates
  instances of first class and calls its methods.
* 
* Activity_4.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 09/13/22
*/
public class UserInfo 
{
/**
     * Creates the UserInfo class.
     * @param args Command line arguments (not used).
     */
  // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
// constructor
   /**
     * Creates the UserInfo class.
     * @param firstNameIn for string firstName
     * @param lastNameIn for string lastName
     */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
// methods
/**
     * Creates the UserInfo class.
     * @return output entered by the user.
     */
   public String toString()
   
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) 
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      return output;
   }
   /**
     * Creates the UserInfo class.
     * @param locationIn for location.     
     */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   /**
     * Creates the UserInfo class.
     * @param ageIn for age.
     * @return isSet.
     */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
     * Creates the UserInfo class.
     * @return age.
     */
   public int getAge()
   {
      return age;
   }
   /**
     * Creates the UserInfo class.
     * @return getlocation.
     */
   public String getLocation()
   {
      return location;
   }
    /**
     * Creates the UserInfo class.
     */
   public void logOff()
   {
      status = OFFLINE;
   }
   /**
     * Creates the UserInfo class.
     */
   public void logOn()
   {
      status = ONLINE;
   }
}

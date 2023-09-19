import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test file that tests whether the methods from 
* RingTorusList class are correct or not.
* 
* Project_8.
* @author Ssai Sanjanna Ganji - COMP 1210-006
* @version 10/28/22
*/ 
public class RingTorusListTest {
  /** Fixture initialization (common initialization
    *  for all tests). 
    **/
   @Before public void setUp() {
   }

/**
   * A test to check getName method. 
   */
   @Test public void getNameTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertEquals("Get Name test: ", "Array List", torusList.getName());
   }
/**
   * A test to check numberOfRingToruses method. 
   */
   @Test public void numberOfRingTorusesTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertEquals("Number of objects: ", 3, 
         torusList.numberOfRingToruses());
   }
/**
   * A test to check totalDiameter method. 
   */
   @Test public void totalDiameter() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List", rtList1, 3);
      
      Assert.assertEquals("Total diameter test: ", 445.98, 
         torusList1.totalDiameter(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Total diameter test: ", 0, 
         torusList2.totalDiameter(), 0.001);
   }
   /**
   * A test to check totalSurfaceArea method. 
   */
   @Test public void totalSurfaceAreaTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List 1", rtList1, 3);
      
      Assert.assertEquals("Total surface area test: ", 186955.724, 
         torusList1.totalSurfaceArea(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Total volume test: ", 0, 
         torusList2.totalVolume(), 0.001);
   }
/**
   * A test to check totalVolume method. 
   */
   @Test public void totalVolumeTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List 1", rtList1, 3);
      
      Assert.assertEquals("Total volume test: ", 2868020.119, 
         torusList1.totalVolume(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Total volume test: ", 0, 
         torusList2.totalVolume(), 0.001);
   }
   /**
   * A test to check averageDiameter method. 
   */
   @Test public void averageDiameterTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List 1", rtList1, 3);
      
      Assert.assertEquals("Avg diameter test: ", 148.66, 
         torusList1.averageDiameter(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Avg diameter test: ", 0, 
         torusList2.averageDiameter(), 0.001);
   }
/**
   * A test to check averageSurfaceArea method. 
   */
   @Test public void averageSurfaceAreaTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List 1", rtList1, 3);
      
      Assert.assertEquals("Avg surface area test: ", 62318.575, 
         torusList1.averageSurfaceArea(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Avg surface area test: ", 0, 
         torusList2.averageSurfaceArea(), 0.001);
   }
/**
   * A test to check averageVolume method. 
   */
   @Test public void averageVolumeTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList1 = {ex1, ex2, ex3};
      RingTorusList torusList1 = new RingTorusList("Array List 1", rtList1, 3);
      
      Assert.assertEquals("Avg volume test: ", 956006.706, 
         torusList1.averageVolume(), 0.001);
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Avg volume test: ", 0, 
         torusList2.averageVolume(), 0.001);
   }
/**
   * A test to check toString method. 
   */
   @Test public void toStringTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertTrue("String test: ", 
         torusList.toString().contains("Summary"));
      
   }
/**
   * A test to check getList method. 
   */
   @Test public void getListTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertArrayEquals("Get Name test: ", rtList, torusList.getList());
   }
   /**
   * A test to check addRingTorus method. 
   */
   @Test public void addRingTorusTest()
   {
      RingTorus[] rtList1 = new RingTorus[4];
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorusList torusList = new RingTorusList("Array List", rtList1, 3);
   
      //Creating new list
      RingTorus ex4 = new RingTorus("Fourth Example", 12.8, 8.9);
      torusList.addRingTorus("Fourth Example", 12.8, 8.9);
      RingTorus[] rtList2 = torusList.getList();
      Assert.assertEquals(ex4, rtList1[3]);
   }

   /**
   * A test to check findRingTorus method. 
   */
   @Test public void findRingTorusTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertEquals("Find object test: ", ex1, 
         torusList.findRingTorus("Small Example"));
      Assert.assertEquals("Find object test: ", null, 
         null);   
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Find object test ", null, 
         torusList2.findRingTorus("Small Example"));
   }
   /**
   * A test to check deleteRingTorus method. 
   */
   @Test public void deleteRingTorusTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertEquals("Delete object test: ", ex1, 
         torusList.deleteRingTorus("Small Example"));
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Find object test ", null, 
         torusList2.deleteRingTorus("Small Example"));
   }
   /**
   * A test to check editRingTorus method. 
   */
   @Test public void editRingTorusTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertTrue("Edit object test: ",
         torusList.editRingTorus("Small Example", 10.5, 2.3));
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertFalse("Edit object test ", 
         torusList2.editRingTorus("Small Example", 10.5, 2.3));
   }
    /**
   * A test to check findRingTorusWithLargestVolume method. 
   */
   @Test public void findRingTorusWithLargestVolumeTest() {
      RingTorus ex1 = new RingTorus("Small Example", 9.5, 1.25);
      RingTorus ex2 = new RingTorus("Medium Example", 35.1, 10.4);
      RingTorus ex3 = new RingTorus("Large Example", 134.28, 32.46);
      RingTorus[] rtList = {ex1, ex2, ex3};
      RingTorusList torusList = new RingTorusList("Array List", rtList, 3);
      
      Assert.assertEquals("Largest volume test: ", ex3, 
         torusList.findRingTorusWithLargestVolume());
      Assert.assertEquals("Largest volume test: ", null,
         null);
   
      RingTorus[] rtList2 = {};
      RingTorusList torusList2 = new RingTorusList("Array List 2", rtList2, 0);
      Assert.assertEquals("Largest volume test ", null, 
         torusList2.findRingTorusWithLargestVolume());
   }


}

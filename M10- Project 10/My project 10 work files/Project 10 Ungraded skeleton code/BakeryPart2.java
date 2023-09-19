import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BakeryPart2 {
   public static void main(String[] args) throws FileNotFoundException { 
      BakedItemList bakedList = new BakedItemList();
      bakedList.readItemFile("Baked_item_data.csv");
      System.out.println(bakedList.generateReport() + "\n");
      System.out.println(bakedList.generateReportByClass() + "\n");
      System.out.println(bakedList.generateReportByPrice() + "\n");
      System.out.println(bakedList.generateReportByFlavor() + "\n");
      System.out.println(bakedList.generateExcludedRecordsReport() + "\n");
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   
   }
}

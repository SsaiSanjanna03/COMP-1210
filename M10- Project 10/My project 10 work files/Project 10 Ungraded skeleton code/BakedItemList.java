import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class BakedItemList {
   private String listName;
   private BakedItem[] itemList;
   private int itemCount;
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }
   public String getListName() {
      return listName;
   }
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }
   public BakedItem[] getItemList() {
      return itemList;
   }
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
   }
   public int getItemCount() {
      return itemCount;
   }
   public void setItemCount(int itemCountIn) {
      itemCount = itemCountIn;
   }
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }
   public int getExcludedCount() {
      return excludedCount;
   }
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }
   public static int getListCount() {
      return listCount;
   }
   public static void resetListCount() {
      listCount = 0;
      
   }
   public void readItemFile(String dataFileIn) 
      throws FileNotFoundException
   {
      Scanner dataScan = new Scanner(new File(dataFileIn));
      while (dataScan.hasNext()) {
         String line = dataScan.nextLine();
         Scanner lineScan = new Scanner(line).useDelimiter(",");
         char category = lineScan.next().charAt(0);
         String bakedName; //Name of the item baked
         String flavor; // Flavor of the item baked
         int quantity; // The quantity of the item baked
         String[] ingredients = new String[50];
         double crustCost;
         int layers;
         int tiers;
         int numIngs = 0;
         switch (category) {
            case 'C':
               bakedName = lineScan.next();
               flavor = lineScan.next();
               quantity = Integer.parseInt(lineScan.next());
               while (lineScan.hasNext())
               {
                  ingredients[numIngs] = lineScan.next();
                  numIngs++;
               }
               BakedItem Cookie = new Cookie(bakedName, flavor, quantity, ingredients[numIngs]);
               itemList[itemCount] = Cookie;
               itemCount++;
               break;
            case 'P':
               bakedName = lineScan.next();
               flavor = lineScan.next();
               quantity = Integer.parseInt(lineScan.next());
               crustCost = Double.parseDouble(lineScan.next());
               while (lineScan.hasNext())
               {
                  ingredients[numIngs] = lineScan.next();
                  numIngs++;
               }
               BakedItem Pie = new Pie(bakedName, flavor, quantity, crustCost, ingredients[numIngs]);
               itemList[itemCount] = Pie;
               itemCount++;
               break;
            case 'K':
               bakedName = lineScan.next();
               flavor = lineScan.next();
               quantity = Integer.parseInt(lineScan.next());
               layers = Integer.parseInt(lineScan.next());
               while (lineScan.hasNext())
               {
                  ingredients[numIngs] = lineScan.next();
                  numIngs++;
               }
               BakedItem Cake = new Cake(bakedName, flavor, quantity, layers, ingredients[numIngs]);
               itemList[itemCount] = Cake;
               itemCount++;
               break;
            case 'W':
               bakedName = lineScan.next();
               flavor = lineScan.next();
               quantity = Integer.parseInt(lineScan.next());
               layers = Integer.parseInt(lineScan.next());
               tiers = Integer.parseInt(lineScan.next());
               while (lineScan.hasNext())
               {
                  ingredients[numIngs] = lineScan.next();
                  numIngs++;
               }
               BakedItem WeddingCake = new WeddingCake(bakedName, flavor, quantity, layers, tiers, ingredients[numIngs]);
               itemList[itemCount] = WeddingCake;
               itemCount++;
               break;
            default:
               excludedRecords[excludedCount++] = "*** invalid category *** for line:\n" + line;
               excludedCount++;
               
         }
      }
   }
   public String generateReport() {
      String report = "";
      report += "\n---------------------------------------\n"; 
      report += "Report for Auburn's Best Bakery\n"; 
      report += "---------------------------------------";
      for (BakedItem item : itemList) {
         if (item != null) {
            report += "\n\n" + item;
         }
      }
      return report;
   }
   public String generateReportByClass() {
      BakedItem[] itemByClass = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemByClass);
      String reportByClass = "";
      reportByClass += "\n---------------------------------------\n"; 
      reportByClass += "Report for Auburn's Best Bakery (by Class)\n"; 
      reportByClass += "---------------------------------------";
      for (BakedItem item : itemList) {
         if (item != null) {
            reportByClass += "\n\n" + item;
         }
      }
      return reportByClass;
   }
   public String generateReportByPrice() {
      BakedItem[] itemByPrice = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemByPrice, new PriceComparator());
      String reportByPrice = "";
      reportByPrice += "\n---------------------------------------\n"; 
      reportByPrice += "Report for Auburn's Best Bakery (by Price)\n"; 
      reportByPrice += "---------------------------------------";
      for (BakedItem item : itemList) {
         if (item != null) {
            reportByPrice += "\n\n" + item;
         }
      }
      return reportByPrice;
   }
   public String generateReportByFlavor() {
      BakedItem[] itemByFlavor = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(itemByFlavor, new FlavorComparator());
      String reportByFlavor = "";
      reportByFlavor += "\n---------------------------------------\n"; 
      reportByFlavor += "Report for Auburn's Best Bakery (by Flavor)\n"; 
      reportByFlavor += "---------------------------------------";
      for (BakedItem item : itemList) {
         if (item != null) {
            reportByFlavor += "\n\n" + item;
         }
      }
      return reportByFlavor;
   }
   public String generateExcludedRecordsReport() {
      String excludedReport = "";
      excludedReport += "\n---------------------------------------\n"; 
      excludedReport += "Excluded Records Report\n"; 
      excludedReport += "---------------------------------------";
      for (String excludedItem : excludedRecords) {
         if (excludedItem != null) {
            excludedReport += "\n" + excludedItem;
         }
      }
      return excludedReport;
   }


}

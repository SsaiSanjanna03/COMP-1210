import java.util.Comparator;
public class PriceComparator implements Comparator<BakedItem> {
   public int compare(BakedItem b1, BakedItem b2) {
      if (b1.price() < b2.price()) {
         return -1;
      }
      else if (b1.price() > b2.price()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}

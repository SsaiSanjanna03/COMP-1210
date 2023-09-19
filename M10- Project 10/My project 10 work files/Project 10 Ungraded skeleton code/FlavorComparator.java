import java.util.Comparator;
public class FlavorComparator implements Comparator<BakedItem> {
   public int compare(BakedItem b1, BakedItem b2) {
      return b1.getFlavor().toUpperCase().compareTo(b1.getFlavor().toUpperCase());
   }
}
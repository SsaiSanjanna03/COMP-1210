public class WeddingCake extends Cake {
   private int tiers;
   public static final double BASE_RATE = 15.0;
   public WeddingCake(String bakedNameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(bakedNameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }
   public int getTiers() {
      return tiers;
   }
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
   public double price() {
      double price = (BASE_RATE * layers * tiers) * quantity;
      return price;
   }
}

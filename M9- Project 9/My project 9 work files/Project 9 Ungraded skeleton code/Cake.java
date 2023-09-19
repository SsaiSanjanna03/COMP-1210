public class Cake extends BakedItem {
   protected int layers;
   public static final double BASE_RATE = 8.0;
   public Cake(String bakedNameIn, String flavorIn, int quantityIn, 
      int layersIn, String...ingredientsIn) {
      super(bakedNameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }
   public int getLayers() {
      return layers;
   }
   public void setLayers(int layersIn) {
      layers = layersIn;
   }
   public double price() {
      double price = (BASE_RATE * layers) * quantity;
      return price;
   }
}

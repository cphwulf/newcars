import java.util.ArrayList;

public class Garage {
    private String name;
    private ArrayList<Bil> biler;

   public Garage(String name) {
       this.name = name;
       biler = new ArrayList<>();
   }

   public void addCar(Bil bil) {
       biler.add(bil);
   }

   public int getSizeOfGarage() {
       return biler.size();
   }
   public ArrayList<Bil> getBiler() {
       return this.biler;
   }
}

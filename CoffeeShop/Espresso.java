package CoffeeShop;

public class Espresso extends Drink {
    private int shot;

   public Espresso (String size){
       super("Espresso", 35, size);
       this.shot = 0;
   }
   public void addShot(int shot){
       this.shot =+ 1;
   }
   public int getShot(){
       return shot;
   }

    @Override
    public double caculateFinalPrice() {
        return getBasePrice() + (shot * 15);
    }

    public String toString(){
       return super.toString() +
               "\nAdd shot " + shot + "shot";
    }
}

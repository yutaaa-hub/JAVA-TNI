package CoffeeShop;

public class Frappuccino extends Drink{

    private boolean whipped;

    public Frappuccino(String size,boolean whipped) {
        super("Frappuccino", 40, size);
        this.whipped = whipped;
    }

    @Override
    public double caculateFinalPrice() {
        double whipped_price =whipped ? 15 : 0;

        return getBasePrice() + whipped_price + getSizeExtra();
    }
    public String toString(){
return "Total price = " + caculateFinalPrice() + "Baht";
    }
}

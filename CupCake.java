public class CupCake extends Bakery{
    private int piece;

    public CupCake(int piece, String flavor,double price){
        super(flavor, price);
        this.piece = piece;
    }
    public boolean isPackingBox(){
        return this.piece >= 6;
    }
    public int getBoxnumber(){
        if (isPackingBox()){
            return this.piece / 6;
        }
        return 0;
    }
    public int getBagnumber(){
        return this.piece % 6;
    }
    @Override
    public int getPackingCost(){
        if (isPackingBox())
            return getBoxnumber() * super.getPackingCost();
        return 0;
    }
    @Override
    public double caculateTotalPrice(){
        return (getUnitPrice() * this.piece) + getPackingCost() + (getBagnumber() * 8.5);
    }
    public String toString() {
        return super.toString() + "\n Cupcake (" + getFlavor() + ") with" + (isPackingBox() ? getBoxnumber() + " Box " : " ") + getBagnumber() + "Bag" + "\nTotal price of Cupcake = " + (getUnitPrice() * this.piece);
    }
}

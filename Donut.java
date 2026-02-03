import javax.swing.*;

public class Donut extends Bakery {
    private int piece;
    private double Donutprice;
    private int FreeDonut;


    public Donut(int piece, String flavor, double Donutprice) {
        super(flavor, piece);
        this.Donutprice = Donutprice;
    }

    public boolean PackingBox() {
        return this.piece >= 6;
    }

    public int Boxnumber() {
        if (PackingBox()) {
            return this.piece / 6;
        }
        return 0;
    }

    public int getBagnumber() {
        return this.piece % 6;
    }

    public int FreeDonut() {
        if (piece >= 6) {
            FreeDonut += 6;
            return piece += 6;
        }
        return 0;
    }
    @Override
    public double caculateTotalPrice(){
        return ((this.Donutprice * this.piece) + getPackingCost() + getBagnumber());
    }
    public String toString(){
        return super.toString() + "\n Donut (" + getFlavor() + ") with" + (Boxnumber() + " Box ") + getBagnumber() + "Bag" +"You got Free Donut " + FreeDonut + "piece" + "\nTotal price of Donut = " + caculateTotalPrice() ;
    }
}


public class BirthdayCake extends Bakery {
    private String message;
    private double pound;

    public BirthdayCake (String message,double pound, String flavor, double unitPrice){
        super(flavor,unitPrice);
        this.message = message;
        this.pound = pound;
    }
    public String getMessage(){
        return this.message;
    }
    public void changeMessage(String newMessage){
        this.message = newMessage;
    }

    @Override
    public int getPackingCost() {
        if(this.pound >= 3)
            return 10;
        return super.getPackingCost();
    }
    @Override
    public double caculateTotalPrice(){
        return getUnitPrice() * this.pound + getPackingCost();
    }

    public String toString(){
        return super.toString() + "\n" + getFlavor() + "Birthday cake (message =" + this.message + ")" + "\nTotal price of Birthday Cake = " + (caculateTotalPrice());
    }
}

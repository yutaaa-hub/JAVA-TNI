public class Product {
    String name;
    double price = 0;
    int quantity = 0;

    public void addStock(int amount){
        if(amount > 0)
            System.out.println("Added " + amount + " items to stock.");
    }

    public void sell (int amount){
        if (amount <= quantity){
            quantity -= amount;
            System.out.println("Sold " + amount + " items.");
        }
    }

    public void changePrice (double newprice){
        if(newprice > 0){
            System.out.print("Change price to " + newprice + "baht.");
        }
    }

    public double stockValue(){
return price * quantity;
    }

        public void showInfo(){
        System.out.println("Name : " + name);
            System.out.println("Price : " + price + "baht / item");
            System.out.println("Stock : " + quantity);
            System.out.println("Stock value : " + stockValue() + "Baht");

        }


}

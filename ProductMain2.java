import java.util.Scanner;
public class ProductMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Product product1 = new Product();
product1.name = "pen";
product1.price = 10.5;
product1.quantity = 50;

Product product2 = new Product();
        product2.name = "Notebooks";
        product2.price = 25.75;
        product2.quantity = 20;

        System.out.println("Welcome to Minishop");
        System.out.println("-----------------------------");
        System.out.println("Press [1] to buy pen");
        System.out.println("Press [2] to buy Notebook");
        System.out.println("Enter a number");
int num = scanner.nextInt();
while (num > 2 || 1 < num){
    System.out.println("Invalid number! Enter a number again");
num = scanner.nextInt();
}
if(num == 1){
product1.showInfo();
    System.out.println("---------------------");
    System.out.println("How many " + product1.name + "do you want to buy");
product1.sell(scanner.nextInt());
    System.out.println("---------------------");
    product1.showInfo();
}
else{
    product2.showInfo();
    System.out.println("---------------------");
    System.out.println("How many " + product2.name + "do you want to buy");
    product1.sell(scanner.nextInt());
    System.out.println("---------------------");
    product2.showInfo();
}
    }
}

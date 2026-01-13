import javax.swing.*;
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Welcome to Product stock system");

        Product p1 = new Product();
        p1.name = JOptionPane.showInputDialog(null,"Enter product name: ");


        p1.price = Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item"));

        p1.quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter product stock"));
p1.showInfo();
System.out.println();
int addstock = JOptionPane.showConfirmDialog(null,"Do you want to add more item?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);

if (addstock == JOptionPane.YES_OPTION){
    p1.addStock(Integer.parseInt(JOptionPane.showInputDialog(null,"How many items to add in stock?")));}
System.out.println();
int changePrice = JOptionPane.showConfirmDialog(null,"Do you want to change price?","Select an option",JOptionPane.YES_NO_CANCEL_OPTION);
if (changePrice == JOptionPane.YES_OPTION){
p1.changePrice(Integer.parseInt(JOptionPane.showInputDialog("How much is the new price of item?")));}
System.out.println();
p1.showInfo();

    }
}

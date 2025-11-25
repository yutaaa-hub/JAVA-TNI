import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {
final int buffeprice = 299;
        DecimalFormat frm = new DecimalFormat("#,###.00");
int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));
double net = buffeprice * customer + (buffeprice * customer * 7.00/100);
int discount = Integer.parseInt(JOptionPane.showInputDialog("Price with NET is: " + frm.format(net) + "Baht \nHow much discount (%) on your coupon?"));
double totaldiscount = net - (net * discount / 100);
int paid = Integer.parseInt(JOptionPane.showInputDialog("Total price is " + frm.format(totaldiscount) + "baht. \n Enter the amount the customer paid: "));

double changed = paid -totaldiscount;
JOptionPane.showMessageDialog(null, "Total price is " + frm.format(buffeprice) + "baht. \n Customer paid" + frm.format(paid) + "Baht. \nGet changed " + frm.format(changed) + "baht.");
    }
}

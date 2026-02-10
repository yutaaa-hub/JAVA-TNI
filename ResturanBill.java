package Customer;

import javax.swing.*;

public class ResturanBill {
    public static void main(String[] args){
        String customer_name = JOptionPane.showInputDialog("Enter customers name:");

        double bill_amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter customer's bill:"));

        int is_member = JOptionPane.showConfirmDialog(null, "Do you have a member card?", "member",JOptionPane.YES_NO_OPTION);

        if (is_member == JOptionPane.YES_NO_OPTION) {
        String member_level = JOptionPane.showInputDialog("Enter a level (Gold / Premium):");
        Member bill = new Member(customer_name, bill_amount, member_level);
        JOptionPane.showMessageDialog(null, bill);
        }else{
            Regular bill = new Regular(customer_name, bill_amount);
            JOptionPane.showMessageDialog(null, bill);
        }
    }
}

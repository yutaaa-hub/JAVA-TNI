import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab302 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###.0");
        String name = JOptionPane.showInputDialog(null,"Input your name: ");
        int height = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your height(cm.): "));
        int male = JOptionPane.showConfirmDialog(null,"Are your biological gender is male?","Gender",JOptionPane.YES_NO_OPTION);
        double Femaleheight = height - 110;
        double Maleheight = height - 100;
        if (male == JOptionPane.YES_OPTION)
        {

            JOptionPane.showMessageDialog(null,"Hello,MR."+ name + "\nIf your height is "+ height + "\nYour weight should be "+ Maleheight +"Kg.");
        }
        else
        {
            int female = JOptionPane.showConfirmDialog(null,"Are your biological gender is female?","Gender",JOptionPane.YES_NO_OPTION);
            if (female == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null,"Hello,MR."+ name + "\nIf your height is "+ height + "\nYour weight should be "+ Maleheight +"Kg.");

            if (female == JOptionPane.NO_OPTION)

                    JOptionPane.showMessageDialog(null,"You can use BMI to measure your weight and height.");
        }






    }
}

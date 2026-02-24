import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Input an integer:"));
break;
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage(), "ErrorMessage", JOptionPane.ERROR_MESSAGE);
            }
        }
            JOptionPane.showMessageDialog(null, "Inputted number = " + number);
        }
    }

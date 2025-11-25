import javax.swing.*;

public class Lab205 {
    public static void main(String[] args){
        int inputmin = Integer.parseInt(JOptionPane.showInputDialog("Input minutes: "));
    int hour = inputmin / 60;
    int minutes = inputmin % 60;
    JOptionPane.showMessageDialog(null, inputmin + "minutes is a" + hour + "hour" + minutes + "minutes");

    }
}

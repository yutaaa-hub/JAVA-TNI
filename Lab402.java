import javax.swing.*;
public class Lab402 {
    public static void main(String[] args) {
String studentid =JOptionPane.showInputDialog("Show student ID: ");
while(studentid.length()!=10)
{
studentid =JOptionPane.showInputDialog("Show student ID: ");
}
switch(Integer.parseInt(studentid.substring(4,5)))
{
    case 1: JOptionPane.showMessageDialog(null,"Student-ID" + studentid + "\nMayor: Information Technology(IT)");
        break;
    case 2: JOptionPane.showMessageDialog(null,"Student-ID" + studentid + "\nMayor: Multumedia Technology(MT)");
        break;
    case 3: JOptionPane.showMessageDialog(null,"Student-ID" + studentid + "\nMayor: Buisness Information Technology(BI)");
        break;
    case 4: JOptionPane.showMessageDialog(null,"Student-ID" + studentid + "\nMayor: Digital technology in Mass Communication(DC)");
        break;
    case 5: JOptionPane.showMessageDialog(null,"Student-ID" + studentid + "\nMayor: Data science and data analytics(DS)");
        break;
    default: JOptionPane.showMessageDialog(null,"Cannot find mayor");
}

    }
}

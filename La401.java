import javax.swing.*;
public class La401 {
    public static void main(String[] args) {
String name = JOptionPane.showInputDialog("Enter your full name:");
while(true)
{
int index = name.indexOf(" ");
if (index > 0 && index < name.length() -1)
{
    String first = name.substring(0,index);
    String last = name.substring(index + 1);
    if(!last.contains(" ") && !first.equals(("")) && !last.equals(" "))
    {
String totalfirst = first.substring(0,1).toUpperCase() +first.substring(1).toLowerCase();
String totallast = last.toUpperCase();
JOptionPane.showMessageDialog(null,"Welcome, " + totalfirst + "" + totallast);
break;
    }
}
name = JOptionPane.showInputDialog("Enter your full name:");
}
    }
}

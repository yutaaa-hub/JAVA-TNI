import java.util.Scanner;
public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input hour : ");
        int hour = scan.nextInt();
        System.out.print("Input minute : ");
        int minute = scan.nextInt();
        int totalhour = hour * 60;
        int totalminutes = totalhour + minute;
        System.out.print("Total time is " + totalminutes + " minutes");

    }
}

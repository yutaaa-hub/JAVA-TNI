import java.util.Scanner;
public class Lab303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for X coordinate: ");
        int x = sc.nextInt();
        System.out.println("Enter value for Y coordinate: ");
        int y = sc.nextInt();

        String position = "";

        if (x == 0 && y == 0)
        {
            position = "Origin";
        }
        else if (x > 0 && y > 0)
        {
            position = "First quadradnt";
        }
        else if (x > 0 && y > 0)
        {
            position = "Second quadradnt";
        }
        else if (x < 0 && y > 0)
        {
            position = "Third quadradnt";
        }
        else if (x > 0 && y < 0)
        {
            position = "Forth quadradnt";
        }

        System.out.println("The coordinate point (" + x +","+ y + ") lies in the " + position);
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean is_loop = true;

        while(is_loop) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                is_loop = false;
            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Invalid data type!!");
            }
            catch (Exception error){
                scanner.next();
                System.out.println("Invalid!! ");
            }
        }
        System.out.println("You inputted number = " + number);
    }
}

import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Birthday cake's details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor,350   );

        System.out.println(order1);

        System.out.println("Cupcakes details:");
        System.out.print("Enter a flavor: ");
        String scn = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, flavor,65);

        System.out.println(order2);*/

        //System.out.println("Total price =" + (order1.getUnitPrice() * pound + order2.getUnitPrice() * piece));

        System.out.println(" ");
        System.out.println("Donuts details: ");
        System.out.print("Enter a flavor: ");
       String flavor = scanner.next();
        System.out.print("How many piece: ");
        int piece = scanner.nextInt();

        Donut order3 = new Donut(piece, flavor,100);

System.out.print("Total price =" + order3.getUnitPrice() * piece);
        //System.out.println("Total price =" + (order1.getUnitPrice() * pound + order2.getUnitPrice() * piece));
    }
}

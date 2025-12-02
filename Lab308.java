import java.util.Scanner;
public class Lab308 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int max = 0, min=0;

System.out.println("How many number to input: ");
int input = sc.nextInt();

        for(int i=1; i<= input; i++)
            System.out.println("Enter number "+ i +": ");
int number = sc.nextInt();
if(number>max)
{
    number = max;
}
if (number < min)
{
    number = min;;
}

System.out.println("Maximum =");

    }

}

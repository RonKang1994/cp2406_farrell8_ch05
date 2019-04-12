import java.util.Scanner;

// Asks the user to enter an Integer and check if it is even or odd
public class EvenOdd
{
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        int check_num = 0;
        // Input the Number
        System.out.print("Enter a number ");
        check_num = input.nextInt();
        // Checks if it is Even or Odd
        if ((check_num % 2) == 1) {
            System.out.println("This is an Odd Number");
        }
        else {
            System.out.println("This is an Even Number");
        }
    }
}

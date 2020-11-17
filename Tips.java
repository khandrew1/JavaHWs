import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the dinner amount (up to 2 decimal places)\n>"); // asks user to enter dinner amount

        double amount =  scan.nextDouble(); // stores dinner amount in double variable

        System.out.print("Please enter the satisfaction level (1-3)\n>"); // asks user for satisfaction level

        int satisfactionLevel = scan.nextInt(); // stores satisfaction level in an int

        double tips = 0; // tips declared outside if statements or else Java gets mad >:(

        if (satisfactionLevel == 1) { // checks if satisfaction level is 1
            System.out.println("Customer is totally satisfied.");
            tips = (int) ((amount * 0.2) * 100 + 0.5) / 100.0; // calculates tip to be 20% of dinner amount
        } else if (satisfactionLevel == 2) { // checks if satisfaction level is 2
            System.out.println("Customer is satisfied.");
            tips = (int) ((amount * 0.15) * 100 + 0.5) / 100.0; // calculates tip to be 15% of dinner amount
        } else if (satisfactionLevel == 3) { // checks if satisfaction level is 3
            System.out.println("Customer is dissatisfied.");
            tips = (int) ((amount * 0.1) * 100 + 0.5) / 100.0; // calculates tip to be 10% of dinner amount
        }

        System.out.println("Dinner amount = $" + amount); // prints dinner amount
        System.out.println("Tip amount = $" + tips); // prints tips amount
        System.out.println("Total amount = $" + (amount + tips)); // prints total amount

        scan.close(); // prevents resource leak

    }
}
// Change.java - Andrew Khadder
// - program to calculate change in coins

import java.util.Scanner;

public class Change {
    public static void main(String arg[]) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Please Enter the Cost of the Item:\n>");
    double cost = scan.nextDouble();

    System.out.print("Please Enter the Amount Paid:\n>");
    double amount = scan.nextDouble();

    double change = Math.round((amount - cost) * 100.0) / 100.0;

    System.out.println("Amount owed: " + change);

    int quarters = (int) (change / 0.25);
    int dimes  = (int) ((change % 0.25) / 0.1);
    int nickels = (int) (((change % 0.25) - (dimes * 0.1)) / 0.05);
    int pennies = (int) (Math.round((((change % 0.1) / 0.01)) * 100.0) / 100.0);

    System.out.print("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickels + "\nPennies: " + pennies);

    scan.close();

    }
}
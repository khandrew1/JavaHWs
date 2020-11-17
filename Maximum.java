// Maximum.java - Andrew Khadder 

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer (enter 666 to stop).");

        int input = 0;
        int max = 0;

        while (input != 666) { // if the input is 666, exit the loop.
            if (input > max) { // checks if input is greater than the current max number
                max = input; // if the input is greater, it sets a new max
            }
            System.out.print(">");
            input = scan.nextInt(); // asks for a new input at the end of the loop
        }

        System.out.println("The maximum number is " + max + ".");

        scan.close();

    }
}
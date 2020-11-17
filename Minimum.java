import java.util.Scanner;

public class Minimum {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter 5 numbers:\n>");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int temp1;
        int temp2;
        int temp3;
        int min;

        if (num1 <= num2) {
            temp1 = num1;
        } else {
            temp1 = num2;
        }

        if (num3 <= num4) {
            temp2 = num3;
        } else {
            temp2 = num4;
        }

        if (temp2 <= temp1) {
            temp3 = temp2;
        } else {
            temp3 = temp1;
        }

        if (temp3 <= num5) {
            min = temp3;
        } else {
            min = num5;
        }

        System.out.println("The minimum number is " + min);

        scan.close();
    }
}